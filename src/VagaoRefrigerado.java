public class VagaoRefrigerado extends Vagao{
    private int temp;

    public VagaoRefrigerado (String descricao, double capacidadeCarga, int temp) {
        super(descricao, capacidadeCarga);
        this.temp = temp;
    }
    
    public int getTemp(){ 
        return temp;
    } 
    
    public String tostring(){ 
        return super.toString() + ", temperatura= " + getTemp();
    }
    
}