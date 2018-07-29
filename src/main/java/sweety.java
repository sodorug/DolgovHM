class sweety {
    private String name;
    int weight;
    int price;
    private String unicue;

    sweety(String name,int weight,int price, String unicue){
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
}
