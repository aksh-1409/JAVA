import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
    int age;
    int rollnumber;
    String name;

    public Student(int age, String name, int rollnumber){
        this.age = age;
        this.name = name ;
        this.rollnumber = rollnumber;
    }

    public String toString(){
        return age + " " +name+ " "+ rollnumber;
    }
}

class SortByName  implements Comparator <Student>{


        
    public int compare(Student s1, Student s2){
        return s1.name.compareTo(s2.name);
    }
}

class comparator{
    public static void main(String[] args){
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(12, "rahul", 23));
        list.add(new Student(11, "raju", 45));
        list.add(new Student(156, "mohan", 456));
        list.add(new Student(121, "jain", 23));
      
            Collections.sort(list, new SortByName());
            for(Student s: list){
                System.out.println(s);
            }     
     }
}