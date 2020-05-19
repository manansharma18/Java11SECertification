public final class  FinalClassInterface implements Dance, EatsFishes{
    @Override
    public String swingArms() {
        return "Hello";
    }

    public static void main(String[] args) {
        FinalClassInterface finalClassInterface = new FinalClassInterface();
        FinalInstanceClass finalInstanceClass = new FinalInstanceClass(5);
        if (finalClassInterface instanceof Dance){
            System.out.println("True");
        }
        else System.out.println("false");


        if (finalInstanceClass instanceof Dance){
            System.out.println("True");
        }
        else System.out.println("false");
    }
    }






interface Dance {
     String swingArms();
}
interface EatsFishes {
    CharSequence swingArms();
}
