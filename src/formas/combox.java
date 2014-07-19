/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package formas;

/**
 *
 * @author Administrador
 */
public class combox {
   private String nombre;
   private String id ;

/** Creates a new instance of combox */
public combox(String nombre , String id ) {
   this.nombre=nombre;
   this.id=id;
}
    
   public String getID(){
    return id ;
   }
   @Override
   public String toString() {
    return nombre ;
   }

}
