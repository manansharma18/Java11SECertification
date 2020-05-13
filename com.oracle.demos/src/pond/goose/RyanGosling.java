package pond.goose;

public class RyanGosling extends Gosling{

    //protected String text = "Manan";
    public void swim() {
        floatInWater();
        System.out.println(text);
    }

    public static void main(String[] args) {
        Gosling gosling = new Gosling();
        gosling.swim();

        RyanGosling ryanGosling = new RyanGosling();
        ryanGosling.swim();

        Gosling ryanGoslingGosling = new RyanGosling();
        ryanGoslingGosling.swim();

    }
}
