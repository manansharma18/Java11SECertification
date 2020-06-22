package first.exam;

public class SuperString {
    public String toString(){
        return "string";
    }
    public Object toString(int a){
        return null;
    }
}

class SubString extends SuperString{
    public String toString(){
        return "sub string";
    }
    public Object toString(int a){
        return null;
    }

    public static void main(String[] args) {
        SuperString superString = new SubString();
        System.out.println(superString);
    }
}
