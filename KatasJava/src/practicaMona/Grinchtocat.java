package practicaMona;

public class Grinchtocat extends Mona{

    public Grinchtocat(int id, String nombre, String color, String especialidad, String descripción){
        super(id,nombre,color,especialidad, descripción);
    }

    public void camina(){
        System.out.println("Camina con estilo por la nieve");
    }

    public void juega(){
        System.out.println("Con el festejo de la navidad, se roba los regalos navideños.");
    }
}
