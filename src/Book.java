public class Book {
    private String nameBook;
    private Author author;
    int age;

    public Book (String nameBook1, Author author, int age1) {
        this.nameBook = nameBook1;
        this.author = author;
        this.age = age1;
    }

    public String getName() {
        return this.nameBook;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAge(int age) {
        this.age= age;
    }
}
