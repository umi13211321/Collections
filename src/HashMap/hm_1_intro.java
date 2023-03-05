package HashMap;
import java.util.Map;
import java.util.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class hm_1_intro {
    public static void main(String[] args) {
        HashMap<String, String> map1  = new HashMap<>();
        map1.put("A","a");
        map1.put("B", "b");
        map1.put("C","c");
        map1.put("D","d");
        map1.put("null", "e");
        map1.put("F",null);
        map1.put("G",null);
        map1.put("H", "h");

        System.out.println(map1);

        //Iterator: over the keys: by using keySet()
        Iterator<String> it = map1.keySet().iterator();
        while(it.hasNext()){
            String key = it.next();
            String value = map1.get(key);
            System.out.println("key =" + key+  "  value = " + value);
        }

        //Iterator: over the keys: by using entrySet()
        Iterator<Map.Entry<String, String>> it1 = map1.entrySet().iterator();
        while(it1.hasNext()){
            Map.Entry<String, String> entry = it1.next();
            System.out.println("key =" + entry.getKey()+  "  value = " + entry.getValue());
        }

        //Iterate using each and lambda
        map1.forEach((K,V) -> System.out.println("key = " +K+ " and value = " +V));


        //convert HashMap keys and values to ArrayList
        HashMap<Integer, String> map2  = new HashMap<>();
        map2.put(1, "A");
        map2.put(2, "B");
        map2.put(3, "C");
        map2.put(4, "D");

        List<Integer> listKeys = new ArrayList<>(map2.keySet());
        List<String> listValues = new ArrayList<>(map2.values());
        System.out.println(listKeys);
        System.out.println(listValues);
    }
}
