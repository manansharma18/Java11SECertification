
interface HasExoskeleton {
    double size = 2.0f;
    int getNumberOfSections();
}
abstract class Insect implements HasExoskeleton {
    abstract int getNumberOfLegs();
}
public class Beetle extends Insect {
    int getNumberOfLegs() { return 6; }
    static double size = 3.0;
    //public int getNumberOfSections(int x) { return 1; }

    public static void main(String[] args) {
        Beetle beetle = new Beetle();
        System.out.println(beetle.size);

        HasExoskeleton hasExoskeleton = beetle;
        System.out.println(hasExoskeleton.size);
    }

    @Override
    public int getNumberOfSections() {
        return 0;
    }
}