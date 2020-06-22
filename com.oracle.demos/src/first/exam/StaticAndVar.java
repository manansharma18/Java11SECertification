package first.exam;

public class StaticAndVar {
    int i;
    static int j;

    public static void main(String[] args) {
        StaticAndVar staticAndVar = new StaticAndVar();
        StaticAndVar staticAndVar1 = new StaticAndVar();

        staticAndVar.i=5;
        staticAndVar1.j=10;

        int j = staticAndVar.i+staticAndVar1.j;
        System.out.format("%d +%d = %d",staticAndVar.i,staticAndVar1.j,
                staticAndVar.i+staticAndVar1.j);
        int i = 5;
        System.out.println(new StaticAndVar().localMain(j,i));
    }
    int localMain(int j ,int i){
        int a = i+j;
        return a;
    }
}
