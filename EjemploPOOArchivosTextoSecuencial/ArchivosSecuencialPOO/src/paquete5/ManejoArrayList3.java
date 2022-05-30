/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.ArrayList;
import paquete1.Calificacion;
import paquete1.Profesor;

/**
 *
 * @author reroes
 */
public class ManejoArrayList3 {

    public static void main(String[] args) {

        Calificacion c1 = new Calificacion(10, "Matemáticas");
        Calificacion c2 = new Calificacion(8.5, "Algebra");

        Profesor prof1 = new Profesor("Joseph Jimenez", "facturado");
        Profesor prof2 = new Profesor("David Jones", "nombramiento");

        c1.establecerProfesor(prof1);
        c2.establecerProfesor(prof2);

        System.out.println("-----------------------------");

        // ArrayList
        ArrayList<Profesor> profesores2 = new ArrayList<>();
        profesores2.add(prof1);
        profesores2.add(prof2);

        //.size para arrays
        for (int i = 0; i < profesores2.size(); i++) {
            //System.out.printf("%s - %s\n", profesores2.get(i).obtenerNombre(),
            //        profesores2.get(i).obtenerTipo());
            Profesor p = profesores2.get(i);
            System.out.printf("%s - %s\n", p.obtenerNombre(),
                    p.obtenerTipo());
        }

        System.out.println("-----------------------------");

        // ArrayList
        ArrayList<Calificacion> cali2 = new ArrayList<>();
        cali2.add(c1);
        cali2.add(c2);

        for (int i = 0; i < cali2.size(); i++) {
            Calificacion c = cali2.get(i);
            Profesor p = profesores2.get(i);
            System.out.printf("Profesor: %s \n Materia: %s \n Nota: %s\n\n", p.obtenerNombre(),
                    c.obtenerNombreMateria(), c.obtenerNota());
        }

    }
}
