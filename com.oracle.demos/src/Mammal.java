public class Mammal extends Animals {
public Integer m (String s){return 2;}

    public static void main(String[] args) {
        new Mammal().m("");
    }
}

class Animals{
    public Number m(CharSequence cs){return 1;}
}

