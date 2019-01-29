package cod_dialogo;

/**
 *
 * @author emendezduran
 */
public abstract class Dialogo implements MetodosComunes {

    @Override
    public abstract void mostrar(String msg);

    enum Tipo {
        CONSOLA, VENTANA
    };

    public static Dialogo crearDialogo(Tipo tipo) {

        Dialogo dialogoCreado;
        switch (tipo) {
            // creamos un dialogo de consola
            case CONSOLA:
                dialogoCreado = new ConsDialogo();
                break;
            // creamos un dialogo de ventana
            case VENTANA:
                dialogoCreado = new WinDialogo();
                break;
            default:
                dialogoCreado = null;
        }

        return dialogoCreado;

    }
}

