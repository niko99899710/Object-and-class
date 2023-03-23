public class Mimi {
    String nameWriter;
    String nameBook;
    int ageBook;

     public Mimi(String nameBook, String nameWriter, int ageBook) {
         this.nameBook = nameBook;
         this.nameWriter = nameWriter;
         this.ageBook = ageBook;
     }

     public Mimi (String nameBook, String nameWriter) {
        this.nameBook = nameBook;
         this.nameWriter = nameWriter;
     }

    public String getNameBook() {
        return nameBook;
    }

    public String getNameWriter() {
        return nameWriter;
    }

    public void setAgeBook(int ageBook) {
        this.ageBook = ageBook;
    }
}
