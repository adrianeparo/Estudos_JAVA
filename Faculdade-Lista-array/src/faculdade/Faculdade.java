package faculdade;
public class Faculdade {
    public static void main(String[] args) {
        
       Professor p1 = new Professor("Banco de dados", "Clerivaldo", "4759046juy", 2, 230.50);
       Funcionario f1 = new Funcionario("Zelador", 1900.90, "Jose", "hfu8437", 3);
       Professor p2 = new Professor("História", "Marcia", "jfje9394", 4, 300.30);
       
       ListaPessoa lista = new ListaPessoa(2);
       lista.add(p1);
       lista.add(p2);
       lista.listagem();
       lista.add(f1);
       lista.listagem();
                           
               
    }
    
}
