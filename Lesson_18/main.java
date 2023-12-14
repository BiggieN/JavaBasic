package JavaBasic.Lesson_18;

/*
 * Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
 * 123456 Иванов
 * 321456 Васильев
 * 234561 Петрова
 * 234432 Иванов
 * 654321 Петрова
 * 345678 Иванов
 * Вывести данные по сотрудникам с фамилией Иванов.
 */



public class main {
    public static void main(String[] args) {
        UserData ud = new UserData();
        ud.addData("123456", "Иванов");
        ud.addData("321456", "Васильев");
        ud.addData("234561", "Петрова");
        ud.addData("234432", "Иванов");
        ud.addData("654321", "Петрова");
        ud.addData("345678", "Иванов");

        System.out.println(ud.findUserByName("Иванов"));
    }
}
