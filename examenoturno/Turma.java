
package examenoturno;

/*Crie uma classe para as turmas e outra para os alunos. A 
classe das turmas precisa ter como atributos o nome do curso, a quantidade total de aulas e a 
lista de alunos*/

public class Turma {
    
   private String nomeCurso;
   private int qtdAulas;
   private Aluno lista[];
   //Variavel auxiliar para saber quantos espaços estão ocupados.
   private int count;
   
   //construtor
    public Turma(String nomeCurso, int qtdAulas) {
        this.nomeCurso = nomeCurso;
        this.qtdAulas = qtdAulas;
        this.lista = new Aluno[20];
        this.count = 0;
    }
    
    public void incluirAluno(Aluno al)throws Exception{
        //Primeira Exceção lançada: 
        /*verifica se a lista já está cheia, comparando o valor atual de count com o tamanho máximo permitido pela variável lista.
        Se count for igual ao comprimento de lista, isso significa que não há mais espaço para adicionar novos alunos, 
        e o método lança uma exceção*/
        if(count == lista.length)throw new Exception("Lista esta cheia!");
        
        //Loop de repetição para verificar codigos dos Alunos
        for(int i = 0; i < count; i++){
        
            //placeholder
            Aluno temp = lista[i];
            
            if(temp.getCodAluno() == al.getCodAluno()){
                System.out.println("Esse codigo já existe!");
                return;
            }
        }
        //Definindo valores
        al.setNotaFinal(0.0);
        al.setQtdFaltas(0);
        //Adicionando
        lista[count++]=al;
        System.out.println("Aluno foi adicionado a lista!");
    }
    
    public Aluno buscarAluno(int codigo){
        for(int i = 0; i < count; i++){
            
            Aluno temp = lista[i];
            //Procura codigo inserido na lista
            if(temp.getCodAluno() == codigo){
                System.out.println(temp.getNome());
                return temp;
            }
        }
        //Não encontrou o codigo na lista 
        System.out.println("Esse codigo nao esta na lista");
        return null;
    }
   
    public void registrarFalta(int codigo)throws Exception{
        
        for(int i = 0; i < count; i++){
            
            Aluno temp = lista[i];
            
            if(temp.getCodAluno() == codigo){
                //int incrementoFalta = temp.getQtdFaltas()+1;
                //temp.setQtdFaltas(incrementoFalta);
                temp.setQtdFaltas(temp.getQtdFaltas()+1);
                return;
            }
        }
        
       throw new Exception("Esse codigo nao existe na lista"); 
    }
    
    public void atribuirNota(int codigo, double nota)throws Exception{
        
        if(nota < 1 || nota > 10 )throw new Exception("Nota invalida");
        
        for(int i = 0; i < count; i++){
            Aluno temp = lista[i];
            if(temp.getCodAluno() == codigo){
              temp.setNotaFinal(nota);
                System.out.println("Nota Atribuida");
              return;
            }
        }
        
        throw new Exception("O codigo nao esta na lista..."); 
    }
    
    public void listarAlunos(){
        System.out.println("__________________________________________________");
        System.out.println("Nome do curso: " + nomeCurso);
        System.out.println("Quantidade de aulas: " + qtdAulas);
        System.out.println("__________________________________________________");
        
        for(int i = 0; i < count; i++){
            
            Aluno temp = lista[i];
            
            //transforma qtdAulas em double primeiro, antes da operação
            double freq = (((double)this.qtdAulas - temp.getQtdFaltas())/this.qtdAulas)*100;
            
            System.out.println("Codigo: " + temp.getCodAluno());
            System.out.println("Nome: " + temp.getNome());
            System.out.println("Nota Final: " + temp.getNotaFinal());
            System.out.println("Faltas: " + temp.getQtdFaltas());
            System.out.println("Frequencia: " + freq + "%");
            System.out.println("______________________________________________");
        }
    }
    
    public void listarAprovados(){
        System.out.println("__________________________________________________");
        System.out.println("Nome do curso: " + nomeCurso);
        System.out.println("Quantidade de aulas: " + qtdAulas);
        System.out.println("__________________________________________________");
        
        for(int i = 0; i < count; i++){
            
            Aluno temp = lista[i];
            
            double freq = (((double)this.qtdAulas - temp.getQtdFaltas())/this.qtdAulas)* 100;
            if(temp.getNotaFinal() >= 6.0 && freq >= 75){
                System.out.println("APROVADOS: ");
                System.out.println("Codigo: " + temp.getCodAluno());
                System.out.println("Nome: " + temp.getNome());
                System.out.println("Nota Final: " + temp.getNotaFinal());
                System.out.println("Faltas: " + temp.getQtdFaltas());
                System.out.println("Frequencia: " + freq + "%");
                System.out.println("______________________________________________");
                
            }
        }
    }
    
}