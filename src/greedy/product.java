package greedy;

public class product {
    double weight;
    double value;
    double ratio;

    public product() {
    }

    public product(double weight, double value) {
        this.weight = weight;
        this.value = value;
        this.ratio=this.value/this.weight;
    }

    @Override
    public String toString() {
        return "product{" +
                "weight=" + weight +
                ", value=" + value +
                ", ratio=" + ratio +
                '}';
    }
}
