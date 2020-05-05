public class PrimitiveTypeDefaultValues {

    private int count;
    private boolean flag;
    private char c;
    private String s;
    private long l;
    private float f;
    private double d;

    public static void main(String[] args) {
        var primitiveTypeValues = new PrimitiveTypeDefaultValues();

        System.out.println(primitiveTypeValues.count);
        System.out.println(primitiveTypeValues.flag);
        System.out.println(primitiveTypeValues.s);
        System.out.println(primitiveTypeValues.l);
        System.out.println(primitiveTypeValues.f);
        System.out.println(primitiveTypeValues.d);

        primitiveTypeValues.f =  2.0f;
        primitiveTypeValues.d = 2;
        primitiveTypeValues.l = 4;

        System.out.println(primitiveTypeValues.l);
        System.out.println(primitiveTypeValues.f);
        System.out.println(primitiveTypeValues.d);

    }
}
