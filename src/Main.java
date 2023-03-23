public class Main {

    public static void main(String[] args) {
        task_1_3_4_5();
        task_2_3_4();
        task_6_7();
    }

    public static void task_1_3_4_5() {
        System.out.println("Задание 1-3-4-5");
        Book book = new Book("The glass throne", "Sarah J. Maas", 2012);
        System.out.print("Название книги: " + book.getName() + ", ");
        System.out.print(" Автор: " + book.getWriter() + ", ");
        System.out.print(" год: " + book.age + ". " );
        book.setAge(2020);
        System.out.print(" (год: " + book.age + "). " );
        System.out.println();
    }

    public static void task_2_3_4() {
        System.out.println("Задание 2-3-4");
        Author sarah = new Author("Sarah", "Maas");
        System.out.print("Имя авторa - " + sarah.getName() + ", ");
        System.out.print(" Фамилия авторa - " + sarah.getSurname() + ". ");
        System.out.println();
    }

    public static void task_6_7() {
        System.out.println("Задание 6-7");
        Mimi mysticism = new Mimi ("Shadow Clan", "Erin Farron", 2023);
        System.out.print("Название книги: " + mysticism.getNameBook() + ", ");
        System.out.print(" Автор: " + mysticism.getNameWriter() + ", ");
        System.out.print(" год: " + mysticism.ageBook + ". " );
        mysticism.setAgeBook(2022);
        System.out.print(" (год: " + mysticism.ageBook + "). " );
        System.out.println();

        Mimi horror = new Mimi("Shiki", "Fuyumi");
        System.out.print("Название книги: " + horror.nameBook + ", ");
        System.out.print(" Автор: " + horror.nameWriter + ". ");
        System.out.println();
    }
}