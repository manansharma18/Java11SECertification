public class StaticBlocks {

    private static  int a , b ,c;

    static {a=5;
    b=6;
    c=7;}

    public static void main(String[] args) {
       //  StaticBlocks staticBlocks = new StaticBlocks();
        System.out.println(a);
    }
}
