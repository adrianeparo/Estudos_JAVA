package faculdade;
public abstract class Pessoa {
  private String nome;
  private String RG;
  private Integer qtdFilhos;

    public Pessoa(String nome, String RG, Integer qtdFilhos) {
        this.nome = nome;
        this.RG = RG;
        this.qtdFilhos = qtdFilhos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public Integer getQtdFilhos() {
        return qtdFilhos;
    }

    public void setQtdFilhos(Integer qtdFilhos) {
        this.qtdFilhos = qtdFilhos;
    }
  
  
    public void hollerith(){
        System.out.println("===========================================");
        System.out.println("Nome : " + nome);
        System.out.println("RG : " + RG);
        System.out.println("Quantidade de filhos : " + qtdFilhos);
    }
    
    public abstract double calcularSalario();
    public abstract void zerarMes();
}
