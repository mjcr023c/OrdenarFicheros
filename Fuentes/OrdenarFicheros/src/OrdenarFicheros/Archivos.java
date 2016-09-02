/**
 * * @author Martin Corrales
 * https://mjcr023c.github.io/cv/
 * https://github.com/mjcr023c
 * mjcr_023c@hotmail.com
 * 
 */
package OrdenarFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import OrdenarFicheros.OrdenaListas;

public class Archivos {
    /**
     * Metodo que permite la lectura de un archivo o fichero
     *
     * @param ruta String Ruta o direccion donde se encuentra el fichero
     *
     */
    public List LeeFichero(String ruta) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        List lista = new ArrayList();
        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File(ruta);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            // Lectura del fichero
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                lista.add((linea));
            }
            System.out.println("———- SIN ORDENAR ————");
            OrdenarFicheros.OrdenaListas.pintaLista(lista);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Garantizamos el cierre del Fichero
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return lista;
    }
    /**
     * Metodo que permite la escritura desde la primera linea del archivo
     *
     * @param ruta  String Ruta o direccion donde se encuentra el fichero
     * @param l    List Lista con la informacion que se escribira en el archivo
     *                  
     */
    public void EscribirFichero(String ruta, List l) {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter(ruta);
            pw = new PrintWriter(fichero);

            for (int i = 0; i < l.size(); i++) {
                pw.println(l.get(i));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Garantizamos el cierre del Fichero
            try {
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }

}
