package practicaMona;

public class Mona {

    private int id;
    private String nombre;
    private String color;
    private String especialidad;
    private String descripcion;

    public Mona(){  }

    public Mona(int id, String nombre, String color, String especialidad, String descripcion){
        this.id = id;
        this.nombre = nombre;
        this.color = color;
        this.especialidad = especialidad;
        this.descripcion = descripcion;
    }

    public int getId(){  return id;  }
    public String getNombre(){  return nombre;  }
    public String getColor(){  return color;  }
    public String getEspecialidad(){  return especialidad;  }
    public String getDescripcion(){  return descripcion;  }

    public boolean setId(int id){
        if(id > 0){
            this.id = id;
            return true;
        }else
            return false;
    }
    public boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        }else
            return false;
    }
    public boolean setColor(String color){
        if(!color.isEmpty()){
            this.color = color;
            return true;
        }else
            return false;
    }
    public boolean setEspecialidad(String especialidad){
        if(!especialidad.isEmpty()){
            this.especialidad = especialidad;
            return true;
        }else
            return false;
    }
    public boolean setDescripcion(String especialidad){
        if(!especialidad.isEmpty()){
            this.especialidad = especialidad;
            return true;
        }else
            return false;
    }

    public String mostrarMensaje(){
        return
                "Id: "+id+" \n"+
                    "Nombre: "+nombre+" \n"+
                    "Color: "+color+" \n"+
                    "Especialidad: "+especialidad+" \n"+
                    "Descripción: "+descripcion+" \n";
    }

    public void camina(){
        System.out.println("Camina con tentaculos, tiene 5");
    }

    public void juega(){
        System.out.println("Juega con codigo en un repositorio");
    }

}
