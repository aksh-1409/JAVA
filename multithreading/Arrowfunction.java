class Mythread extends Thread {
    public void run(){
        for(int i=0;i<=100;i++){
            System.out.println(getName() + " is running with priority");
            Thread.yield();
        }
    }
}


public class Arrowfunction{

    public static void main(String[] args){
        Mythread t1 = new Mythread();

        Mythread t2 =  new Mythread();

        t1.setName("phele");
        t2.setName("doosra");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
    }
}