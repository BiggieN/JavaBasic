package JavaBasic.Homework62;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class main {
    public static void main(String[] args) {

        Set<Notebook> set = new HashSet<>();
            set.add(new Notebook("Honor", "MagicBook 15", "Windows10", "AMD Ryzen 7 5700U", 16, 512, "Grey", 1799));
            set.add(new Notebook("Lenovo", "IdeaPad 1", "Wndows11", "AMD Ryzen 5 5500U", 16, 512, "Black", 1879));
            set.add(new Notebook("Lenovo", "IdeaPad Gaming 3", "Windows11", "Intel Core i7 12650H", 16, 512, "Grey", 3499));
            set.add(new Notebook("Asus", "VivoBook Pro 15", "Ubuntu", "Intel Core i5 11300H", 16, 512, "Blue", 2599));
            set.add(new Notebook("MSI", "Katana 17", "Debian12", "Intel Core i5 12450H", 16, 512, "Red", 3799));
            set.add(new Notebook("Xiaomi", "RedmiBook Pro 14 2022", "Windows10", "Intel Core i7 12650H", 16, 512, "Silver", 2934));
		    set.add(new Notebook("Huawei", "MateBook D 15", "Windows10", "Intel Core i5 1155G7", 8, 512, "Silver", 1779));
		    set.add(new Notebook("Apple", "Macbook Air 13\" M1 2020", "MacOS", "Apple M1", 8, 256, "White", 3078));
        
        OperationWithNotebook operation = new OperationWithNotebook(set);
        operation.start();

    }
}