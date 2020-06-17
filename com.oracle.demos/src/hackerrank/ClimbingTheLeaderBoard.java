package hackerrank;

public class ClimbingTheLeaderBoard {

    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int rankCounter = 1;
        int[] aliceRanks = new int[alice.length];
        int j = alice.length - 1;
        int i = 0;
        int prevScore = scores[0];
        for(;i<scores.length;i++)
        {
            if(scores[i] != prevScore)
            {
                rankCounter++;
                prevScore = scores[i];
            }
            if(alice[j] >= scores[i])
            {
                aliceRanks[j--] = rankCounter;
            }
            if(j < 0)
            {
                break;
            }

        }
        if(i == scores.length && j >= 0) {
            for(;j>=0;j--) {
                aliceRanks[j] = ++rankCounter;
            }
        }
        return aliceRanks;
    }
    static int[] climbingLeaderboard1(int[] scores, int[] alice) {
        int[] rank = new int[scores.length];
        int maxScore = scores[0];
        int rankCounter = 1;
        for (int i = 0;i<scores.length;i++ ){
            if (scores[i]==maxScore){
                rank[i] = rankCounter;
                continue;
            }

            else if (scores[i]<maxScore && scores[i]!=scores[i-1]){

                rank[i] = ++rankCounter;
            }
            else if (scores[i]<maxScore && scores[i]==scores[i-1]){
                rank[i] = rankCounter;
            }
        }

        int[] aliceRank = new int [alice.length];

        /*for (int i = 0; i<alice.length;i++){
           int index = binarySearch(scores,0,scores.length-1,alice[i]);
            alice[i] = rank[i];
            if(index==-1){
                aliceRank[i] = rank[rank.length-1] +1;
            }
        }*/

        for (int i = 0; i<alice.length;i++){
            boolean rankFound = false;
            for (int j = 0;j<scores.length;j++ ){

                if(alice[i]>scores[j]){
                    aliceRank[i] = rank[j];
                    rankFound = true;
                    break;
                }
                else if (alice[i]==scores[j]){
                    aliceRank[i] = rank[j];
                    rankFound = true;
                    break;
                }
            }
            if(!rankFound){
                aliceRank[i] = rank[rank.length-1] +1;
            }
        }

        return aliceRank;
    }
    static int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then it can only
            // be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present in right
            // subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present in array
        return -1;
    }


    public static void main(String[] args) {
        /*6
        100 90 90 80 75 60
        5
        50 65 77 90 102
        Ex O/P 6,5,4,2,1*/

        int[] scores = new int[]{100, 100, 50 ,40, 40 ,20, 10};

        int[] alice = new int[]{5, 2, 50, 12};

        int[] result = climbingLeaderboard(scores, alice);

        int [] expectedOutput = new int[]{6,4,2,1};
        for(int i = 0; i<result.length;i++){

            System.out.print(result[i]);

        }
        System.out.println();
        for(int i = 0; i<result.length;i++){

            System.out.print(expectedOutput[i]);
        }
        
    }
}
