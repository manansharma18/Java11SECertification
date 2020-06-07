package hackerrank;

public class ClimbingTheLeaderBoard {

    static int[] climbingLeaderboard(int[] scores, int[] alice) {
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

    public static void main(String[] args) {
        /*6
        100 90 90 80 75 60
        5
        50 65 77 90 102
        Ex O/P 6,5,4,2,1*/

        int[] scores = new int[]{100, 100, 50 ,40, 40 ,20, 10};

        int[] alice = new int[]{5, 25, 50, 120};

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
