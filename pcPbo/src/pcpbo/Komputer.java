/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pcpbo;
public class Komputer {
    public static void main(String[] args) {
        CPU cu = new CPU();
        Monitor mn = new Monitor();
        Printer pr = new Printer();
        
        cu.setMerkCPU("Simbada");
        cu.setKecepatan(3000);
        
        mn.setMerk("Lenovo");
        mn.setResolusi(2160);
        
        pr.setTipePrinter("Ink Jets");
        pr.setMerk("Epson");
        
        cu.dispSpecCPU();
        mn.dispSpecMonitor();
        pr.dispSpecPrinter();
    }
}
