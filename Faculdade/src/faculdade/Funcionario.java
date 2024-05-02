package faculdade;
public class Funcionario extends Pessoa {
    private String departamento;
    private Double salario;
    private Integer faltas;

    public Funcionario(String departamento, Double salario, String nome, String RG, Integer qtdFilhos) {
        super(nome, RG, qtdFilhos);
        this.departamento = departamento;
        this.salario = salario;
        this.faltas = 0;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Integer getFaltas() {
        return faltas;
    }

    public void registrarFalta(){
        faltas++;
    }
    
    @Override 
    public double calcularSalario(){
        Double porcao;
        porcao = salario/20;
        Double desconto;
        desconto = porcao * faltas;
        return salario + 42.00 + (100 * this.getQtdFilhos()) - desconto;
    }
    
   @Override
   public void zerarMes(){
       faltas = 0;
   }
   
   @Override
   public void hollerith(){
       super.hollerith();
       System.out.println("Departamento : " + departamento);
       System.out.println("Quantidade de faltas : " + this.faltas);
       System.out.println("Salario : R$" + this.calcularSalario());
       System.out.println("===========================================");
   }
    
}
