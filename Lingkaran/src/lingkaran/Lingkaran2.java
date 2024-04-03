package lingkaran;

public class Lingkaran2 {
    public static void main(String[] args) {
       double totalKeliling;
    Lingkaran l1 = new Lingkaran();
    Lingkaran l2 = new Lingkaran();
    Lingkaran l3 = new Lingkaran();
    l1.setRadius(10);
    l2.setRadius(25);
    l3.setRadius(125);

    System.out.println("Luas lingkaran dengan Radius :” +l1.getRadius()+  adalah "+l1.getLuas());
    System.out.println("Luas lingkaran dengan Radius:"+l2.getRadius()+ " adalah "+l2.getLuas());
    System.out.println("Luas lingkaran dengan Radius:"+l3.getRadius()+ " adalah "+l3.getLuas());
    totalKeliling =
    (l1.getKeliling()+l2.getKeliling()+l3.getKeliling());
    System.out.format("Total 3 keliling lingkaran :%.3f%n",totalKeliling);
}
}
