package hackerrank;

public class HackerRankRandomStrangeCounter {



        // Complete the strangeCounter function below.
        public long strangeCounter(long t) {

            long low = 1;
            long high = 3;
            boolean isValueFound = false;

            long newLow;
            long newHigh;

            newLow =  low;
            newHigh = high;


            while(!isValueFound){

                if(t>=low & t<= high){

                    isValueFound = true;
                }
                if (!isValueFound){

                    newLow = 2 * low + 2;
                    newHigh = 2* high + 3;
                    low = newLow;
                    high = newHigh;

                }
            }

            return  newLow + 2 - (t - newLow);


        }

        public static void main(String[] args)  {
           var obj = new HackerRankRandomStrangeCounter();
           long value = obj.strangeCounter(5);
           long value1 = obj.strangeCounter(1);
           long value2 = obj.strangeCounter(3);
            long value3 = obj.strangeCounter(7);

            if(value == 5) System.out.println("Pass");
            if(value1 == 3) System.out.println("Pass");
            if(value2 == 1) System.out.println("Pass");
            if(value3 == 3) System.out.println("Pass");
        }




}
