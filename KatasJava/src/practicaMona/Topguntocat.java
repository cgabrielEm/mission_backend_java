package practicaMona;

public class Topguntocat extends Mona{

    public Topguntocat(int id, String nombre, String color, String especialidad, String descripcion){
        super(id,nombre,color,especialidad,descripcion);
    }

    public void juega(){
        System.out.println("Juega a ser piloto aviador.");
    }

    public void vuela(){
        System.out.println("Vuela un avion con su traje especial.");
    }
}
