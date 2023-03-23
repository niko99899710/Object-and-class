public class Book {
    String name;
    String writer;
    int age;

    public Book (String name1, String writer1, int age1) {
        this.name = name1;
        this.writer = writer1;
        this.age = age1;
    }

    public String getName() {
        return this.name;
    }

    public String getWriter() {
        return this.writer;
    }
    public void setAge(int age) {
        this.age= age;
    }
}
