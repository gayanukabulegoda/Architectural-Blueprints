package facade;
/**
 * HomeTheater interface - facade interface that provides a unified interface to the client.
 */
public interface HomeTheater {
    void watchMovie(String movieName);
    void stopMovie();
}