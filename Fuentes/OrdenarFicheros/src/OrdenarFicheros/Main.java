/**
 * * @author Martin Corrales
 * https://mjcr023c.github.io/cv/
 * https://github.com/mjcr023c
 * mjcr_023c@hotmail.com
 */

package OrdenarFicheros;

import java.util.ArrayList;
import java.util.List;
import OrdenarFicheros.Archivos.*;
import OrdenarFicheros.OrdenaListas.*;

public class Main {

    public static void main(String[] arg) {
        String rutaIn = "entrada.txt";
        String rutaOut = "salida.txt";
        if (arg.length >= 2) {
            rutaIn = arg[0];
            rutaOut = arg[1];
        } else if (arg.length == 1) {
            rutaIn = arg[0];
            rutaOut = arg[0];
        }

        List lista = new ArrayList();
        Archivos a = new Archivos();
        OrdenaListas l = new OrdenaListas();

        lista = a.LeeFichero(rutaIn);
        lista = l.OrdenaListSort(lista);
        a.EscribirFichero(rutaOut, lista);
    }

}
