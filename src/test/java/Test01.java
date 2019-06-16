public class Test01 {
    public static void main(String[] args) {

        String str1 = new String("abc") ;
        String str2 = str1;

      /*  String str1 = new String("abc");
        String str2 = new String("abc");*/
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1==str2);
    }
}
