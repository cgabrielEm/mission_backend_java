package practicaHarry;

public class Personaje {

    private String nombre;
    private String genero;
    private String tipoSangre;
    private String nombreCasa;
    private String boggart;
    private String patronus;

    public Personaje(){     }

    public Personaje(String nombre, String genero,String tipoSangre, String nombreCasa, String boggart, String patronus){
        this.nombre = nombre;
        this.tipoSangre = tipoSangre;
        this.genero = genero;
        this.nombreCasa = nombreCasa;
        this.boggart = boggart;
        this.patronus = patronus;
    }

    public String getNombre(){  return nombre;  }
    public String getGenero(){  return genero;  }
    public String getTipoSangre(){  return tipoSangre;  }
    public String getNombreCasa(){  return nombreCasa;  }
    public String getBoggart(){  return boggart;  }
    public String getPatronus(){  return patronus;  }

    public boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        }else
            return false;
    }

    public boolean setGenero(String genero){
        if(!genero.isEmpty()){
            this.genero = genero;
            return true;
        }else
            return false;
    }

    public boolean setTipoSangre(String tipoSangre){
        if(!tipoSangre.isEmpty()){
            this.tipoSangre = tipoSangre;
            return true;
        }else
            return false;
    }

    public boolean setNombreCasa(String nombreCasa){
        if(!nombreCasa.isEmpty()){
            this.nombreCasa = nombreCasa;
            return true;
        }else
            return false;
    }

    public boolean setBoggart(String boggart){
        if(!boggart.isEmpty()){
            this.boggart = boggart;
            return true;
        }else
            return false;
    }

    public boolean setPatronus(String patronus) {
        if(!patronus.isEmpty()){
            this.patronus = patronus;
            return true;
        }else
            return false;
    }

    public String showMessage(){
        return
                "Nombre: "+nombre+" \n"+
                        "Genero: "+genero+" \n"+
                        "Tipo Sangre: "+tipoSangre+" \n"+
                        "Casa a la que pertenece: "+nombreCasa+" \n"+
                        "Boggat: "+boggart+" \n"+
                        "Patronus: "+patronus+" \n";
    }
}
