package first.exam;
// Throws null pointer exception

public class Shark {

    static Water water;
    static Liquid liquid;
    static final String name;
    static {

        name = "Manan";
    }
    public static void main(String[] args) {
        //Liquid liquid = new Liquid();
        System.out.println(liquid.getSomething());
        new Water().toString();
        water.toString(); // null pointer exception
        water.getString();
        new Water().getString();
        //name = "hi";
        System.out.println(!!true);
    }



}


class Water{
    public String toString(){return "";}
    public static int getString(){return 6;}
}

class Liquid{
    public String getSomething(){
        return "something";
    }
}