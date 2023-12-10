package JavaBasic.Homework21;

class Answer {  
    public static StringBuilder answer(String QUERY, String PARAMS){
        // Напишите свое решение ниже
        StringBuilder sb = new StringBuilder();
        StringBuilder sbArr = new StringBuilder();
        String tempString = null;
        sb.append(QUERY);
        PARAMS = PARAMS.replace('{', ' ').replace('}', ' ');
        String[] ParamsArr = PARAMS.split(",");
        for (int i = 0; i < ParamsArr.length; i++) {
            ParamsArr[i] = ParamsArr[i].replace("\"", "");
            sbArr.append(ParamsArr[i]);
        }

        for (int i = 0; i < ParamsArr.length; i++) {
            ParamsArr[i] = ParamsArr[i].replace(" ", "");
            ParamsArr[i] = ParamsArr[i].replace(":", "='");
        }

        for (int i = 0; i < ParamsArr.length - 2; i++) {
                sb.append(ParamsArr[i] + "' and ");
        }

        sb.append(ParamsArr[ParamsArr.length - 2] + "' ");

        return sb;
    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class main{ 
	public static void main(String[] args) { 
      String QUERY = "";
      String PARAMS = "";
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        QUERY = "select * from students where ";
	    PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
      }
      else{
        QUERY = args[0];
        PARAMS = args[1];
      }     
      
      Answer ans = new Answer();      
      System.out.println(ans.answer(QUERY, PARAMS));
	}
}