/**
 * A Concrete product class that implements the Car interface.
 */
public class Sedan implements Car {
    @Override
    public String getDetails() {
        return "SEDAN - A car that is designed to be used on smooth surfaces.";
    }
}