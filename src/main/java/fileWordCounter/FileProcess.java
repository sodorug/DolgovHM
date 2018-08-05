package fileWordCounter;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileProcess{
    private String filename;
    private List<WordCnt> wCnt;

    public FileProcess(String filename){
      this.filename = filename;
    }

    public void ReadWords(){
        FileInputStream fis = null;
        byte[] data = null;
        try {
            File file = new File(filename);
            fis = new FileInputStream(file);
            data = new byte[(int) file.length()];
            fis.read(data);
        } catch (FileNotFoundException exc) {
            System.out.println(exc.getMessage());
        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        String s = null;
        try {
            s = new String(data, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String[] text = s.split(" ");
        System.out.print(text.length);

        Arrays.sort(text);

        wCnt = new ArrayList<WordCnt>();
        String lastWord = null;
        int i = 0;

        for (String str: text) {
            if (lastWord != null && str.equals(lastWord)) {
                wCnt.get(i).incCount();
            }
            else{
                wCnt.add(new WordCnt(str));
                i++;
            }
            lastWord = str;
        }
    }

    public void printStat(){
        System.out.println("Статистика(слово: число вхождений в файл)");
        for (WordCnt wc: wCnt){
            wc.printInfo();
        }
    }

    public void printMaxCntWord(){
        int maxCnt = 0;

        System.out.println("Слово с максимальным числом вхождений в файл:");
        for (WordCnt wc: wCnt){
            if (maxCnt < wc.getCount()) {
                maxCnt = wc.getCount();
            }
        }

        for (WordCnt wc: wCnt){
            if (maxCnt == wc.getCount()){
                wc.printInfo();
            }
        }

    }
}
