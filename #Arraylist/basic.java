import java.util.ArrayList;

public class basic {
 public static void main(String[] args) {

    //Out of date method of Arraylist declaration
    Integer i= Integer.valueOf(4);
    System.out.println(i);

    //Better and safe of Arraylist declaration
    ArrayList <Integer> j= new ArrayList<>();
    System.out.println(j);

    //Adding an element in Arraylist
    j.add(1);
    System.out.println(j);
    j.add(1,2);
    System.out.println(j);
    
    // To get element form particular index then we use j.get();
    // We directly print whole list by sout(j);

    // To remove an element or index
    j.remove(1); //for index
    j.remove(Integer.valueOf(1));//for element  USE Interger.valueof();
    System.out.println(j);

    // If we dont want to declare any specific class of object then
    ArrayList k= new ArrayList<>();
    k.add("remember the self");
    System.out.println(k);
}   
}
