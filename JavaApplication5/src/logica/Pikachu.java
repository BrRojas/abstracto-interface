
package logica;

public class Pikachu extends Pokemon implements IElectricos{

    public Pikachu() {
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
    public void atacarImpactrueno() {
        System.out.println("Este es un atake Impactrueno");
    }

    @Override
    public void atacarPunioTruno() {
        System.out.println("Este es un atake Puño Trueno");
    }
}
