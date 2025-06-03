class MyThread extends Thread {

    public void run(){
        System.out.println("Hello");
    }
}

class basic {
    public static void main(String[] args){
    MyThread x = new MyThread();

    x.setName("Mythread");
    x.start();

    System.out.println("Hii");
    }
}