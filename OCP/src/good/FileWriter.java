package good;

public class FileWriter implements Writer {
    @Override
    public void write(String content) {
        System.out.println("Writing content to file : " + content);
    }
}