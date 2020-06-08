public class SwitchStatements {



    public static void main(String[] args) {

        OUTER: for(int i=0;i<7;i++)
            INNER:for(int j=0;j<7;j++)
                System.out.println(j);

        int aa =9;
        int bb =6;

        if(aa>5)
            if(bb>5)
                System.out.println(bb);
            else System.out.println("lol");
         else System.out.println("hey");

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
                break;//return;
            default:
                System.out.println("default");
        }
        System.out.println("hello");

    }

}
