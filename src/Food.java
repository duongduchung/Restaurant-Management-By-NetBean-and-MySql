
public class Food {
    double chicken,hamburger,bacon,drink,costOfDrink,costOfTotal,costOfSub,costOfTax,costOfDelivery;
    
    public Food(double chicken,double hamburger,double bacon,double costOfDrink,double costOfTotal,
            double costOfTax,double costOfDelivery,double costOfSub){
        this.chicken=chicken;
        this.hamburger=hamburger;
        this.bacon=bacon;       
        this.costOfDrink=costOfDrink;
        this.costOfDelivery=costOfDelivery;
        this.costOfSub=costOfSub;
        this.costOfTotal=costOfTotal;
        this.costOfTax=costOfTax;
    }

    public String display(){
        return    
                 Double.toString(getChicken()) +" Chickens:            " + Double.toString(getChicken()* 5.5)+" USD"+" \n\n"
                +Double.toString(getHamburger()) +" Hamburgers:      " + Double.toString(getHamburger()* 3.5)+" USD"+" \n\n"
                +Double.toString(getBacon()) +" Bacon:               " + Double.toString(getBacon()* 6.5)+" USD"+" \n\n"
                +" drink    :             "+ Double.toString(getCostOfDrink())+" USD" +"\n\n"
                + "Cost of Delivery:        "+ Double.toString(getCostOfDelivery())+" USD" +"\n\n"
                + "Cost of Tax:                "+ Double.toString(getCostOfTax())+" USD" +"\n\n"
                + "Cost of Sub:              "+ Double.toString(getCostOfSub())+" USD" +"\n\n"
                + "---------------------------------------------\n\n"
                + "Total :                         "+ Double.toString(getCostOfTotal())+" USD "+"\n\n"
                + "------------------THANK YOU------------------\n\n" ;
    }
    
    public double getChicken() {
        return chicken;
    }

    public void setChicken(double chicken) {
        this.chicken = chicken;
    }

    public double getHamburger() {
        return hamburger;
    }

    public void setHamburger(double hamburger) {
        this.hamburger = hamburger;
    }

    public double getBacon() {
        return bacon;
    }

    public void setBacon(double bacon) {
        this.bacon = bacon;
    }

    public double getDrink() {
        return drink;
    }

    public void setDrink(double drink) {
        this.drink = drink;
    }

    public double getCostOfDrink() {
        return costOfDrink;
    }

    public void setCostOfDrink(double costOfDrink) {
        this.costOfDrink = costOfDrink;
    }

    public double getCostOfTotal() {
        return costOfTotal;
    }

    public void setCostOfTotal(double costOfTotal) {
        this.costOfTotal = costOfTotal;
    }

    public double getCostOfSub() {
        return costOfSub;
    }

    public void setCostOfSub(double costOfSub) {
        this.costOfSub = costOfSub;
    }

    public double getCostOfTax() {
        return costOfTax;
    }

    public void setCostOfTax(double costOfTax) {
        this.costOfTax = costOfTax;
    }

    public double getCostOfDelivery() {
        return costOfDelivery;
    }

    public void setCostOfDelivery(double costOfDelivery) {
        this.costOfDelivery = costOfDelivery;
    }
    
}
