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
       
       Producao p1 = new Producao("João", "fjfie3893", 50.00);
       p1.registrarHorasDiurnas(20);
       p1.registrarHorasNoturnas(20);
       p1.hollerith();
       p1.novoMes();
       p1.hollerith();
       
       Vendedores v1 = new Vendedores("Cleber", "rjf84udj93", 2300.00);
       v1.registrarVenda(4000.00);
       v1.hollerith();
    }
    
}
