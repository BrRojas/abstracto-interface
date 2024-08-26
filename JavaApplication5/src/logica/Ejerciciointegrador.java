
package logica;

public class Ejerciciointegrador {


    public static void main(String[] args) {
       
        
        // DECLARACION DE OBJETOS CON LAS CLASES ABTRACTAS Y SUS INTERFACES
        
       Squirtle squirtle = new Squirtle ();
       Charmander charmander = new Charmander ();
       Bulbasor bulba = new Bulbasor ();
       Pikachu pika = new Pikachu ();
       
       squirtle.atacarAraniazo();
       squirtle.atacarHidroBOmba();
       
       charmander.atacarMordisco();
       charmander.atacarPunioFuego();
       
       bulba.atacarMordisco();
       bulba.atacarParalizar();
       
      pika.atacarPlacaje();
      pika.atacarImpactrueno();
       
    }
    
}
