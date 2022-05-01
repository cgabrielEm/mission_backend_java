package practicaMona;

public class Filmtocat extends Mona{

    public Filmtocat(int id, String nombre, String color, String especialidad, String descripcion){
        super(id,nombre,color,especialidad,descripcion);
    }

    public void camina(){
        System.out.println("Camina con una camara y microfono para ir grabando su recorrido");
    }

    public void juega(){
        System.out.println("Juega con una camara de video.");
    }

}
