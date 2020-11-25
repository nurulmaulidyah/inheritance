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
public class KelasMotor extends JenisMotor {
    
    String warna;
    int roda;
   
    public void warna (String cat)
    {
        warna=cat;
        System.out.println("Kapatitas Mesin = "+warna);
    }
   public void roda (int piston)
   {
       roda =piston;
       System.out.println("Roda Motor = "+roda);
       }
}
