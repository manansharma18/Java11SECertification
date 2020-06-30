package first.exam;

abstract public class AbstractClass {
    public AbstractClass() {
        chew();
    }

    abstract void chew();

}

class NonConcrete extends AbstractClass implements abs{
    public NonConcrete() {
        super();
    }

    public void chew(){
        System.out.println("chew");
    }

    public static void main(String[] args) {
        new NonConcrete();
    }
}

interface abs{
     void chew();
}