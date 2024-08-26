
package logica;

public class Bulbasor extends Pokemon implements IPlanta{

    public Bulbasor() {
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
    public void atacarDrenaje() {
        System.out.println("Este es un atake Drenaje");}

    @Override
    public void atacarParalizar() {
        System.out.println("Este es un atake Paralizar");}
    
}
