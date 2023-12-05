package JavaBasic.Homework12;

class Answer {
    public void printPrimeNums(){
        // Напишите свое решение ниже
        for (int i = 2; i <= 1000; i++) {
            Boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                int diff = i % j;
                if (diff == 0) {
                    isPrime = false;
                    break;
                }
            }
        if (isPrime == true){
            System.out.println(i);
            isPrime = false;
        }
        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class main { 
    public static void main(String[] args) { 
      
      Answer ans = new Answer();      
      ans.printPrimeNums();
    }
}