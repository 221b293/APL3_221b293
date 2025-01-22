

public class Application {

    // public static class Mother {
    //     int x;

    //     public void show() {
    //         System.out.println(x);
    //     }
    // }

    // public static class Child extends Mother {
       
    // }

    public static void main(String[] args) {
        Mother obj = new Mother();
        obj.show();

        Child ch = new Child();
        ch.show();
    }
}
