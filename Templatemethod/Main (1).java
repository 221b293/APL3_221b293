public class Main{
    public static void main(String [] args){
         
          System.out.println("Opted Beer");
         Beverage beer = new Beer();
          beer.templateMethod(35);
          
           System.out.println();
          System.out.println("Opted Rum");
           Beverage  rum = new Rum();
           rum.templateMethod(200);
        
    }
}
