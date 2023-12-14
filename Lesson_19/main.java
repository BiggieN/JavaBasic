package JavaBasic.Lesson_19;

import java.util.HashMap;

/*
 * Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет. 
 * Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, 
 * при этом повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. 
 * (Например, add - egg изоморфны)буква может не меняться, а остаться такой же. (Например, note - code)
 * Пример 1:
 * Input: s = "foo", t = "bar"
 * Output: false
 * 
 * Пример 2:
 * Input: s = "paper", t = "title"
 * Output: true
 */

public class main {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("add", "egg"));
        System.out.println(isIsomorphic("note", "code"));
        System.out.println(isIsomorphic("paper", "title"));
        System.out.println(isIsomorphic("foo", "bar"));
        System.out.println(isIsomorphic("bar", "foo"));
    }

    private static boolean isIsomorphic(String str1, String str2) {
        HashMap<Character, Character> map = new HashMap<>();
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (!map.containsKey(str1.charAt(i))) {
                if (map.containsValue(str2.charAt(i))) {
                    return false;
                }
                map.put(str1.charAt(i), str2.charAt(i));
            } else {
                if (map.get(str1.charAt(i)) != str2.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }
    
}
