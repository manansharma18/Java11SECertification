class Fish {
    protected int size; private final int age;
    public Fish(int age) {
        this.age = age;
    }
    public int getAge() { return age;
    }
}
public class Shark extends Fish {
    private final int numberOfFins = 8;
    public Shark(int age) { super(age);
        this.size = 4; //No need to inherit the variables if you dont want them.
        }
    public void displaySharkDetails() {
        System.out.print("Shark with age: "+getAge());
    System.out.print(" and "+size+" meters long");
    System.out.print(" with "+numberOfFins+" fins");
    }

    public static void main(String[] args) {
        Shark shark = new Shark(5);
        System.out.println(shark.size);
    }
}