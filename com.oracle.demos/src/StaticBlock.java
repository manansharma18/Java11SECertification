import static lambda.Employee.*;
public class StaticBlock {

static int kola;
final int a;
private int cal;
    {a=5;}
    public static void main(String[] args) {
        Object obj = new Object();
        kola = 6;
        System.out.println("Main main method");
        main(new String[]{"str"},new int[]{6});
    }

    public static void main(String[] args,int[] arg) {
        System.out.println("non main method");
        Object obj = new Object();
        kola = 6;
    }

    int m(int a){return 1;}
    void m(){}

}
