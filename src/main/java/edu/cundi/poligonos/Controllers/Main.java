package edu.cundi.poligonos.Controllers;

import edu.cundi.poligonos.Models.IOperaciones;
import edu.cundi.poligonos.Views.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase Ejecuta el programa(formulario)
 *
 * @author diego parra
 * @version 1.0.0
 */
public class Main {

    /**
     * Este método se encarga de iniciar la ejecución del programar Éste es el
     * método principal del proyecto
     *
     * @param args[] es un arreglo con los parámetros que el reciba por consola
     */
    public static void main(String[] args) {
        /**
         * Se instancia un objeto de la clase Formulario para verlo y
         * ejecutarlo.
         */
        Formulario ventana = new Formulario();
        List<IOperaciones> listaPoligonos = new ArrayList<>();
        RegistrarCoordenadas rc = new RegistrarCoordenadas(ventana, listaPoligonos);
        rc.iniciar();
    }
}
