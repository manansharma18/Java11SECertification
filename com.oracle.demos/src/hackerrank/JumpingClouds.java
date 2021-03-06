package hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JumpingClouds {
 //0 0 1 0 0 1 0; 0 0 0 1 0 0
    static int jumpingOnClouds1(int[] c) {
        int jumpsRequired=0;
        int i=0;
        for (i=0;i<(c.length-1);)
        {
            if(i+2 == c.length) {
                i++;
            }else if(c[i+2] == 0)
            {
                i+=2;
            }else
            {
                i++;
            }
            jumpsRequired++;
        }
        return jumpsRequired;
    }
    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int minimumCount = 0;
        //To jump she must be on cloud so assuming first cloud is 0.

        int i = 0;
        while(i<c.length){
            if (i<=c.length - 3){
                if(c[i]==0){
                    if ((c[i+2]==0)) {
                        i = i + 2;
                        minimumCount++;
                        continue;
                    }
                    if ((c[i+1]==0)) {
                        i = i + 1;
                        minimumCount++;
                        continue;
                    }
                }
            }
            else if (i+2 == c.length-1){
                if (c[i+2] == 0){
                    i=i+2;
                    minimumCount++;
                    return minimumCount;
                }
                else{
                    i=i+1;
                    minimumCount++;
                    return minimumCount;
                }
            }
            else if (i+1 == c.length-1){
                if (c[i+1] == 0){
                    i=i+1;
                    minimumCount++;
                    return minimumCount;
                }
                else{
                    i=i+1;
                    minimumCount++;
                    return minimumCount;
                }
            }

            else i++;

        }
        return minimumCount;
    }

    private static final Scanner scanner = new Scanner(System.in);
// remove buffered shit and replace with sample input : 0 0 1 0 0 1 0; 0 0 0 1 0 0
    static int[] in1 = {0, 0, 1, 0, 0, 1, 0 };
    static int[] in2 = {0, 0, 0, 1, 0, 0 };

    public static void main(String[] args) throws IOException {
   /*     BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }*/

        int result1 = jumpingOnClouds1(in1);
        int result2 = jumpingOnClouds1(in2);
        System.out.println(result1);
        System.out.println(result2);
        /*bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();*/


    }
}
