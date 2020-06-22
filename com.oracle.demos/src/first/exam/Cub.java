package first.exam;

public class Cub {

    private String name;
    private double weight;

    public Cub(double weight){
        this("",weight);
        this.weight = weight;
    }

    public Cub(String name,double weight){
        name = name;
        weight = weight;
    }

    public static void main(String[] args) {
        Cub cub = new Cub(50);
        System.out.println(cub.name);
        System.out.println(cub.weight);
    }

}
