package JavaBasic.Homework22;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.*;

class BubbleSort {  
    // создаем файл
    public static void sort(int[] mas){
      try {
            File log = new File("log.txt");
            log.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
      
      // отпределяем текущие дату и время
      Date dateNow = new Date();
      SimpleDateFormat formatForDateNow = new SimpleDateFormat("YYYY-MM-dd HH:mm");
      
      // сортируем пузырьком
      for (int i = 0; i < mas.length - 1; i++) {
            for(int j = 0; j < mas.length - i - 1; j++) {
            if(mas[j + 1] < mas[j]) {
                int swap = mas[j];
                mas[j] = mas[j + 1];
                mas[j + 1] = swap;
                }
            }
                String text1 = formatForDateNow.format(dateNow);
                String text2 = Arrays.toString(mas);
                String text3 = (text1 + " " + text2 + "\n");
                try {
                  FileWriter writer = new FileWriter("log.txt", true);
                  writer.write(text3);
                  writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                  }
        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class main{ 
    public static void main(String[] args) { 
      int[] arr = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        arr = new int[]{9, 4, 8, 3, 1};
      }
      else{
        arr = Arrays.stream(args[0].split(", "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
      }     
      
      BubbleSort ans = new BubbleSort();      
      ans.sort(arr);

      try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
      File file = new File("log.txt");

file.delete();
    }
}