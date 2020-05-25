class Penguin {
    public static int getHeight() {
        return 3;
    }
    public void printInfo() {
        System.out.println(getHeight());
    }
}
public class CrestedPenguin extends Penguin {
    public static int getHeight() {
        return 8;
    }

    public void printInfo() {
        System.out.println(getHeight());
    }

    public static void main(String... fish) {
        new CrestedPenguin().printInfo();
        new Penguin().printInfo();
        Penguin p = new CrestedPenguin();
        p.printInfo();
            System.out.println(Penguin.getHeight());
            System.out.println( new CrestedPenguin().getHeight());
    }
}