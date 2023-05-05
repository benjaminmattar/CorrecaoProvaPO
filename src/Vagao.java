public class Vagao {
    

    private int identificador; 
    private String descricao;
    private double capacidadeCarga;
    private static int proxident = 1;
    
    public Vagao(String descricao, double capacidadeCarga) {
        this.identificador = proxident;
        this.descricao = descricao;
        this.capacidadeCarga = capacidadeCarga;
        proxident = proxident + 1;
    }
    
    // Questao 1
    public Vagao(){
        this.capacidadeCarga = 5000;
        this.identificador=proxident;
        this.descricao=" ";
        this.proxident=proxident+1;
        

    }
    
    // Questao 2
    //O uso do atributo proxIdent é para, sempre que um "Vagao" for criado, ele apresentará um número a mais que o "Vagao" anterior. 
    //Resumidamente, o atributo "proxIdent" instanciado estaticamente funciona como um identificador para cada vagão. Ou seja, 
    //obrigatoriamente cada vagao instanciado receberá um identificador diferente uma vez que ele recebe este "ID" por meio
    //do "proxIdent" que, para cada novo vagão, recebe uma incrementação do seu valor.


    public static int getProxIdent(){
        return proxident;
    }
    
    
    public int getIdentificador() { 
        return identificador; 
    }

    public String getDescricao() { 
        return descricao; 
    } 

    public double getCapacidadeCarga() { 
        return capacidadeCarga;
    }
    
    public void setTrem(int id) {
        //this.trem = id; 
    }


    public String tostring() {
    
        String ss =  "Trem:" +
        "descricao= " +  descricao + ", "+
        "capacidadeCarga=" + capacidadeCarga + ", "+
        "Identificador=" + identificador ;
        return ss;
    }
}