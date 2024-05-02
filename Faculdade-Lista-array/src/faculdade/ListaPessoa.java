
package faculdade;


public class ListaPessoa {
    private Pessoa lista[];
    private Integer count;
    
    //Construtor 
    public ListaPessoa(int capMax){
        lista = new Pessoa[capMax];
        count = 0;
        
    }
    
    public boolean add(Pessoa p){
          // 1. Testar se cabe na lista -> Comparar contador com capacidade maxima.
          if(count >= lista.length){
              return false;
          }
          lista[count] = p;
          count++;
          return true;
    }
    
    public void listagem(){
        for(int i = 0; i < count; i++){
            lista[i].hollerith();
        }
    }
    
    
}
