/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import Dao.MascotaDao;
import Utilitarios.HibernateUtil;
import entidades.Mascota;
import java.util.ArrayList;
import org.hibernate.Session;

/**
 *
 * @author USUARIO
 */
public class Ejemplo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Mascota> lista = new ArrayList<>();
        MascotaDao mascotadao = new MascotaDao();
        Session sesion= HibernateUtil.getSessionFactory().openSession();
        lista = mascotadao.listarRaza(sesion);
        for (Mascota mascota : lista){
            System.out.print(mascota.getNombreMascota()+"\t \t");
            System.out.print(mascota.getNombreCliente()+"\t \t");
            System.out.println(mascota.getRaza());
        }
    }
    
}
