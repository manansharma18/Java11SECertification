package first.exam;

public class SwitchCaseRelated {
    public static void main(String[] args) {
        String z ="hi";

        switch (z){
            case "":
                System.out.println("no");
                case "hi":
                System.out.println("hi");
                return;

            case "a" +"":
                System.out.println("second");
                return;

            case "case" : case "bh":System.out.println("case");

            default: case"A"+"Z":return;

        }
    }
}
