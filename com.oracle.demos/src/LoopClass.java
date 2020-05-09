public class LoopClass {

    public static void main(String[] args) {
        int[] arrays = new int[]{0,1,2,3,4};
        int counter = 0;
        for (int i = 0;i<arrays.length;++i){
            System.out.println("I is " +i+ " Value of array is "+arrays[i]);
        }
        System.out.println(" ");
        for (int i = 0;i<arrays.length;i++){
            System.out.println("I is " +i+ " Value of array is "+arrays[i]);
        }
        for (int i = arrays.length-1;i>=0;--i){
            System.out.println("I is " +i+ " Value of array is "+arrays[i]);
            counter--;
        }
        System.out.println(" counter is "+counter);
        counter = 0;
        for (int i = arrays.length-1;i>=0;i--){
            System.out.println("I is " +i+ " Value of array is "+arrays[i]);
            --counter;
        }
        System.out.println(" counter is "+counter);
        if(--counter>=0){
            System.out.println("first");
        }
        System.out.println(counter);

        if (counter-- >=-1){
            System.out.println("second");
        }
        System.out.println(counter);

    }
}
