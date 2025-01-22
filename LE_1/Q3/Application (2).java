

public class Application {

    public static class Mother {
        

        public String show() {
            return "Hello Mother";
        }
    }

    public static class Child extends Mother {
         public static String show() {
            return "Hello I am child";
        }
       
    }

    public static void main(String[] args) {
        
         Mother m1=new Child ();
         System.out.println(m1.show());
        
        
    }
}
