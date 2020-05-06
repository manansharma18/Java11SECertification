public class PrimitiveTypeDefaultValues {

    private int count;
    private boolean flag;
    private char c;
    private String s;
    private long l;
    private float f;
    private double d;
    public static long lo;
    public static void main(String[] args) {
        var primitiveTypeValues = new PrimitiveTypeDefaultValues();

        System.out.println(primitiveTypeValues.count);
        System.out.println(primitiveTypeValues.flag);
        System.out.println(primitiveTypeValues.s);
        System.out.println(primitiveTypeValues.l);
        System.out.println(primitiveTypeValues.f);
        System.out.println(primitiveTypeValues.d);
        System.out.println(primitiveTypeValues.c);
        System.out.println(lo);
        System.out.println("");
        primitiveTypeValues.f =  2.0f;
        primitiveTypeValues.d = 2;
        primitiveTypeValues.l = 4;

        System.out.println(primitiveTypeValues.l);
        System.out.println(primitiveTypeValues.f);
        System.out.println(primitiveTypeValues.d);

        int a;
        //System.out.println(a);
        int[] arr = new int[20];
        //var[] arrays = new int [3];
    }
}
