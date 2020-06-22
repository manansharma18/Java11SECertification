package first.exam;

public class Looping {

    public static void main(String[] args) {
        char[] charArray = {'e','s','p','r','e','s','s','o','8','9','0'};
        int i = 48;
        do{
            for(char c : charArray)
                if((char)i==c)
                    System.out.println("found");
        }while(i++<57);
    }
}
