abstract class Beverage {
    protected void pour(int qty) {
        System.out.println("Pour " + qty + " ml of beverage into a glass");
    }

    abstract void addCondiment(); 

    protected void stir() {
        System.out.println("Stir the beverage.");
    }

   protected void serve(int qty) {
        System.out.println("Serve " + qty + " ml of beverage into a glass");
    }

    public void templateMethod(int qty) {
        pour(qty);              
        addCondiment();          
        stir();
        serve(qty);            
    }
}