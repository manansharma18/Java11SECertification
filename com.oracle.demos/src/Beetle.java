
interface HasExoskeleton {
    double size = 2.0f;
    int getNumberOfSections();
    Exception e() throws Exception;
   
}
abstract class Insect implements HasExoskeleton {
    abstract int getNumberOfLegs();
}
public class Beetle extends Insect {
    @Override
    int getNumberOfLegs() { return 6; }
    static double size = 3.0;
    //public int getNumberOfSections(int x) { return 1; }
    @Override
    public Exception e() throws Exception{
        System.out.println("Exception");
        //throw new RuntimeException();
        throw new Exception();
    }

    public static void main(String[] args) {
        Beetle beetle = new Beetle();
        System.out.println(size);

        HasExoskeleton hasExoskeleton = beetle;
        System.out.println(hasExoskeleton.size);
    }

    @Override
    public int getNumberOfSections() {
        return 0;
    }
}