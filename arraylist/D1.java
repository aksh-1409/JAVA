import java.util.ArrayList;
import java.util.ListIterator;

class D1{

    public static void main(String [] args){
        ArrayList<String> list = new ArrayList();
        list.add("rahul");
        list.add("rohan");
        list.add("mohit");
        list.add("adi");
        list.add("om");
        System.out.println(list);
        ListIterator<String> it = list.listIterator();
        int count=0;
        while(it.hasNext()){
            String data = it.next();
            if(count!=list.size() && count>0){
                it.set("hello");
            }
            count++;
            
        }
        System.out.println(list);
    }
}