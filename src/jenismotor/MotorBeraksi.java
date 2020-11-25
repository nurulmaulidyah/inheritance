/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jenismotor;

/**
 *
 * @author niswa
 */
public class MotorBeraksi {
     
    public static void main(String[] args) {
        KelasMotor mb=new KelasMotor();
         
        System.out.println("Deskripsi Motor ;");
        mb.merk("HONDA");
        mb.nama("BEAT");
        mb.warna("MERAH");
        mb.roda(2);
    }
}
