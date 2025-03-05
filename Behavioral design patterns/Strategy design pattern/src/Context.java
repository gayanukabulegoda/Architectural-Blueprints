public class Context {
    private Strategy strategy;

    // Constructor accepts a strategy
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    // Setter to change the strategy at runtime
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    // Executes the algorithm defined by the current strategy
    public int executeStrategy(int num1, int num2) {
        return strategy.execute(num1, num2);
    }
}