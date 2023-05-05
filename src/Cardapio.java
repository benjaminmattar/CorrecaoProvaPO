import java.util.ArrayList;

public class Cardapio {
    private ArrayList<String> Pratos;
    StringBuilder sb = new StringBuilder();
    public Cardapio(){
        Pratos = new ArrayList<>();
    }
    
    public void addPrato(String prato){
        Pratos.add(prato);
    }

    public String toString(){
        for (String i : Pratos) {
            sb.append(i.toString());
        }
        return sb.toString();

    }





}
