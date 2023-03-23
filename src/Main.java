public class Main {

    public static void main(String[] args) {
      //  task1();
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задание 1");
        Book book = new Book("The glass throne", "Sarah J. Maas", 2012);
        System.out.print("Название книги: " + book.name + ", ");
        System.out.print(" Автор: " + book.writer + ", ");
        System.out.print(" год: " + book.age + ". " );
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задание 2");
        Author sarah = new Author();
        sarah.name = "Sarah";
        System.out.print("Имя авторa - " + sarah.name + ", ");
        sarah.surname = "Maas";
        System.out.print(" Фамилия автор - " + sarah.surname + ". ");
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задание 3");
    }

    public static void task4() {
        System.out.println("Задание 4");
    }

    public static void task5() {
        System.out.println("Задание 5");
    }

    public static void task6() {
        System.out.println("Задание 6");
    }

    public static void task7() {
        System.out.println("Задание 7");
    }

}