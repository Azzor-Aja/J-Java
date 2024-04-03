package lingkaran;
public class Lingkaran {
    final double PI = 3.14159;
    double radius;
    public void setRadius(double r) {
    this.radius = r;
    }
    public double getRadius(){
    return radius;
    }
    public double getLuas() {
    double luas=0;
    luas = 2 * PI * radius * radius;
    return luas;
    }
    public double getKeliling() {
    return 2 * PI * radius;
    }
}