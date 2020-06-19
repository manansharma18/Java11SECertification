package first.exam;

public class VarRelated {
    public static void main(String[] args) {
        var var = 8;
        var tiger = "tiger";
        var lion = "lion";

        final var statement = var > 6 ? (lion ="lion"):(tiger = "needs help");
        final var statement1= var > 6 ? lion :(tiger = "needs help");

    }
}
