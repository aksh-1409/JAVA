interface Vehicle{

    void start();
}

class Car implements Vehicle{

    public void start(){
        System.out.println("Vehicle is starting");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
    }
}