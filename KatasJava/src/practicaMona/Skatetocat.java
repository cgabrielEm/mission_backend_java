package practicaMona;

public class Skatetocat extends Mona{

    public Skatetocat(int id, String nombre, String color, String especialidad, String descripcion){
        super(id,nombre,color,especialidad,descripcion);
    }

    @Override
    public void juega() {
        System.out.println("Juega haciendo acrobacias en su patineta");
    }

     void patina(){
        System.out.println("Se transporta con una patineta color azul con ruedas amarillas. Tiene todas sus protecciones de seguridad.");
    }
}
