class MyRunnable implements Runnable{
    public void run(){
        System.out.println("Run()");
    }
}

class UsingRunnable{
    public static void main(String[] args){
        MyRunnable r = new MyRunnable();

        Thread x = new Thread(r);

        x.start();
        System.out.println("main");
        
    }
}