
package logica;


public class Squirtle extends Pokemon implements IAgua{

    public Squirtle() {
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
    public void atacarHidroBOmba() {
        System.out.println("Este es un atake Hifrobomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Este es un atake Burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Este es un atake Pistola Agua");
    }
}
