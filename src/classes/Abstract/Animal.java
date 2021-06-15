/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.Abstract;

/**
 *
 * @author ngami_4vnxadk
 */
public abstract class  Animal {
    protected int poid;
    protected String couleur;
    
    // constructeur par défaut 
    //methodes
protected void Eat()
{
    System.out.println("I eat meat !");
}
protected void Drink() 
{
    System.out.println("I drink Water !");
}
 public abstract void Walker();// un animal peux marcher, ramper ou voler
 public abstract  void Cry(); // un animal à un crie
 
 //decription de la methode
 
 public String toString()
 {
     return "je suis un Objet de la Classe"+this.getClass()+"je suis de Couleur "+this.couleur+" et je pèse "+this.poid+" kg";
 }
}
