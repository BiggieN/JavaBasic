package JavaBasic.Homework62;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Notebook {

    private String manufacturer;
    private String model;
    private String operatingSystem;
    private String cpu;
    private int amountRAM;
    private int amountHDD;
    private String color;
    private int price;
    

    public Notebook(String manufacturer, String model, String operatingSystem, String cpu, int amountRAM, int amountHDD, String color, int price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.operatingSystem = operatingSystem;
        this.cpu = cpu;
        this.amountRAM = amountRAM;
        this.amountHDD = amountHDD;
        this.color = color;
        this.price = price;
    }

    public boolean validateObject(){
        return true;
    }

    public static List<String> propertiesForFilter(){
        List<String> list = new ArrayList<>();
        list.add("manufacturer");
        list.add("operatingSystem");
        list.add("cpu");
        list.add("amountRAM");
        list.add("amountHDD");
        list.add("color");
        list.add("price");        
        return list;
    }

    @Override
    public String toString() {
        return "Ноутбук: " + manufacturer + " " + model + ": " + "операционная система: " + operatingSystem +
                ", процессор:" + cpu + ", количество опретивной памяти:" + amountRAM +
                ", объем жесткого диска:" + amountHDD + ", цвет:" + color + ", цена: " + price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getCPU() {
        return cpu;
    }

    public void setCPU(String cpu) {
        this.cpu = cpu;
    }

    public int getAmountRAM() {
        return amountRAM;
    }

    public void setAmountRAM(int amountRAM) {
        this.amountRAM = amountRAM;
    }

    public int getAmountHDD() {
        return amountHDD;
    }

    public void setAmountHDD(int amountHDD) {
        this.amountHDD = amountHDD;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}