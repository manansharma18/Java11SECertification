package hackerrank;

import java.util.*;

public class NonDivisibleSubset {

    private  static boolean  canBeAdded(Set<Integer> set,Integer input,int k)
    {
        for(Integer num : set)
        {
            long sum = 0;
            sum = num + input;
            if(sum % k == 0)
                return false;
        }
        return  true;
    }
    public static int nonDivisibleSubset(int k, List<Integer> s) {
        // Write your code here
        Set<Integer> set = new HashSet<>();
        for (int i =0;i<s.size()-1;i++){
         for (int j = i+1;j<s.size();j++){
                long sum = 0;
                sum = s.get(i) + s.get(j);
                if (sum % k != 0){
                    if(canBeAdded(set,s.get(i),k) == true) {
                        set.add(s.get(i));
                    }
                    if(canBeAdded(set,s.get(j),k) == true) {
                        set.add(s.get(j));
                    }
             }
            }
        }
        int size = set.size();
        return size;
    }
    public static void main(String[] args) {
        int s = 7;
        List<Integer> k = new ArrayList<Integer> (Arrays.asList(278, 576, 496, 727, 410, 124, 338, 149, 209, 702, 282, 718, 771, 575, 436));
        //List<Integer> k = new ArrayList<Integer> (Arrays.asList(1,7,2,4));
        System.out.println(nonDivisibleSubset(s, k));
    }
}
