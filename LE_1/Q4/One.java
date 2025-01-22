class One{
     One(int x) {
        System.out.println("constructor of class 1 is called: "+ x);
    }
    
     static class Two extends One{
    Two() {
        super(10); 
        System.out.println("constructor of class 2 is called");
    }
    }
    public static void main(String []args){
         One obj = new One(5); 
        Two obj2 = new Two();
    }
}


