package good;

public class DatabaseWriter implements Writer {
    @Override
    public void write(String content) {
        System.out.println("Writing to database: " + content);
    }
}