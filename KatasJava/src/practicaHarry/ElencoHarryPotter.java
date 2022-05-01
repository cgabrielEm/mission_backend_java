package practicaHarry;

public class ElencoHarryPotter {

    public static void main(String[] args) {
        Personaje harryPotter = new Personaje();
        harryPotter.setNombre("Harry James Potte");
        harryPotter.setGenero("Hombre");
        harryPotter.setTipoSangre("Half-blood");
        harryPotter.setNombreCasa("Gryffindor");
        harryPotter.setPatronus("Stag");
        harryPotter.setBoggart("Dementor");

        Personaje dracoMalfoy = new Personaje();
        dracoMalfoy.setNombre("Draco Lucius Malfoy");
        dracoMalfoy.setGenero("Hombre");
        dracoMalfoy.setTipoSangre("Pure-blood");
        dracoMalfoy.setNombreCasa("Slytherin");
        dracoMalfoy.setBoggart("Señor Voldemort");
        dracoMalfoy.setPatronus("Ninguno");

        Personaje hermioneGranger = new Personaje("Hermione Jean Granger","Mujer", "Muggle-born","Gryffindor", "Failure", "Otter");
        Personaje ronWeasley = new Personaje("Ronald Bilius Weasley","Hombre","Pure.blood","Gryffindor","Aragog","Terrier Jack Russel");
        Personaje severusSnape = new Personaje("Severus Snape","Hombre","Half-blood","Slytherin","Señor Voldemort","Cierva");

        System.out.println(harryPotter.showMessage());
        System.out.println(dracoMalfoy.showMessage());
        System.out.println(hermioneGranger.showMessage());
        System.out.println(ronWeasley.showMessage());
        System.out.println(severusSnape.showMessage());




    }
}
