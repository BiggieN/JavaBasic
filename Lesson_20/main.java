package JavaBasic.Lesson_20;

import java.util.HashMap;
import java.util.Stack;

/*
 * Написать программу, определяющую правильность расстановки скобок в выражении.
 * Пример 1: a+(d*3) - истина
 * Пример 2: [a+(1*3) - ложь
 * Пример 3: [a+(1]*3) - ложь
 * Пример 4: [6+(3*3)] - истина
 * Пример 5: {a}[+]{(d*3)} - истина
 * Пример 6: <{a}+{(d*3)}> - истина
 * Пример 7: {a+]}{(d*3)} - ложь
 */

public class main {
    public static void main(String[] args) {
        
    }

    public static boolean isValid(String s)
    {

        Stack<Character> st = new Stack<>();
        HashMap<Character,Character> map = new HashMap<>();
        map.put('{', '}');
        map.put('(', ')');
        map.put('[', ']');
        map.put('<', '>');
        for(Character ch : s.toCharArray())
        {
            
            if(map.containsKey(ch))
            {
                st.push(ch);
            }
            if(map.containsValue(ch))
            {
                if (st.empty() || map.get(st.pop())!=ch){
                    return false;
                }
            }
            
        }
        return st.empty();
    }

    
}
