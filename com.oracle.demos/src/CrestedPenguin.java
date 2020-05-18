class Penguin {
    public static int getHeight() {
        return 3;
    }
    public void printInfo() {
        System.out.println(this.getHeight());
    }
}
public class CrestedPenguin extends Penguin {
    public static int getHeight() {
        return 8;
    }

    public void printInfo() {
        System.out.println(this.getHeight());
    }
        public static void main(String... fish) {
        new CrestedPenguin().printInfo();
        Penguin p = new CrestedPenguin();
        p.printInfo();
            System.out.println(p.getHeight());
            System.out.println( new CrestedPenguin().getHeight());
    }
}