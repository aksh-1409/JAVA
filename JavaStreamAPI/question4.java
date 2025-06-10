import  java.util.*;
import java.util.stream.*;

class question4{
    public static void main(String[] args){
        List<String> list = Arrays.asList("Ram", "Shyam", "Om", "Sita");
   
        List<Integer> result = list.stream()
                                   
                                     .map(String::length)
                                     .collect(Collectors.toList());

            System.out.println(result);                         
            }
}