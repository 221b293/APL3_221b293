class Rum extends Beverage{
    
    private void pour(){
        System.out.println("Pour 30 ml of rum");
    }
    
    @Override
protected void addCondiment() {
    System.out.println("Add 10 ml of Soda");
}

    @Override
protected void stir() {
    System.out.println("Stir the Rum for 40 seconds");
}

    
  
   
    
}