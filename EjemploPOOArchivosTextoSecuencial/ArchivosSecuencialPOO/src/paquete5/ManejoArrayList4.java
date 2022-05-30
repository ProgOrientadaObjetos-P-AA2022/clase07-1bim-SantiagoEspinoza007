/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.ArrayList;
import paquete1.Calificacion;
import paquete1.Empresa;
import paquete1.Profesor;

/**
 *
 * @author reroes
 */
public class ManejoArrayList4 {

    public static void main(String[] args) {

        Empresa e1 = new Empresa("Italiana", "Loja");
        Empresa e2 = new Empresa("Coca Cola", "Guayaquil");
        Empresa e3 = new Empresa("Pepsi", "Quito");

        // ArrayList
        ArrayList<Empresa> presa = new ArrayList<>();
        presa.add(e1);
        presa.add(e2);
        presa.add(e3);

        for (int i = 0; i < presa.size(); i++) {
            Empresa e = presa.get(i);

            System.out.printf("Empresa: %s \n Ciudad: %s \n\n", e.obtenerNombre(),
                    e.obtenerCiudad());
        }
    }
}
