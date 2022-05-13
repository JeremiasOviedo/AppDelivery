
public class Viaje extends Valores {

    private int idViaje;
    private int monto;
    private int valorDelViaje;
    private static int contadorViajes;

    private Viaje() {
        this.idViaje = ++contadorViajes;
    }

    public Viaje( boolean isLargo, int monto) {
        this();
        if (isLargo == false) {
           this.valorDelViaje = getPrecioViajeBasico();
            this.monto = monto;
        } 
        else{
            this.valorDelViaje = getPrecioViajeLargo();
            this.monto = monto;
        }
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public int getValorDelViaje() {
        return valorDelViaje;
    }

    public void setValorDelViaje(int valorDelViaje) {
        this.valorDelViaje = valorDelViaje;
        }
    

    @Override
    public String toString() {
        return "{monto=" + monto + ", valorDelViaje=" + getValorDelViaje() + '}';
    

}
}