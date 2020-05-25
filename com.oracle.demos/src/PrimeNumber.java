import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner (System.in);
        //Integer intArray = scanner.nextInt();
        String[] tokens = scanner.nextLine().split(" ");
        List<String> listOfTokens =  Arrays.asList(tokens);
        scanner.close();
        List<Boolean> isPrimeList = new ArrayList<>();
        int length = Integer.parseInt(listOfTokens.get(0));
        //int length = (listOfTokens.get(0));
        for (int i = 1;i<=length;i++){

            int numberPrime = Integer.parseInt(listOfTokens.get(i));
            //int numberPrime = (listOfTokens.get(i));
            boolean isPrime = true;
            INNER_LOOP: for (int j = 2;j<=Math.sqrt(numberPrime);j++){
                if(numberPrime%j==0){
                    isPrime = false;
                    break INNER_LOOP;
                }

            }
            isPrimeList.add(isPrime);

        }

        for (Boolean isPrime: isPrimeList){

            if(isPrime){
                System.out.println("Prime");
            }
            else System.out.println("Not Prime");
        }

    }
}
