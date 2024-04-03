package pcpbo;
public class CPU {
    private String merkCPU;
    private int kecepatan;
    
    public String getMerkCPU(){
        return merkCPU;
    }
    
    public void setMerkCPU(String merkCPU) {
        this.merkCPU = merkCPU;
    }
    
    public int getKecepatan(){
        return kecepatan;
    }
    
    public void setKecepatan (int kecepatan){
        this.kecepatan = kecepatan;
    }
    
    public void dispSpecCPU(){
    System.out.println("DATA CPU");
    System.out.println("Merk CPU :" + this.getMerkCPU());
    System.out.println("Kecepatan CPU :" + this.getKecepatan());
    }

    void setkecepatan(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
