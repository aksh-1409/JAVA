import java.util.ArrayList;
import java.util.ListIterator;

class B{

    public static void main(String [] args){
        ArrayList<String> list = new ArrayList();
        list.add("rahul");
        list.add("rohan");
        list.add("mohit");
        list.add("adi");
        list.add("om");
        System.out.println(list);
        ListIterator<String> it = list.listIterator();

        while(it.hasNext()){
            String nextData = it.next();
            System.out.println(nextData);
        }
         System.out.println("~~~~~~~~~~~~alg hu mai~~~~~~~~~~~~~~~");
         while(it.hasPrevious()){
            String previousData = it.previous();
            System.out.println(previousData);
         }
    }
}