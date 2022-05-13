
import java.util.Scanner;

public class PlanillaDelDia extends Valores {

    private int idDia;
    private Viaje viajes[];
    private static int contadorDias;
    private int contadorViajes;
    private static final int MAX_VIAJES = 40;
    private int totalMonto;
    private int totalGanancias;
    private int totalPropinas;

    public PlanillaDelDia() {
        this.idDia = ++contadorDias;
        viajes = new Viaje[MAX_VIAJES];
    }
    
    public PlanillaDelDia(int totalGanancias) {
        this();
        this.totalGanancias = calcularGananciasDelDia ();
      
    }

    public void agregarViaje(Viaje viaje) {
        if (this.contadorViajes < MAX_VIAJES) {
            viajes[this.contadorViajes++] = viaje;
        } else {
            System.out.println("Has superado el limite de viajes en el dia.");
        }

    }

    public void quitarViaje() {
        mostrarPlanilla();
        System.out.println("Por favor seleccione el viaje a borrar:");
        Scanner scanner = new Scanner(System.in);
        int elemento = (scanner.nextInt() - 1);

        for (int i = elemento; i < contadorViajes - 1; i++) {
            viajes[i] = viajes[i + 1];
        }
        viajes[contadorViajes - 1] = null;
        contadorViajes--;

        System.out.println("Viaje quitado con exito");

    }

    public void agregarPropina() {
        System.out.println("Escriba el monto de la propina:");
        Scanner scanner = new Scanner(System.in);
        totalPropinas += scanner.nextInt();
        System.out.println("Propina agregada con exito.");

    }

    public int calcularMontoDelDia() {
        this.totalMonto = 0;
        for (int i = 0; i < contadorViajes; i++) {
            Viaje viaje = this.viajes[i];
            totalMonto += viaje.getMonto();
        }
        return totalMonto;
    }

    public int calcularGananciasDelDia() {
        this.totalGanancias = 0;
        for (int i = 0; i < contadorViajes; i++) {
            Viaje viaje = this.viajes[i];
            totalGanancias += viaje.getValorDelViaje();
        }
        return totalGanancias + totalPropinas;
    }

    public void mostrarPlanilla() {
        System.out.println("Dia numero:" + this.idDia);

        for (int i = 0; i < this.contadorViajes; i++) {
            System.out.println("Viaje " + (i + 1) + ":" + viajes[i]);

        }

    }

    public void terminarDia() {

        System.out.println("Dia numero:" + this.idDia);

        for (int i = 0; i < this.contadorViajes; i++) {
            System.out.println("Viaje " + (i + 1) + ":" + viajes[i]);

        }
        System.out.println("Felicidades hiciste " + contadorViajes + " viajes!");
        System.out.println("Monto a pagar: $" + this.calcularMontoDelDia());
        System.out.println("Propinas: $" + totalPropinas);
        System.out.println("Tus ganancias fueron de: $" + this.calcularGananciasDelDia());
    }

    

    
}
