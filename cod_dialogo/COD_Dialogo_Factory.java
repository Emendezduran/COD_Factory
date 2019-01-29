package cod_dialogo;

/**
 *
 * @author emendezduran
 */
public class COD_Dialogo_Factory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dialogo miDialogo = Dialogo.crearDialogo(Dialogo.Tipo.CONSOLA);
        miDialogo.mostrar("Hola desde una consola");
        Dialogo otroDialogo = Dialogo.crearDialogo(Dialogo.Tipo.VENTANA);
        otroDialogo.mostrar("Hola desde una ventana");
    }

}
