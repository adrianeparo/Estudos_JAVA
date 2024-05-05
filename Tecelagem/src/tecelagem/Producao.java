package tecelagem;

/*
    Os da produção são horistas, 
    recebem por hora trabalhada e trabalham em turnos onde parte das horas são diurnas e parte são noturnas.
    Para os funcionários da produção, o salário base é o valor por hora que eles recebem
 
    Métodos Para os funcionários da produção:

 - void registrarHorasDiurnas(int horas) e void registrarHorasNoturnas(int horas): 
    O número de horas diurnas e noturnas vão sendo acumulados durante o mês 
    e usados depois para calcular o salário final do funcionário. 
    As horas diurnas são pagas de acordo com o salário base do funcionário. 
    As horas noturnas têm um acréscimo de 30% sobre o valor das horas diurnas.

 - método novoMes( ) zera a quantidade de horas diurnas e noturnas.
*/


public class Producao extends Pessoa {
    
    private int horasDiurnas;
    private int horasNoturnas;

    public Producao(String nome, String rg, Double salario) {
        super(nome, rg, salario);
        this.horasDiurnas = 0;
        this.horasNoturnas = 0;
    }

    public int getHorasDiurnas() {
        return horasDiurnas;
    }

    public int getHorasNoturnas() {
        return horasNoturnas;
    }
    
    public void registrarHorasDiurnas(int horas){
        horasDiurnas = horas;
    }
    
    public void registrarHorasNoturnas(int horas){
        horasNoturnas = horas;
    }
    
    @Override
    public Double SalarioLiquido(){
        return (getSalario()* horasDiurnas)+(getSalario()*(horasNoturnas * 1.30));
    }
    
    @Override
    public void novoMes(){
        horasDiurnas = 0;
        horasNoturnas = 0;
    }
    
    @Override
    public void hollerith(){
        super.hollerith();
        System.out.println("Horas Diurnas : " + horasDiurnas);
        System.out.println("Horas Noturnas : " + horasNoturnas);
        System.out.println("Salario Base : " + getSalario());
        System.out.println("Salrio Liquido : " + SalarioLiquido());
        System.out.println("==================================================");
        
    }
    
    
    
    
    
}
