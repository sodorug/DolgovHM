package fileWordCounter;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileProcess{
    private String filePath;
    private List<WordCnt> wCnt;
    private String[] wordArray;

    public FileProcess(String filePath){
      this.filePath = filePath;
    }
    /*Читаем из файла слова*/
    public void ReadWords(){
        FileInputStream fis = null;
        byte[] data = null;
        try {
            File file = new File(filePath);
            fis = new FileInputStream(file);
            data = new byte[(int) file.length()];
            fis.read(data);
        } catch (FileNotFoundException exc) {
            System.out.println("файл не найден");
        } catch (IOException exc) {
            System.out.println("ошибка чтения из файла");
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        /*переводим полученный байтовый массив в строку*/
        String s = null;
        try {
            s = new String(data, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return;
        }
        /*разбили текст на массив из слов, слова беред друг за другом через переменную в скобках*/
        wordArray = s.split(" ");
        /*соритруем в алфавитном порядке */
        Arrays.sort(wordArray);

        wCnt = new ArrayList<WordCnt>();
        String lastWord = null;
/*обходим весь массив s и записываем в список уникальные слова, и количество повторов слов*/
        for (String str: wordArray) {
            if (lastWord != null && str.equals(lastWord)) {
                wCnt.get(wCnt.size()-1).incCount();
            }
            else{
                wCnt.add(new WordCnt(str));
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
        /*В maxCnt запоминаем макс. число вхождений слова*/
        for (WordCnt wc: wCnt){
            if (maxCnt < wc.getCount()) {
                maxCnt = wc.getCount();
            }
        }

        /*Для всех слов, число вхождений которых, совпадает с maxCnt печатаем информацию*/
        for (WordCnt wc: wCnt){
            if (maxCnt == wc.getCount()){
                wc.printInfo();
            }
        }

    }
}
