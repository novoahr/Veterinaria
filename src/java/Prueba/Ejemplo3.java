/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import Dao.MascotaDao;
import entidades.Mascota;

/**
 *
 * @author USUARIO
 */
public class Ejemplo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MascotaDao mascotadao = new MascotaDao();
        Mascota mimascota= new Mascota(4, "Candy", "Juan", "Pastor Catalan");
        mascotadao.ActualizarMascota(mimascota);
    }
    
}
