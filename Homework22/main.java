package JavaBasic.Homework22;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;

class BubbleSort {

    public static void sort(int[] mas){
      try (FileWriter fileWriter = new FileWriter("log.txt",true)){
        
        for (int i = mas.length; i > 0; i--)
        {
            for (int j = 1; j < i; j++)
            {
                if (mas[j] < mas[j-1]){
                    int temp = mas[j];
                    mas[j] = mas[j-1];
                    mas[j-1] = temp;
                }
            }
            StringBuilder log = new StringBuilder();

            String now = new SimpleDateFormat("YYYY-MM-dd HH:mm ").format(Calendar.getInstance().getTime());
            log.append(now);
            log.append("[");
          log.append(mas[0] + ", ");
            for(int k = 1; k < mas.length-1; k++){
                log.append(mas[k] + ", ");
            }
            log.append(mas[mas.length-1]+"]");
             
            fileWriter.write(log.toString()+"\n");
        }
      }
      catch (IOException e){
        boolean buuged = true;
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
    }
}
