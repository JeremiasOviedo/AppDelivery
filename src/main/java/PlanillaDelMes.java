
public class PlanillaDelMes extends Valores {
    
    
    private int idMes;
    private PlanillaDelDia dias[];
    private static int contadorMeses;
    private int contadorDias;
    private static final int MAX_DIAS = 31;
    private int totalGananciasMes;
    
    
    
   public PlanillaDelMes () {
       
     this.idMes = ++contadorMeses;
     dias = new PlanillaDelDia[MAX_DIAS];
     
   }
    
   public void AgregarDia (PlanillaDelDia dia){
       
       if (this.contadorDias < MAX_DIAS){
           dias [this.contadorDias++] = dia;
       } else {
           System.out.println("Has superado el limite de dias.") ;
       }
           
       
       
   }
   
 
   
    
}
