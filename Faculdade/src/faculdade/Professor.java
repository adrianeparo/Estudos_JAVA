
package faculdade;

public class Professor extends Pessoa {
    private String curso;
    private Double horaAula;
    private Integer qtdAula;

    public Professor(String curso, String nome, String RG, Integer qtdFilhos, Double horaAula) {
        super(nome, RG, qtdFilhos);
        this.curso = curso;
        this.horaAula = horaAula;
        this.qtdAula = 0;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Double getHoraAula() {
        return horaAula;
    }

    public void setHoraAula(Double horaAula) {
        this.horaAula = horaAula;
    }

    public Integer getQtdAula() {
        return qtdAula;
    }

    public void registrarAulas(int qtd){
        qtdAula+=qtd;
    }
    
    @Override
    public double calcularSalario(){
       return (qtdAula*horaAula)+(100 * this.getQtdFilhos());
    }
    
    @Override
    public void zerarMes(){
        qtdAula = 0;
    }
    
    @Override
    public void hollerith(){
        super.hollerith();
        System.out.println("Curso: " + curso);
        System.out.println("Valor da hora aula: " + horaAula);
        System.out.println("Quantidade de aulas no mês: " + qtdAula);
        System.out.println("Salário : R$" + this.calcularSalario());
        System.out.println("===========================================");
        
    }
}

