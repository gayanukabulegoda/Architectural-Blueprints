package subsystems;

public interface DVDPlayer extends PowerSystem {
    void playMovie(String movieName);
    void stopMovie();
}