package tecelagem;

public class Tecelagem {

    public static void main(String[] args) {
       Administracao a1 = new Administracao("Marcia", "832hfhrue", 2500.00);
       a1.hollerith();
       a1.registrarFalta();
       a1.registrarFalta();
       a1.hollerith();
       a1.novoMes();
       a1.hollerith();
    }
    
}
