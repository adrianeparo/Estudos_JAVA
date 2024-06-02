
package examenoturno;
/*A classe para os alunos precisa registrar código do aluno (valor inteiro), seu 
nome, a nota final e a quantidade de faltas.*/
public class Aluno {
    
    private Integer codAluno;
    private String nome;
    private Double notaFinal;
    private Integer qtdFaltas;

    public Aluno(Integer codAluno, String nome) {
        this.codAluno = codAluno;
        this.nome = nome;
        this.notaFinal = 0.0;
        this.qtdFaltas = 0;
    }
    
    public Integer getCodAluno() {
        return codAluno;
    }

    public void setCodAluno(Integer codAluno) {
        this.codAluno = codAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNotaFinal() {
        return notaFinal;
    }

    public Integer getQtdFaltas() {
        return qtdFaltas;
    }

    public void setNotaFinal(Double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public void setQtdFaltas(Integer qtdFaltas) {
        this.qtdFaltas = qtdFaltas;
    }
    
}
    
