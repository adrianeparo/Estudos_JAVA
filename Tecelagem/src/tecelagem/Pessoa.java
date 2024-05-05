
package tecelagem;

/*Faça uma hierarquia de classes que atenda as necessidades da tecelagem, 
sem duplicação de código e que contenha para todos os funcionários, os métodos abaixo. Não use construtores padrão. 
Faça construtores que inicializem os objetos com as informações necessárias.

        ->Cada funcionario precisa ter : Nome, Rg e Salário base.

 - double salarioLiquido( ): retorna o salário liquido do funcionário.
 - void hollerith( ): imprime o hollerith do funcionário especificando seus dados, seu salário base e tudo o que foi somado ou descontado do salário, finalizando com seu salário líquido.
 - void novoMes( ): zera as informações que são acumuladas durante o mês, iniciando o mês seguinte.*/

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
