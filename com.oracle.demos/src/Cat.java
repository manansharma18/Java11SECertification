public class Cat extends Animal {
    protected int x = 55;

    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        Animal myAnimal = myCat;
        Animal.testClassMethod();
        myAnimal.testInstanceMethod();
        testClassMethod();
        System.out.println(myAnimal.x);
        System.out.println(myCat.x);
        Animal animal = new Animal();
        animal.testInstanceMethod();
        //Cat newCat = (Cat) animal;
        // ClassCastException

    }
}