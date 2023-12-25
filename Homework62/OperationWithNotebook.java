package JavaBasic.Homework62;

import java.util.*;

public class OperationWithNotebook {

    private Set<Notebook> notebooks = new HashSet<>();
    private List<Criterion> criterionList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public void printList(){
        for (Notebook notebook : notebooks){
            if (notebookIsCorrect(notebook)){
                System.out.println(notebook);
            }
        }
    }

    public boolean notebookIsCorrect(Notebook notebook){

        for (Criterion criterion : criterionList){
            Object valueNotebook = null;

            if (criterion.property.equals("manufacturer")){
                valueNotebook = notebook.getManufacturer().toLowerCase();
            }else if (criterion.property.equals("model")){
                valueNotebook = notebook.getModel().toLowerCase();
            }else if (criterion.property.equals("operatingSystem")){
                valueNotebook = notebook.getOperatingSystem().toLowerCase();
            }else if (criterion.property.equals("cpu")){
                valueNotebook = notebook.getCPU().toLowerCase();
            }else if (criterion.property.equals("amountRAM")){
                valueNotebook = notebook.getAmountRAM();
            }else if (criterion.property.equals("amountHDD")){
                valueNotebook = notebook.getAmountHDD();
            }else if (criterion.property.equals("color")){
                valueNotebook = notebook.getColor().toLowerCase();
            }else if (criterion.property.equals("price")){
                valueNotebook = notebook.getPrice();
            }else {
                continue;
            }

            if (criterion.value != null && !criterion.value.equals(valueNotebook)){
                return false;
            }

            if (criterion.maxValue != null && criterion.maxValue < Double.parseDouble(Objects.toString(valueNotebook))){
                return false;
            }

            if (criterion.minValue != null && criterion.minValue > Double.parseDouble(Objects.toString(valueNotebook))){
                return false;
            }
        }

        return true;
    }
    public OperationWithNotebook(Set<Notebook> notebooks) {
        this.scanner = new Scanner(System.in);
        this.notebooks = notebooks;
    }

    public OperationWithNotebook(Set<Notebook> notebooks, List<Criterion> criterionList) {
        this.scanner = new Scanner(System.in);
        this.notebooks = notebooks;
        this.criterionList = criterionList;
    }

    public int getCriteria(){
        String text = "Введите цифру, соответствующую необходимому фильтру: ";

        List<String> properties = propertiesForFilter();

        for (int i = 0; i < properties.size(); i++)
        {
            text += "\n" + (i + 1) + ". " + getPropertyDescription(properties.get(i));
        }

        System.out.println(text);

        int value = scanner.nextInt();

        return value;
    }

    public String getPropertyDescription(String property){

        Map<String, String> descriptionsProperties = descriptionsProperties();

        return descriptionsProperties.get(property);

    }

    public Map<String, String> descriptionsProperties(){
        Map<String, String> map = new HashMap<>();

        map.put("manufacturer", "Производитель");
        map.put("operatingSystem", "Операционная система");
        map.put("cpu", "Процессор");
        map.put("amountRAM", "Объем оперативной памяти");
        map.put("amountHDD", "Объем жесткого диска");
        map.put("color", "Цвет");
        map.put("price", "Цена");
       

        return map;

    }

    public List<String> propertiesForFilter(){
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

    public String getOperations(){

        String text = "Выберите опрерацию: \n " +
                "1. Добавить фильтр \n " +
                "2. Вывести список ноутбуков \n " +
                "3. Завершить";

        System.out.println(text);

        String answer = scanner.next();

        return answer;
    }

    public Set<String> quantitativeSelection(){
        Set<String> set = new HashSet<>();
        set.add("amountRAM");
        set.add("amountHDD");
        set.add("price");

        return set;
    }

    public Set<String> stringSelection(){
        Set<String> set = new HashSet<>();

        set.add("manufacturer");
        set.add("model");
        set.add("operatingSystem");
        set.add("cpu");
        set.add("color");

        return set;
    }

    public void start(){

        boolean flag = true;
        while (flag){

            String operation = getOperations();
            if (operation.equals("3")){
                flag = false;
                scanner.close();
                continue;
            }else if(operation.equals("1")){

                int criterion = getCriteria();
                List<String> properties = propertiesForFilter();
                if (criterion - 1 < 0 || criterion - 1 > properties.size() - 1){
                    System.out.println("Введено некорректное значение");
                    continue;
                }
                String property = properties.get(criterion - 1);
                Criterion criterionObject = null;
                try {
                    if (quantitativeSelection().contains(property)){
                        criterionObject = Criterion.startGetting(scanner, property, true);
                    }else {
                        criterionObject = Criterion.startGetting(scanner, property, false);
                    }
                }catch (Exception e){
                    System.out.println("Ошибка при выборе фильтра");
                    continue;
                }
                if (criterionObject != null){
                    System.out.println("Фильтр добавлен");
                    criterionList.add(criterionObject);
                }
            }
            else if (operation.equals("2")){
                printList();
            }
        }
    }
}