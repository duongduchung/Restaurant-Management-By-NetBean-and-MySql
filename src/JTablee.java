
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.JScrollPane;
import javax.swing.JTable ;
import javax.swing.table.DefaultTableModel;

public class JTablee extends javax.swing.JFrame {

    public JTablee() {
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement pat = null;
        java.sql.Statement stm = null;
        String s;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantproject", "root", "root");
            stm = conn.createStatement();
            s = "select * from receipt";
            rs = stm.executeQuery(s);
            ResultSetMetaData rsmt = rs.getMetaData();
            int c = rsmt.getColumnCount();
            Vector column = new Vector(c);
            for (int i = 1; i <= c; i++) {
                column.add(rsmt.getColumnName(i));

            }

            Vector data = new Vector();
            Vector row = new Vector();
            while (rs.next()) {
                row = new Vector(c);
                for (int i = 1; i <= c; i++) {
                    row.add(rs.getString(i));
                }
                data.add(row);
            }
            DefaultTableModel model = new DefaultTableModel(data, column);
            JFrame frame = new JFrame();
            frame.setSize(1200, 400);
            frame.setLocationRelativeTo(null);
            JPanel panel = new javax.swing.JPanel();
            JTable table = new javax.swing.JTable(model);
            JScrollPane jsp = new JScrollPane(table);
            panel.setLayout(new BorderLayout());
            panel.add(jsp, BorderLayout.CENTER);

            JPanel panel1 = new javax.swing.JPanel();
            JButton deleteBtn = new javax.swing.JButton("Delete");
            JButton editBtn = new javax.swing.JButton("Edit");
            panel1.add(deleteBtn);
           // panel1.add(editBtn);

            frame.add(panel1, BorderLayout.SOUTH);
            frame.add(panel, BorderLayout.CENTER);

            deleteBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    DefaultTableModel model = new DefaultTableModel(data, column);

                    try {

                        Connection conn = null;
                        PreparedStatement pat = null;
                        java.sql.Statement stm = null;
                        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantproject", "root", "root");

                      /*  int selectedrow = 0;                        
                        selectedrow = table.getSelectedRow();
                        Vector st = (Vector) data.elementAt(selectedrow);
                       
                        String sql = "Delete from receipt where Chicken = \"" + st.elementAt(0) + "'\"";
                        stm.executeUpdate(sql);
                        data.remove(selectedrow);
                        model.fireTableDataChanged();*/
                      
                        /*  String sql ="DELETE FROM receipt where Chicken=?  ";
                            double Chicken=0;
                            pat=conn.prepareStatement(sql);
                            pat.setDouble(1, Chicken);
                            int rows=  pat.executeUpdate();  */
                        
                        String sql = ("delete from receipt where Chicken = ? " );
                        pat = conn.prepareStatement(sql);
                        int selectedrow = 0;                        
                        selectedrow = table.getSelectedRow();
                        pat.setString(1,String.valueOf(model.getValueAt(table.getSelectedRow(), 0)));
                        pat.executeUpdate();
                                             

                        conn.close();
                    } catch (Exception ee) {
                        JOptionPane.showMessageDialog(null, ee);
                    }
                }
            });
            frame.setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erorr");

        }

    }

}
