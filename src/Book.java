public class Book {
    private String nameBook;
    private String nameWriter;
    private String surnameWriter;
    int age;

    public Book (String nameBook1, String nameWriter1, String surnameWriter1, int age1) {
        this.nameBook = nameBook1;
        this.nameWriter = nameWriter1;
        this.surnameWriter = surnameWriter1;
        this.age = age1;
    }

    public String getName() {
        return this.nameBook;
    }

    public String getWriter() {
        return this.nameWriter;
    }

    public String getSurnameWriter() {
        return surnameWriter;
    }

    public void setAge(int age) {
        this.age= age;
    }
}
