public class Operators {

    public static void main(String[] args) {
        int l = 4;
        int t = ++l*5/l--;

        short s = 5;

        s = (short)(s + l);

        System.out.println(l);
        System.out.println(t);

        Object o = null;
        System.out.println(o instanceof String);
        String ss = new String("A");
        System.out.println(ss instanceof Object);
        double h = 9;
        int x = (short)500;
        //System.out.println(h);
        t*=h;
        h*=t;

        System.out.println(t);
        System.out.println(h);

    }

}
