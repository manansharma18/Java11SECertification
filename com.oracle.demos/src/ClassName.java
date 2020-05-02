class ClassNameAgain {
    /**
     * Which main method is executed depends on the class passed as main class in run configuration.
     * There are two class files generated in the name ClassNameAgain.class and ClassNames.class
     * */
    public static void main(String args[]){
        System.out.println("Hello class Again");
    }
}


class ClassNames {

    /**
     * Can have a class by a different name if its not public. Can atmost have one public class in a file, but
     * if there is a public class then the file name should match. Here can have a class by the name of ClassName as
     * well
     * javac ClassName.java
     * java ClassNames or java ClassNameAgain
     */

    public static void main(String args[]) {
        System.out.println("Hello class");
    }
}
