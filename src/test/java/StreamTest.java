import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class StreamTest {
    public static void main(String[] args) {
        /*List<Integer> ints = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            ints.add(i);
        }
        ints.stream().filter(i->i>=0&&i<60).map(a->"差"+a).forEach(System.out::print);
        System.out.println();
        ints.stream().filter(i->i>=60&&i<80).map(a->"中"+a).forEach(System.out::print);
        System.out.println();
        ints.stream().filter(i->i>=80).map(a->"优"+a).forEach(System.out::print);*/
        ArrayList<Integer> list = new ArrayList<>();
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(80);
        list.add(90);
        HashMap<Integer,String> hashMap = new HashMap<>();
        ArrayList<Integer> sList = new ArrayList<>();
        list.stream().map(new Function() {
            @Override
            public Object apply(Object o) {
                Integer integer = (Integer) o;
                if (0 < integer && integer <= 50) {
                    hashMap.put(integer,"差");
                }else if (50 < integer && integer <= 80) {
                    hashMap.put(integer,"中");
                }else {
                    hashMap.put(integer,"优");
                }
                return hashMap;
            }
        }).forEach(System.out::println);

    }
}
