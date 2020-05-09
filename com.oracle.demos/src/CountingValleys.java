import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CountingValleys {


    static int countingValleys(int n, String s) {

        int totalScore = 0;
        int valleyScore = -1;
        int mountainScore = 1;
        int numberOfValleys = 0;
        boolean isValley = false;

        for(int i = 0;i<=s.length()-1;i++){
            char step = s.charAt(i);

            if(totalScore == 0 && step =='D'){
                isValley = true;
            }

            if (step =='D'){
                totalScore+=valleyScore;
            }
            else if (step =='U'){
                totalScore+=mountainScore;
            }

            if(totalScore == 0){
                if(isValley){
                    numberOfValleys++;
                }
                isValley = false;
            }

        }

        return numberOfValleys;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

    //sample output : UDDDUDUU
    //sample output : DDUUDDUDUUUD https://www.hackerrank.com/challenges/counting-valleys/submissions/code/157882992?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
}
