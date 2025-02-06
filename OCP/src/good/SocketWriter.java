package good;

public class SocketWriter implements Writer {
    @Override
    public void write(String content) {
        System.out.println("Writing content to socket : " + content);
    }
}