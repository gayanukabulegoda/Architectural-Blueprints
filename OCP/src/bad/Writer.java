package bad;

public class Writer {
    public void writeToFile(String content) {
        System.out.println("Writing to file : " + content);
    }

    public void writeToSocket(String content) {
        System.out.println("Writing to socket : " + content);
    }

    public void writeToDatabase(String content) {
        System.out.println("Writing to database : " + content);
    }
}