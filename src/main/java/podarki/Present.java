package podarki;

public class Present {
    private Sweety[] sweeties;
    private int swSize;
    public Present(){
        swSize = 4;
        this.sweeties = new Sweety[swSize];
        this.sweeties[0] = new Sweety("Конфета1", 11, 101, "Хамстер1");
        this.sweeties[1] = new Sweety("Конфета2", 12, 102, "Хамстер2");
        this.sweeties[2] = new Sweety("Конфета3", 13, 103, "Хамстер3");
        this.sweeties[3] = new Sweety("Конфета4", 14, 104, "Хамстер4");
    }
    public int getPrice(){
        int swPrice = 0;
        for (int i = 0; i<swSize;i++) {
            swPrice = swPrice + this.sweeties[i].getPrice();
        }
        return(swPrice);

    }
    public int getWeight(){
        int swWeight = 0;
        for (int i = 0; i<swSize;i++) {
            swWeight = swWeight + sweeties[i].getWeight();
        }
        return (swWeight);
    }

    public void printAll(){
        System.out.println("Состав подарка: ");
        for (int i = 0; i<swSize;i++) {
            this.sweeties[i].printInfo();
        }
    }
}
