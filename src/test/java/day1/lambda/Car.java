package day1.lambda;

public class Car implements Comparable  {
    private String color;
    private String name;
    private int maxSpeed;
    private int price;
    private String producer;

    public String

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", price=" + price +
                ", producer='" + producer + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
