public class Strings {

static void checkConcatLiterPool(){

    String s = "hello world";
    String t = "he"+"ll"+"o world";

    t=t+" to me";

    System.out.println(t);
    System.out.println(s);

}
    public static void main(String[] args) {
        String s = "hello world";
        String t = "he"+"ll"+"o world";
        String u = "hell";
        u = u+"o world";
        var v = new String ("hello world").intern();
        //v = v+"o world".intern();
        System.out.println(s==t);
        System.out.println(s.equals(t));

        System.out.println(s==u);
        System.out.println(s.equals(u));

        System.out.println(s==v);
        System.out.println(s.equals(v));

        checkConcatLiterPool();
    }
}
