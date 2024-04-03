package pcpbo;
public class Printer {
    private String merk;
    private String tipePrinter;
    
    public String getMerk (){
        return merk;
    }
    
    public void setMerk (String merk){
        this.merk = merk;
    }
    
    public String getTipePrinter (){
        return tipePrinter;
    }
    
    public void setTipePrinter (String tipePrinter) {
        this.tipePrinter = tipePrinter;
    }
    
    public void dispSpecPrinter(){
    System.out.println("--- DATA Printer ---");
    System.out.println("Merk Printer :" + this.getMerk());
    System.out.println("Tipe Printer :" + this.getTipePrinter());
    }

}
