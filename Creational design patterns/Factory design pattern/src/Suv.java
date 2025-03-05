/**
 * A Concrete product class that implements the Car interface.
 */
public class Suv implements Car {
    @Override
    public String getDetails() {
        return "SUV - A car that is designed to be used on rough surfaces.";
    }
}