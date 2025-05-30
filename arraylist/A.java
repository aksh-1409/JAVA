import java.util.ArrayList;
import java.util.Iterator;

class Hello{

    public static void main(String [] args){
        ArrayList<String> list = new ArrayList();
        list.add("rahul");
        list.add("rohan");
        list.add("mohit");
        list.add("adi");
        list.add("om");
        System.out.println(list);
        Iterator<String> it = list.iterator();

        while(it.hasNext()){
            String data = it.next();
            if(data.startsWith("r")){
                it.remove();
            }
     
        }
           System.out.println(list);
    }
}