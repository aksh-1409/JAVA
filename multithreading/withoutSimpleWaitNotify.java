class withoutSimpleWaitNotify{

    boolean isnotiified = false;

    public synchronized void sendsignal(){
        isnotiified = true;
        System.out.println("Sending Signal to the Consumer");
      //  notify();
    }


    public synchronized void waiting(){
        while(!isnotiified){
           // try{
            System.out.println("Waiting for signal");
           // wait();
            //}//catch(InterruptedException e){

            //}
        }
        System.out.println("Mil gya signal");
    }
}

class withoutthread{
    public static void main(String[] args){

        withoutSimpleWaitNotify obj = new withoutSimpleWaitNotify();

        Thread producer = new Thread(()->{
            obj.sendsignal();
        });

        Thread consumer = new Thread(()->{
            try{
                obj.waiting();
                Thread.sleep(1000);
            }catch(InterruptedException e ){

            }
        });

        consumer.start();
        producer.start();
        

        }

    }
