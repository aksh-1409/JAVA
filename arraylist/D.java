import java.util.ArrayList;
import java.util.Iterator;

class D{

    public static void main(String [] args){
        ArrayList<String> list = new ArrayList();
        list.add("rahul");
        list.add("rohan");
        list.add("mohit");
        list.add("adi");
        list.add("om");
        System.out.println(list);
        Iterator<String> it = list.iterator();

        
           for(int i=1;i<list.size();i++){
            list.set(i,"hello");
           }
     
        
           System.out.println(list);
    }
}