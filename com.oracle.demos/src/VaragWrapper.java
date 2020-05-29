public class VaragWrapper {

    private static void v1(Integer x){
        System.out.println("Integer varag");
    }

    private static void v1(long x){
        System.out.println("long varag");
    }

    public static void main(String[] args) {
        v1(5);
    }
}
