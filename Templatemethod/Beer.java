class Beer extends Beverage{
      @Override
       protected void pour(int qty){
        System.out.println("Pour" +qty+ "ml of Beer");
    }
    @Override
protected void addCondiment() {
    System.out.println("Nothing");
}
 @Override
    public void templateMethod(int qty) {
        pour(qty);               
        addCondiment();         
        serve(qty);             
    }
    
}