public class AbstractConcrete extends ExtendsConcreteAbstract{

    public AbstractConcrete(){
        super();
        System.out.println("AbstractConcrete");
    }
    void getDetails(){
        System.out.println("Hello");
        //super.getDetails();
    }
    int concrete(){
        return 4;
    }
    public static void main(String[] args) {
        AbstractConcrete abstractConcrete = new AbstractConcrete();
        ConcreteAbstract concreteAbstract = abstractConcrete;
        ExtendsConcreteAbstract extendsConcreteAbstract = abstractConcrete;
        concreteAbstract.getDetails();
        abstractConcrete.getDetails();
        System.out.println(abstractConcrete.concrete());
        System.out.println(concreteAbstract.concrete());
        System.out.println(extendsConcreteAbstract.concrete());
        extendsConcreteAbstract.getDetails();
    }
}
