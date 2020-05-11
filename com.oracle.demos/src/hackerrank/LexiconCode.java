package hackerrank;

import java.util.Scanner;

public class LexiconCode {

    public static String getSmallestAndLargest(String s, int k) {
       /* String smallest = "";
        String largest = "";

        String[] arrayOfStrings = new String [s.length()-k-1];

        for (int i = 0;i<s.length()-k-1; i++) {

            arrayOfStrings[i] = s.substring(i,i+k);

        }

        for(int i = 0 ; i < arrayOfStrings.length;i++)
        {
            for(int j = i+1 ; j< arrayOfStrings.length;j++)
            {
                if(arrayOfStrings[i].charAt(0) > arrayOfStrings[j].charAt(0))
                {
                    String temp = arrayOfStrings[i];
                    arrayOfStrings[i] = arrayOfStrings[j];
                    arrayOfStrings[j] = temp;
                }
                else if(arrayOfStrings[i].charAt(0) == arrayOfStrings[j].charAt(0))
                {
                    if(arrayOfStrings[i].charAt(1) > arrayOfStrings[j].charAt(1)){

                        String temp = arrayOfStrings[i];
                        arrayOfStrings[i] = arrayOfStrings[j];
                        arrayOfStrings[j] = temp;

                    }

                    else if(arrayOfStrings[i].charAt(1) == arrayOfStrings[j].charAt(1)){

                        if(arrayOfStrings[i].charAt(2) > arrayOfStrings[j].charAt(2)){

                            String temp = arrayOfStrings[i];
                            arrayOfStrings[i] = arrayOfStrings[j];
                            arrayOfStrings[j] = temp;
                        }

                    }

                }
            }
        }*/
        String smallest = "";
        String largest = "";

        String[] arrayOfStrings = new String [s.length()-k+1];

        for (int i = 0;i<s.length()-k+1; i++) {

            arrayOfStrings[i] = s.substring(i,i+k);

        }

        OUTERMOST_LOOP : for(int i = 0 ; i < arrayOfStrings.length;i++)
        {
            INNER_LOOP: for(int j = i+1 ; j< arrayOfStrings.length;j++)
            {
                INNERMOST_LOOP: for (int l=0;l<k;l++){
                    if(arrayOfStrings[i].charAt(l) > arrayOfStrings[j].charAt(l))
                    {
                        String temp = arrayOfStrings[i];
                        arrayOfStrings[i] = arrayOfStrings[j];
                        arrayOfStrings[j] = temp;
                        break INNERMOST_LOOP;
                    }
                    else if(arrayOfStrings[i].charAt(l) < arrayOfStrings[j].charAt(l)) {
                        continue INNERMOST_LOOP;
                    }
                }
            }
        }


        smallest = arrayOfStrings[0];
        largest = arrayOfStrings[arrayOfStrings.length -1];

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

//ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs
    //30
    /*
    * e define the following terms:
Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows:

For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.
A substring of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c, ab, bc, and abc.
Given a string, , and an integer, , complete the function so that it finds the lexicographically smallest and largest substrings of length .
Input Format
The first line contains a string denoting .
The second line contains an integer denoting .
Constraints

 consists of English alphabetic letters only (i.e., [a-zA-Z]).
Output Format
Return the respective lexicographically smallest and largest substrings as a single newline-separated string.
Sample Input 0
welcometojava
3
Sample Output 0
ava
wel
    *
    * */
}
