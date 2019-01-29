package cod_dialogo;

import javax.swing.JOptionPane;

/**
 *
 * @author emendezduran
 */
public class WinDialogo extends Dialogo {

    @Override
    public void mostrar(String msg) {
        JOptionPane.showInputDialog(msg);
    }
    
}
