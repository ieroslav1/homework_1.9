public class Book {
    private final String name;
    private final Author author;
    private Integer year;

    public Book(String name, Author author, Integer year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
