
package examenoturno;

public class ExameNoturno {

    public static void main(String[] args) {
        
        Turma turma1 = new Turma("Biologia", 40);
        
        Aluno a1 = new Aluno(1, "Aluno A");
        Aluno a2 = new Aluno(2, "Aluno B");
        Aluno a3 = new Aluno(3, "Aluno C");
        Aluno a4 = new Aluno(4, "Aluno D");
        Aluno a5 = new Aluno(5, "Aluno E");
        Aluno a6 = new Aluno(6, "Aluno F");
        Aluno a7 = new Aluno(7, "Aluno G");
        Aluno a8 = new Aluno(8, "Aluno H");
        Aluno a9 = new Aluno(9, "Aluno I");
        Aluno a10 = new Aluno(10, "Aluno J");
        Aluno a11 = new Aluno(11, "Aluno K");
        Aluno a12 = new Aluno(12, "Aluno L");
        Aluno a13 = new Aluno(13, "Aluno M");
        Aluno a14 = new Aluno(14, "Aluno N");
        Aluno a15 = new Aluno(15, "Aluno O");
        Aluno a16 = new Aluno(16, "Aluno P");
        Aluno a17 = new Aluno(17, "Aluno Q");
        Aluno a18 = new Aluno(18, "Aluno R");
        Aluno a19 = new Aluno(19, "Aluno S");
        Aluno a20 = new Aluno(20, "Aluno T");
        Aluno a21 = new Aluno(21, "Aluno U");
        
       //Incluir aluno 
       try{
           turma1.incluirAluno(a1);
           turma1.incluirAluno(a2);
           turma1.incluirAluno(a3);
          /* turma1.incluirAluno(a4);
           turma1.incluirAluno(a5);
           turma1.incluirAluno(a6);
           turma1.incluirAluno(a7);
           turma1.incluirAluno(a8);
           turma1.incluirAluno(a9);
           turma1.incluirAluno(a10);
           turma1.incluirAluno(a11);
           turma1.incluirAluno(a12);
           turma1.incluirAluno(a13);
           turma1.incluirAluno(a14);
           turma1.incluirAluno(a15);
           turma1.incluirAluno(a16);
           turma1.incluirAluno(a17);
           turma1.incluirAluno(a18);
           turma1.incluirAluno(a19);
           turma1.incluirAluno(a20);
           turma1.incluirAluno(a21);*/
       }catch (Exception e){
           System.out.println(e);
       }
       
       //buscar aluno
       turma1.buscarAluno(2);
       turma1.buscarAluno(20);
       
      //registrar falta
      try{
      turma1.registrarFalta(1);
      turma1.registrarFalta(2);
      turma1.registrarFalta(1);
      turma1.registrarFalta(3);
      }catch (Exception e){
          System.out.println(e);
      }
              
    //registrar nota final
    try{
     turma1.atribuirNota(1, 5.5);
     turma1.atribuirNota(2, 9.5);
     turma1.atribuirNota(3, 6.0);
    }catch (Exception e){
        System.out.println(e);
    }
    
    //listarAlunos
    turma1.listarAlunos();
    //listarAprovados
    turma1.listarAprovados();
    
}
}