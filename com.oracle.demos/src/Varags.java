public class Varags {
    private static void m1(int x) {
        System.out.println("int Primitive type");
    }
    private static void m1(long... x) {
        System.out.println("Varag long Primitive type");
    }

    private static void m1(long x) {
        System.out.println("long Primitive type");
    }

    private static void m1(float x) {
        System.out.println("long Primitive type");
    }


    public static void main(String[] args) {
        m1(5);
        m1(5L);
        m1();

    }

}
