interface client1{

    void method1();
    void method2();
}

interface client2{

    void method1();
    void method2();
}

class dev implements client1, client2{

    public void method1(){
        System.out.println("Method 1");
    }

    public void method2(){
        System.out.println("Method 2");
    }

      
    
    public static void main(String[] args) {
    
        dev obj = new dev();
        obj.method1();
        obj.method2();
       

    }
}