
package logica;

public class Charmander extends Pokemon implements IFuego{

    public Charmander() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Estes es un ataque Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Estes es un ataque Arañazo");  
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Estes es un ataque Mordisco");    
    }    

    @Override
    public void atacarPunioFuego() {
        System.out.println("Este es un atake Puño de Fuego");
    }

    @Override
    public void atacarLanzaLlamas() {
        System.out.println("Este es un atake Lanza LLamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Este es un atake Ascuas");
    }
}
