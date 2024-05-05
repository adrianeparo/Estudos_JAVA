
package tecelagem;

/*Os funcionários da administração têm salário fixo.
 No caso dos funcionários administrativos o salário base é o salário bruto do funcionário.

 Método Para os funcionários administrativos:

 - void registrarFalta( ): As faltas vão sendo acumuladas durante o mês e depois são descontadas do salário base para calcular o salário líquido.
Cada falta desconta 1/30 do salário base.
Este método incrementa em um o número de faltas. 

 - O método novoMes( ) zera a quantidade de faltas.
*/

public class Administracao extends Pessoa {
    private int faltas;

    public Administracao(String nome, String rg, Double salario) {
        super(nome, rg, salario);
        this.faltas = 0;
    }

    public int getFaltas() {
        return faltas;
    }

    public void registrarFalta(){
        faltas++;
    }
    
    @Override
    public Double salarioLiquido(){
        Double porcao;
        porcao = getSalario()/30;
        Double desconto;
        desconto = porcao * faltas;
        return getSalario()- desconto;
    }
    
    @Override
    public void novoMes(){
        faltas = 0;
    }
    
    @Override
    public void hollerith(){
        super.hollerith();
        System.out.println("Salario Base : " + getSalario());
        System.out.println("Salario : " + salarioLiquido());
        System.out.println("Faltas : " + faltas);
        System.out.println("==================================================");
    }
    
}
