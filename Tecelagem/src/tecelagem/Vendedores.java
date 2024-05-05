package tecelagem;
/*os vendedores recebem um valor fixo mais comissão sobre as vendas
o salário base para os vendedores é a parte fixa do salário.

Métodos para os vendedores:

    - void registrarVenda(double valor): As vendas de cada vendedor vão sendo acumuladas durante o mês 
    e depois usadas para calcular seu salário líquido.
    Além do salário fixo, os vendedores recebem 3% de comissão sobre 
    o valor total das vendas durante o mês. 

    - O método novoMes( ) zera o total de vendas.
*/

public class Vendedores extends Pessoa {
    private Double totalVendas;

    public Vendedores(String nome, String rg, Double salario) {
        super(nome, rg, salario);
        this.totalVendas = 0.0;
    }

    public Double getTotalVendas() {
        return totalVendas;
    }
    
    public void registrarVenda(double valor){
        totalVendas = valor;
    }
    
    @Override
    public void novoMes(){
        totalVendas = 0.0;
    }
    
    @Override
    public Double salarioLiquido(){
        return getSalario() + (totalVendas * 0.03);
    }
    
    @Override
    public void hollerith(){
        super.hollerith();
        System.out.println("Valor total de vendas : " + totalVendas);
        System.out.println("Salario base : " + getSalario());
        System.out.println("Salario Liquido : " + salarioLiquido());
        System.out.println("==================================================");
    }
    
    
    
}
