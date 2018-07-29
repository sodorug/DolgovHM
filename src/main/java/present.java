class present {
    private sweety[] sweeties;
    private int swSize;
    present(){
        swSize = 4;
        this.sweeties = new sweety[swSize];
        this.sweeties[0] = new sweety("Конфета1", 11, 101, "Хамстер1");
        this.sweeties[1] = new sweety("Конфета2", 12, 102, "Хамстер2");
        this.sweeties[2] = new sweety("Конфета3", 13, 103, "Хамстер3");
        this.sweeties[3] = new sweety("Конфета4", 14, 104, "Хамстер4");
    }
    int getPrice(){
        int swPrice = 0;
        for (int i = 0; i<swSize;i++) {
            swPrice = swPrice + this.sweeties[i].price;
        }
        return(swPrice);

    }
    int getWeight(){
        int swWeight = 0;
        for (int i = 0; i<swSize;i++) {
            swWeight = swWeight + sweeties[i].weight;
        }
        return (swWeight);
    }

    void printAll(){
        System.out.println("Состав подарка: ");
        for (int i = 0; i<swSize;i++) {
            this.sweeties[i].printInfo();
        }
    }
}
