public class svCNTTA extends K28CNTTA {

    public double a, b, c;

    public svCNTTA(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double dtbk1() {
        return (this.a + this.b + this.c) / 3;
    }
}
