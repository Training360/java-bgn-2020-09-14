package prog;

// Immutable, azaz módosíthatatlan
public class SumResult {

    private int sum;

    private int min;

    public SumResult(int sum, int min) {
        this.sum = sum;
        this.min = min;
    }

    public int getSum() {
        return sum;
    }

    public int getMin() {
        return min;
    }
}
