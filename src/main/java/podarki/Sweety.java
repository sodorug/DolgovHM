package podarki;

public class Sweety {
    private String name;
    private int weight;
    private int price;
    private String unicue;

    Sweety(String name, int weight, int price, String unicue){
        this.name = name;
        this.weight=weight;
        this.price=price;
        this.unicue=unicue;
    }

    void printInfo(){
      System.out.println("Имя: " + this.name);
      System.out.println("Вес: " + this.weight);
      System.out.println("Цена: " + this.price);
      System.out.println("Уникальное: " + this.unicue);
    }

    public int getWeight(){
        return weight;
    }

    public int getPrice() {
        return price;
    }
}
