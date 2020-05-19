interface Dances {
    String swingArms();
}
interface EatsFish {
    CharSequence swingArms();
}
public class Penguins implements Dances, EatsFish {
    public String swingArms() {
    return "swing!"; }


    public static void main(String[] args) {
        Penguins penguins = new Penguins();
        System.out.println(penguins.swingArms());
    }
}

class HigherPenguin extends Penguins{
    public String swingArms() {
        return "swing Higher!"; }

}