import  java.util.*;
import java.util.stream.*;

class question1{
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
   
        List<Integer> evenList = list.stream()
                                     .filter(n->n%2==0)
                                     .map(n->n*n)
                                     .collect(Collectors.toList());

            System.out.println(evenList);                         
            }
}