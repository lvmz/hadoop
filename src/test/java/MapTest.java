import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapTest {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> mapA = new ConcurrentHashMap<>();
        ArrayList listA = new ArrayList();
        MyMap myMap = new MyMap();
        myMap.setValue("10");
//        mapA.put("1", myMap.getValue());
//        mapA.put("2", myMap.getValue());
//        mapA.put("3", myMap.getValue());
//        listA.add(mapA.get("1"));
//        listA.add(mapA.get("2"));
//        listA.add(mapA.get("3"));
        listA.add(myMap);
        listA.add(myMap);
        listA.add(myMap);
        System.out.println(listA);
        myMap.setValue("1");
//        mapA.put("1", myMap.getValue());
//        mapA.put("2", myMap.getValue());
//        mapA.put("3", myMap.getValue());
        System.out.println(myMap.getValue());
    }
}