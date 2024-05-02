package faculdade;
public class Faculdade {
    public static void main(String[] args) {
        
       Professor p1 = new Professor("Banco de dados", "Clerivaldo", "4759046juy", 2, 230.50);
       Funcionario f1 = new Funcionario("Zelador", 1900.90, "Jose", "hfu8437", 3);
       
       p1.hollerith();
       p1.registrarAulas(7);
       p1.hollerith();
       p1.zerarMes();
       p1.hollerith();
       
       f1.registrarFalta();
       f1.registrarFalta();
       f1.calcularSalario();
       f1.hollerith();
       f1.zerarMes();
       f1.hollerith();
      
                                   
                           
               
    }
    
}
