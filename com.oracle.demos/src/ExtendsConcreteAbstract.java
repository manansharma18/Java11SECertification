public abstract class ExtendsConcreteAbstract extends ConcreteAbstract {
    public ExtendsConcreteAbstract() {
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
