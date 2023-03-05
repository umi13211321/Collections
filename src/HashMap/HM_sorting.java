package HashMap;
import java.util.*;

public class HM_sorting {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map1  = new HashMap<>();
        map1.put(1, 30);
        map1.put(2, 70);
        map1.put(3, 10);

        ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(map1.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>(){
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2){
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        HashMap<Integer, Integer> map3 = new LinkedHashMap<>();
        for(Map.Entry<Integer, Integer> entry : list){
            map3.put(entry.getKey(), entry.getValue());
        }
        System.out.println(map3);
    }
}
