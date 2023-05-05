import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortVagao implements Comparator<Vagao> {
    @Override
    public int compare(Vagao a, Vagao b){
        return a.getDescricao().compareTo(b.getDescricao());
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        

        // Vagao v1 = new Vagao();
        // Vagao v2 = new Vagao();
        
        
        // System.out.println(v1.getIdentificador());
        // System.out.println(v2.getIdentificador());

        // System.out.println(Vagao.getProxIdent());

        // CadastroVagoes<VagaoRefrigerado> cv = new CadastroVagoes<VagaoRefrigerado>();
        // VagaoRefrigerado vr1 = new VagaoRefrigerado(null, 0, 0);
        // cv.cadastra(vr1);

        // System.out.println(cv.qtdade());
        // ArrayList<String> array = new ArrayList<String>();
        // System.out.println("Hello, World!");

        {
            // Questão 6
            Cardapio cardapio = new Cardapio(); // Classe cardapio, com metodo toString
            
            cardapio.addPrato("batata frita"); // Adiciona pratos
            cardapio.addPrato("Arroz");

            VagaoRestaurante vr = new VagaoRestaurante(null, 0, cardapio); // Classe vagaoRestaurante que recebe Cardapios

            Vagao v = vr; // Variável v c/ uma referencia a uma classe derivada

            if(v instanceof VagaoRestaurante){ // Verifico se v armazena uma referencia a instancia vagaoRestaurante
                System.out.println(((VagaoRestaurante)v).getCardapio().toString()); // Caso sim, printo o cardapio
            }
             // - - -- - - - - - - - - - - - - -
        }
 
        
        {
            //  Questao 7
            CadastroVagoes<Vagao> vagoes = new CadastroVagoes<Vagao>();
            Vagao v1 = new Vagao("a", 100);
            Vagao v2 = new Vagao("b", 300);
            Vagao v3 = new Vagao("z", 500);
            Vagao v4 = new Vagao("g", 700);
            Vagao v5 = new Vagao("h", 900);
            Vagao v6 = new Vagao("c", 1000);

            vagoes.cadastra(v1);
            vagoes.cadastra(v2);
            vagoes.cadastra(v3);
            vagoes.cadastra(v4);
            vagoes.cadastra(v5);
            vagoes.cadastra(v6);

            List<Vagao> list = vagoes.getVagoesPorPeso(500);

            Collections.sort(list, new SortVagao());
            for(Vagao v : list){
                System.out.println(v.getDescricao() + " " + v.getCapacidadeCarga());
            }
        }
    }
    //Questao 8

    //a) Herança é observada, visto que existe uma classe "pai" que é a classe "Vagao", e uma classe "filha", que ´a classe "VagaoRefrigerado".
    //b) Polimorfismo é observado nos métodos "ToString()" das classes pai e filho ma herança observada anteriormente, demonstrando uma sobrescrita.
    //c) Sobrecarga é observado no "@Override" que é uitilizado para fazer a sobrecarga do operador de comparação, para que seja possivel comparar dois objetos.
    //d) 
    //e) Não, mas poderia ser utilizado para fazer uma sobrecarga do operador de comparação, ao invés disso, utilizei uma classe


}
