package JavaBasic.Lesson_9;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/*
 * Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, 
 * который запишет эту строку в простой текстовый файл, обработайте исключения.
 */

public class main {

    static Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) {
        String filePath = "C:\\Users\\gavri\\OneDrive\\Учеба\\GeekBrains\\6. Java знакомство и как пользоваться базовым API\\Practice\\JavaBasic\\Lesson_9\\test.txt";
        String logPath = "C:\\\\Users\\\\gavri\\\\OneDrive\\\\Учеба\\\\GeekBrains\\\\6. Java знакомство и как пользоваться базовым API\\\\Practice\\\\JavaBasic\\\\Lesson_9\\\\log.txt";
        String s = "test";
        int n = 10;

        createLogger(logPath);

        String res = repeat(s, n);
        writeInFile(res, filePath);
        readFile(filePath);

        closeLogger();
    }

    static void createLogger(String logPath) {
        FileHandler handler = null;
        SimpleFormatter formatter = new SimpleFormatter();

        try {
            handler = new FileHandler(logPath);
            logger.addHandler(handler);
            handler.setFormatter(formatter);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    static void closeLogger(){
        Handler[] handlers = logger.getHandlers();
        for (Handler handler: handlers) {
            handler.close();
        }
    }

    static String repeat(String s, int n){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append(s);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }

    static void writeInFile(String res, String filePath){

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(res);
            writer.flush();
            logger.info("Zapis proshla uspeshno");
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            logger.warning(String.format("Zapis proshla uspeshno", e.getMessage()));
        } 
    }

    static void readFile(String filePath) {
        File file = new File(filePath);
        try (Scanner scanner = new Scanner(file);) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        
    }
}
