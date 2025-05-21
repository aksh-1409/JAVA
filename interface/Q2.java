interface A{

    void display();
    
}

interface B{

    void display();
   
}

class Demo implements A, B{

    public void display(){
        System.out.println("Display method");
    }

   
      
    
    public static void main(String[] args) {

        Demo obj = new Demo();
        obj.display();

    }
}