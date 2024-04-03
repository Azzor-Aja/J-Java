package pcpbo;
public class Monitor {
    private String merk;
    private int resolusi;
    
    public String getMerk(){
        return merk;
    }
    
    public void setMerk(String merk){
        this.merk = merk;
    }
    
    public int getResolusi(){
        return resolusi;
    }
    
    public void setResolusi(int resolusi){
        this.resolusi = resolusi;
    }
    
    public void dispSpecMonitor(){
    System.out.println("--- DATA Monitor ---");
    System.out.println("Merk Monitor :" + this.getMerk());
    System.out.println("Resolusi Monitor :" + this.getResolusi());
    }
}
