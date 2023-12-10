package JavaBasic.Lesson_11;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class main {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add("fsfsdf");
        list.add('c');
        list.add(null);
        list.add(3.144);
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Integer) {
                list.remove(i);
            }
        }
        
        System.out.println(list);
    }
}
