package pond.swan;
import pond.shore.Bird;

public class Swan extends Bird {
    public void swim() {
    floatInWater();
    System.out.println(text);

}
public void helpOtherSwanSwim() {
        Swan other = new Swan();
        other.floatInWater();
        }


    public static void main(String[] args) {
        Swan swan = new Swan();
        swan.helpOtherSwanSwim();

    }

}