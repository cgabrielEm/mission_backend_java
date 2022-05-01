package practicaMona;

public class Dinotocat extends Mona{

    public Dinotocat(int id, String nombre, String color, String especialidad, String descripcion){
            super(id, nombre, color, especialidad, descripcion);
    }

    public void camina(){
        System.out.println("Camina en 2 patas y aplasta cosas con sus grandes patas");
    }

    public void juega(){
        System.out.println("Juega aplastando insectos y edificios.");
    }




}
