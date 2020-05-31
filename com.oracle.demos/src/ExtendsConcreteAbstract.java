public abstract class ExtendsConcreteAbstract extends ConcreteAbstract {
    public ExtendsConcreteAbstract() {
        super();
        System.out.println("ExtendsConcreteAbstract");
        concrete();
    }

    int concrete(){
         return 1;
     }

    @Override
    void getDetails() {
        super.getDetails();
    }
}
