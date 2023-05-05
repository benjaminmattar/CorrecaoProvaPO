import java.util.ArrayList;
import java.util.List;

//EXPLICACAO DA QUESTAO 5:
//Sim, é possível. Basta fazer com que a classe "CadastroVagoes" trabalhe em cima de um tipo genérico extendido da classe "Vagao". Este
//tipo genérico extendido poderá ser, portanto, o próprio vagão, ou o vagão refrigerado, uma vez que, a classe "VagaoRefrigerado" é 
//extendida da classe "Vagao" e possui os métodos utilizados "getIdentificador" e "getCapacidadeCarga".
public class CadastroVagoes<T extends Vagao>  {

private ArrayList<T> vagoes;

public CadastroVagoes (){
     vagoes = new ArrayList<>();
}

public void cadastra(T v){ 
    vagoes.add(v);
}

public int qtdade(){ 
    return vagoes.size(); 
}

public T getPorPosicao(int pos) {
    if (pos >=0 && pos < vagoes.size()){ 
        return vagoes.get(pos) ;
    } 
    else {
        return null;} 
    }

public T getPorId(int id){
    for (T vagao: vagoes) {
    if (vagao.getIdentificador() == id) {return vagao;}
        }
    return null;
}

    //Questao 4
        
        public List<T> getVagoesPorPeso (int peso){
            ArrayList<T> lista = new ArrayList<>();
            for(T i : vagoes) {
                if(i.getCapacidadeCarga()>=peso){
                    lista.add(i);
                }
            }
            return lista;
        }

        

}