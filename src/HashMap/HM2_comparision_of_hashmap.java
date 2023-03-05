package HashMap;
import java.util.Map;
import java.util.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
public class HM2_comparision_of_hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> map1  = new HashMap<>();
        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");

        HashMap<Integer, String> map2  = new HashMap<>();
        map2.put(3, "C");
        map2.put(2, "B");
        map2.put(1, "A");

        HashMap<Integer, String> map3  = new HashMap<>();
        map3.put(1, "A");
        map3.put(2, "B");
        map3.put(3, "C");
        map3.put(3, "D");

        //on the basis of key-value: use equals method
        System.out.println(map1.equals(map2));//true
        System.out.println(map1.equals(map3));//false

        //compare hashmap for the same keySet():
        System.out.println(map1.keySet().equals(map2.keySet()));//true

        //find out the extra keys:
        HashMap<Integer, String> map4 = new HashMap<>();
        map4.put(1,"A");
        map4.put(2, "B");
        map4.put(3,"C");
        map4.put(4,"D");

        //combine the keys from both maps using HashSet
        HashSet<Integer> combineKeys = new HashSet<>(map1.keySet());

        //add the keySet from map4
        combineKeys.addAll(map4.keySet());
        combineKeys.removeAll(map1.keySet());
        System.out.println(combineKeys);

        HashMap<Integer, String> map5 = new HashMap<>();
        map5.put(1,"A");
        map5.put(2, "B");
        map5.put(3,"C");

        HashMap<Integer, String> map6 = new HashMap<>();
        map6.put(4,"A");
        map6.put(5, "B");
        map6.put(6,"C");

        HashMap<Integer, String> map7 = new HashMap<>();
        map7.put(1,"A");
        map7.put(2, "B");
        map7.put(3,"C");
        map7.put(4, "C");

        //1. duplicates not allowed
        System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map6.values())));  //true
        System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map7.values())));  //false

        //2. duplicates are allowed: using HashSet
        System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map6.values()))); //true
        System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map7.values()))); //true


    }
}
