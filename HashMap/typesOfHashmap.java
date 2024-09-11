import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class typesOfHashmap {
    
    public static void main(String[] args) {
        HashMap<Integer,String>map = new HashMap<>();
        map.put(4, "Hari");
        map.put(2, "Gauranga");
        map.put(9, "Kamala Nayan");
        map.put(1, "Narayan");

        System.out.println("Hashmap class Map output is "+map);
//order of insertion is preserved

        LinkedHashMap<Integer,String> map1=new LinkedHashMap<>();
        map1.put(4, "Hari");
        map1.put(2, "Gauranga");
        map1.put(9, "Kamala Nayan");
        map1.put(1, "Narayan");

        System.out.println("Linked Hashmap class Map output is "+map1);
        

        TreeMap<Integer,String> map3=new TreeMap<>();
        map3.put(4, "Hari");
        map3.put(2, "Gauranga");
        map3.put(9, "Kamala Nayan");
        map3.put(1, "Narayan");
        map3.put(3, "Rama");
        map3.put(7, "Damodar");
        map3.put(6,"Govinda");

        System.out.println("TreeMap class Map output is "+map3);
    }
}
