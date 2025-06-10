import java.util.*;
import java.util.stream.*;

class question3{

    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
   
        int sumOdd = list.stream()
                      .filter(n->n%2!=0)
                      .reduce(0,(a, b)-> a+b);

            System.out.println(sumOdd);                         
        
        }
}