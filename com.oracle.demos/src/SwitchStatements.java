public class SwitchStatements {

    public static void main(String[] args) {
        short s = 4;
        final short l = 5;
        // Does not matter what the range of short is. If you add two short numbers. the result is int.
       //final short ll =(short)(l+s);
        final short ll =(int)6;
        //System.out.println(ll instanceof Short);
        final int lll =(short)6;
        //System.out.println(lll instanceof Integer);
        switch(s){
            case l :
                System.out.println("l");
                break;

            case ll :
                System.out.println("ll");
                break;
            case 4 :
                System.out.println("s");
                break;
            default:
                System.out.println("default");
        }

    }

}
