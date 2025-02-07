/**
 * A Concrete product class that implements the Car interface.
 */
public class Convertible implements Car {
    @Override
    public String getDetails() {
        return "CONVERTIBLE - A car that can be driven with its roof open or closed.";
    }
}