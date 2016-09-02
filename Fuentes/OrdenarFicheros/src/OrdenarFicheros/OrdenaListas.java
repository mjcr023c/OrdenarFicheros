/**
 * * @author Martin Corrales
 * https://mjcr023c.github.io/cv/
 * https://github.com/mjcr023c
 * mjcr_023c@hotmail.com
 *
 */
package OrdenarFicheros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenaListas {

    /**
     * Imprime por pantalla los elementos de una lista
     *
     * @param lista List Lista que se va a ordenar
     *
     */
    public static void pintaLista(List lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }

    /**
     * Metodo que ordena la Lista de la A a la Z
     *
     * @param l List Lista que se va a ordenar
     *
     * @return l List Lista ordenada
     *
     */
    public List OrdenaListSort(List l) {

        Collections.sort(l);
        System.out.println("———- ORDEN NATURAL DEFINIDO en compareTo ————");
        pintaLista(l);

        return l;
    }

}
