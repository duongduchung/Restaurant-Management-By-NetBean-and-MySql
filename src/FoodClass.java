/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class FoodClass {
    private double Chicken,Hamburger,Bacon;
    private double CostOfDrink;
    private double CostOfMeal;
    private double CostOfDelivery;
    private double CostOfTax;
    private double CostOfTotal;
    private double CostOfSubTotal;
    
     public FoodClass(){
        Chicken=0;
        Hamburger=0;
        Bacon=0;
        CostOfDelivery=0;
        CostOfDrink=0;
        CostOfMeal=0;
        CostOfSubTotal=0;
        CostOfTax=0;
        CostOfTotal=0;
    }
    
     public double CostOfMeal(){
         CostOfMeal= (Chicken*5.5 + Hamburger*3.5 + Bacon*6.5 );
         return CostOfMeal;
}
     
     public double getChicken() {
        return Chicken;
    }

    public void setChicken(double Chicken) {
        this.Chicken = Chicken;
    }

    public double getHamburger() {
        return Hamburger;
    }

    public void setHamburger(double Hamburger) {
        this.Hamburger = Hamburger;
    }

    public double getBacon() {
        return Bacon;
    }

    public void setBacon(double Bacon) {
        this.Bacon = Bacon;
    }    

    public double getCostOfDrink() {
        return CostOfDrink;
    }

    public void setCostOfDrink(double CostOfDrink) {
        this.CostOfDrink = CostOfDrink;
    }

    public double getCostOfMeal() {
        return CostOfMeal;
    }

    public void setCostOfMeal(double CostOfMeal) {
        this.CostOfMeal = CostOfMeal;
    }

    public double getCostOfDelivery() {
        return CostOfDelivery;
    }

    public void setCostOfDelivery(double CostOfDelivery) {
        this.CostOfDelivery = CostOfDelivery;
    }

    public double getCostOfTax() {
        return CostOfTax;
    }

    public void setCostOfTax(double CostOfTax) {
        this.CostOfTax = CostOfTax;
    }

    public double getCostOfTotal() {
        return CostOfTotal;
    }

    public void setCostOfTotal(double CostOfTotal) {
        this.CostOfTotal = CostOfTotal;
    }

    public double getCostOfSubTotal() {
        return CostOfSubTotal;
    }

    public void setCostOfSubTotal(double CostOfSubTotal) {
        this.CostOfSubTotal = CostOfSubTotal;
    }
   

    
   
}
