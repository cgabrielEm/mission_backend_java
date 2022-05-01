package practicaMona;

public class Inflatocat extends Mona{

    public Inflatocat(int id, String nombre, String color, String especialidad, String descripción){
        super(id,nombre,color,especialidad, descripción);
    }

    @Override
    public void camina() {
        System.out.println("Se mueve en un salvavidas porque le encanta nadar");
    }

    @Override
    public void juega() {
        System.out.println("Juega en el agua todo el día, le encanta nadar.");
    }

    public void nada(){
        System.out.println("Nada en un salvavidas de jirafa.");
    }
}
