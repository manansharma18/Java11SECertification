import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassCastException {

    public static void main(String[] args) {
        String[] strArray = new String[] { "John", "Snow" };
     /*   ArrayList<String> strList = (ArrayList<String>) Arrays.asList(strArray);
        System.out.println("String list: " + strList);

        ArrayList<String> list = (ArrayList<String>) List.of(strArray);
        System.out.println("String list: " + list);*/

        List<String> strList =  Arrays.asList(strArray);
        System.out.println("String list: " + strList);

        List<String> list =  List.of(strArray);
        System.out.println("String list: " + list);

        List<String> l = new ArrayList<>();
        List<String> l1 = (ArrayList<String>) l;
        System.out.println(l1);

    }
}
