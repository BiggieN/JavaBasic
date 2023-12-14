package JavaBasic.Lesson_18;

import java.util.Map;
import java.util.HashMap;

public class UserData {
    Map<String, String> userData = new HashMap<>();

    void addData(String numPass, String name){
        userData.put(numPass, name);
    }

    String findUserByName(String userName){
        StringBuilder sb = new StringBuilder();
        for (String key: userData.keySet()) {
            if (userName.equals(userData.get(key))) {
                sb.append(key).append(": ").append(userData.get(key)).append("\n");
            }
        }
        return sb.toString();
    }
    
}