
package tecelagem;

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
        System.out.println("Salario : " + salarioLiquido());
        System.out.println("Faltas : " + faltas);
        System.out.println("==================================================");
    }
    
}
