
import java.util.Scanner;


public class MenuInteractivo extends PlanillaDelDia{

    private int opcion = 1;

    public void imprimirMenuPrincipal() {

        System.out.println("""
                           \u00bfQue desea hacer?
                           1. Agregar viaje.
                           2. Quitar viaje.
                           3. Agregar propina.
                           4. Mostrar Planilla.
                           5. Configuracion.
                           6. Terminar Dia.
                           """);

        opcion = new Scanner(System.in).nextInt();

        switch (opcion) {

            case 1:
                imprimirMenuAgregarViaje();
                break;
            case 2:
                quitarViaje();
                imprimirMenuPrincipal();
                break;
            case 3:
                agregarPropina();
                imprimirMenuPrincipal();
                break;
            case 4:
                mostrarPlanilla();
                imprimirMenuPrincipal();
                break;
            case 5:
                imprimirMenuConfiguracion();
                break;
            case 6:
                terminarDia();
                break;

            default:
                System.out.println("Por favor,ingrese una opcion valida");
        }

    }

    public void imprimirMenuAgregarViaje() {

        System.out.println("""
                           \u00bfQue tipo de viaje vas a hacer?
                           1. Viaje basico.
                           2. Viaje largo.
                           3. Salir.""");

        opcion = new Scanner(System.in).nextInt();

        switch (opcion) {
            case 1:
                Scanner falso = new Scanner(System.in);
                System.out.println("Por favor ingrese el monto del pedido:");
                int monto1 = falso.nextInt();
                Viaje viajeBasico = new Viaje(false, monto1);
                agregarViaje(viajeBasico);
                System.out.println("Viaje agregado con exito.");
                imprimirMenuAgregarViaje();
                break;
            case 2:
                Scanner verdadero = new Scanner(System.in);
                System.out.println("Por favor ingrese el monto del pedido:");
                int monto2 = verdadero.nextInt();
                Viaje viajeLargo = new Viaje(true, monto2);
                agregarViaje(viajeLargo);
                System.out.println("Viaje agregado con exito.");
                imprimirMenuAgregarViaje();
                break;
            case 3:
                imprimirMenuPrincipal();
                break;
            default:
                System.out.println("Por favor, ingrese una opcion valida.");
                imprimirMenuAgregarViaje();
        }

    }

    public void imprimirMenuConfiguracion() {

        System.out.println("""
                          Configurar:
                          1. Valor viaje basico.
                          2. Valor viaje largo.
                          3. Nombre de usuario.
                          4. Salir.
                          """);

        opcion = new Scanner(System.in).nextInt();

        switch (opcion) {

            case 1:
                System.out.println("Ingrese el valor del viaje basico:");
                setPrecioViajeBasico(new Scanner(System.in).nextInt());
                System.out.println("Viaje basico cambiado a: $" + getPrecioViajeBasico());
                imprimirMenuConfiguracion();
                break;

            case 2:
                System.out.println("Ingrese el valor del viaje largo:");
                setPrecioViajeLargo(new Scanner(System.in).nextInt());
                System.out.println("Viaje largo cambiado a: $" + getPrecioViajeLargo());
                imprimirMenuConfiguracion();
                break;

            case 3:
                System.out.println("Ingrese el nuevo nombre de usuario");
                setNombreDelUsuario(new Scanner(System.in).nextLine());
                System.out.println("Nombre cambiado con exito.");
                imprimirMenuConfiguracion();
                break;

            case 4:
                imprimirMenuPrincipal();
                break;
            default:
                System.out.println("Por favor, ingrese una opcion valida");
                imprimirMenuConfiguracion();

        }

    }

}


