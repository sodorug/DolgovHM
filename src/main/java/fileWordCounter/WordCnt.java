package fileWordCounter;

public class WordCnt {
    private int count;
    public String word;

    public WordCnt(String word){
        this.word = word;
        count = 1;
    }

    public int getCount(){
        return count;
    }

    public void incCount(){
        count = count + 1;
    }

    public void printInfo(){
        System.out.println(word +": " + count);
    }
}
