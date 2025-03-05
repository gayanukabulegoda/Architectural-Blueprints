/**
 * Concrete strategy class that implements the Strategy interface.
 */
public class AdditionStrategy implements Strategy {
    @Override
    public int execute(int num1, int num2) {
        return num1 + num2;
    }
}