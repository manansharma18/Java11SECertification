package first.exam;

public class StaticVariables {
    static int x;
    static void x(){}
}

class SubStaticVariables extends StaticVariables{
    int x;
    static void x(){}

    void anyType(Object obj){
        System.out.println(obj);
    }

    void checkLong(Long l){
        System.out.println(l instanceof Long);

    }

    public static void main(String[] args) {
        System.out.println(StaticVariables.x);
        new SubStaticVariables().anyType(1);
        new SubStaticVariables().anyType(1L);
        new SubStaticVariables().anyType(1F);
        new SubStaticVariables().anyType("1");
        new SubStaticVariables().checkLong(1L);
        //new SubStaticVariables().checkLong(new Integer(1));
    }
}
