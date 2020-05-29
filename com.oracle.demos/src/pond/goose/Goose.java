package pond.goose;


import pond.shore.Bird;

public class Goose extends Bird {
    public void helpGooseSwim() {
        Goose other = new Goose();
        other.floatInWater();

       // bird.flo
        System.out.println(other.text);
    }
    public void floatInWater(){
        System.out.println("Child Method");
    }
    public void helpOtherGooseSwim() {
        Bird other = new Goose();
        //other.floatInWater();
        //System.out.println(other.text); // DOES NOT COMPILE
    }

    public static void main(String[] args) {
        Goose other = new Goose();
        other.floatInWater();

    }
}