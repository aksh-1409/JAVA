import java.util.*;
import java.util.stream.*;

class map{

    public static void main(String[] args){
        List<Integer> list = Arrays.asList(5, 10, 15, 20, 25);
   
        List<Integer> evenList = list.stream()
                                     .map(n->n*5)
                                     .collect(Collectors.toList());

            System.out.println(evenList);                         
            }
}