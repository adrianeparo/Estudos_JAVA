
package tecelagem;

public abstract class Pessoa {
    private String nome;
    private String rg;
    private Double salario;

    public Pessoa(String nome, String rg, Double salario) {
        this.nome = nome;
        this.rg = rg;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    public void hollerith(){
        System.out.println("==================================================");
        System.out.println("Nome : " + nome);
        System.out.println("RG : " + rg);
    }
    
    public abstract void novoMes();
    public abstract Double salarioLiquido();
    
}
