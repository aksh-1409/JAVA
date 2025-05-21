interface Shape{
   void Area();
}

class Circle implements Shape{
    public void Area(){
        System.out.println("Area of Circle: " + 3.14*5*5);
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.Area();
    }
}