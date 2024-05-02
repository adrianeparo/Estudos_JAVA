
package abstrata;
public class Abstrata {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Jorge");
        v1.setIdade(25);
        v1.setSexo("M");
        System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        a1.setNome("Fernanda");
        a1.setMatricula(1111);
        a1.setCurso("ADS");
        a1.setIdade(17);
        a1.setSexo("F");
        a1.PagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Julia");
        b1.setMatricula(2222);
        b1.setCurso("Informática");
        b1.setIdade(16);
        b1.setSexo("F");
        b1.setBolsa(12.5f);
        b1.PagarMensalidade();
        
    }
    
}
