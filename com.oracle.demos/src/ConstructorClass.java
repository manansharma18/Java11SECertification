public class ConstructorClass {
    {
        System.out.println("This is begining");
    }

    private String name;
    {
        name = "Manan";
        System.out.println(name);
    }
    public static void main (String [] args){
        System.out.println("hi");
        ConstructorClass constructorClass = new ConstructorClass();

        System.out.println(constructorClass.name);
        System.out.println(constructorClass.getName());

    }
    public ConstructorClass(){
        name = "Sharma";

    }

    public String getName(){

        {
            name = "Manan";
            System.out.println(name);
        }
        return name;
    }
}
