package first.exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAsList {

    public static void main(String[] args) {
        int [] intArray = {4,5,6,7,8};
        String [] stringArray = {"","hi","hello","hawk"};
        ArrayList<Integer> integers = new ArrayList<>();
        List listInteger = Arrays.asList(intArray);
        List<String> listString = Arrays.asList(stringArray);
        ArrayList<String> stringArrayList = new ArrayList<>(listString);

        System.out.println(stringArrayList.add("sss"));
        //System.out.println(listString.add("asas"));

        var list = new ArrayList<String>();
        list.add("hi");
        //list.add(String.valueOf(new Integer(5)));
        int[] duplicateArray = intArray;
        int[] duplicateArray1 = {4,5,6,7,8};
        System.out.println(duplicateArray.equals(intArray));
        System.out.println(duplicateArray1.equals(intArray));
        int[][] twoD = new int[10][5];
        int [][] twoDD;

    }
}
