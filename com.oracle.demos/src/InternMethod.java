public class InternMethod {

    public static void main(String[] args) {
        String singleString = "hello world";
        String oneLine = "hello " + "world";
        String concat = "hello ";
        concat += "world";
        System.out.println(singleString == oneLine);
        System.out.println(singleString == concat);
    }
}
