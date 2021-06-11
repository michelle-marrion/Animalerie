/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.Objets;

import classes.ExtendsAnimals.Felin;

/**
 *
 * @author ngami_4vnxadk
 */
public class Chat extends Felin{

     public Chat()
    {
        
    }
    public Chat(String color, int p)
    {
        this.couleur=color;
        this.poid=p;
             
    }
    void Cry()
    {
         System.out.print("Je mioulle sur les toits");
    }
    void Walker() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
