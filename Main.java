public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника " + fullName);
    }

    public static void task2() {

        var fullName = String.format("Ivanov Ivan Ivanovich");
        var result = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета  " + result);
    }

    public static void task3() {
        var fullName = "Иванов Семён Семёнович";
        var split = fullName.split(" ");
        String result = "";
        for (String current : split) {
            if (current.contains("ё")) {
                var text = current.replace("ё", "е");
                result += text;
            } else {
                result += current;
            }
            result += " ";
            System.out.printf("Данные ФИО сотрудника - %s", result);
        }
    }
}