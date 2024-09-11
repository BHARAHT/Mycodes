import java.util.*;

public class hashMapFunctions {
    public static void main(String[] args) {
        
    HashMap<Integer,String> map = new HashMap<>();
    //put() function
    map.put(1, "Bharath");
    map.put(2, "Krishna");
    map.put(3, "Chaithanya");
    map.put(7, "Nithyanandha");
    map.put(8, "Jagannath");
    map.put(9, "Rama");

    System.out.println("Hashmap of given data is: "+map);
    //get() function
    String result=map.get(2);
    System.out.println("The value of given key is "+result);

    //remove() function
    map.remove(1);
    map.remove(3);

    System.out.println("Updated Hashmap is: "+ map);

    //contaions() function
    System.out.println("Checking of whether key is prsent or not :"+ map.containsKey(1));

    //iterating using the for loop
    for(Map.Entry<Integer,String>ele:map.entrySet())
    {
        System.out.println(ele.getKey()+" : "+ele.getValue());
    }
    }
}
