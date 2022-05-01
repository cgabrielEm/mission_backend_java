package practicaMona;

public class Octadex {

    public static void main(String[] args) {
        Mona dinotocat = new Dinotocat(128,"Dinotocat","Verde","Dinosaurio","Dinosaurio verde con filosos dientes, grandes patas y cola grande.");
        System.out.println("***** #1 *****\n");
        System.out.println(dinotocat.mostrarMensaje());
        dinotocat.camina();
        dinotocat.juega();
        System.out.println("***** #2 *****\n");

        Inflatocat inflatocat = new Inflatocat(122,"Inflatocat","Negro y rosa","Nadar con salvavidas","Le encanta nadar con su salvavidas amarillo de jirafa");
        System.out.println(inflatocat.mostrarMensaje());
        inflatocat.nada();
        inflatocat.juega();

        System.out.println("***** #3 *****\n");

        Skatetocat skatetocat = new Skatetocat(124,"Skatetocat","Negro y rosa","Patina","Cara color carne, tentaculos color negro, casco color morado con verde, azul rosa y partes grises.");
        System.out.println(skatetocat.mostrarMensaje());
        skatetocat.patina();
        skatetocat.juega();
        System.out.println("***** #4 *****\n");

        Mona filmtocat = new Filmtocat(120,"Filmtocat","Negro","Cinematografía","Traje completo color negro, siempre porta una camara.");
        System.out.println(filmtocat.mostrarMensaje());
        filmtocat.juega();
        filmtocat.camina();
        System.out.println("***** #5 *****\n");

        Topguntocat topguntocat = new Topguntocat(111,"Topguntocat","Negro con gris","Piloto aviador","Traje especial para pilotar un avion color negro con gris.");
        System.out.println(topguntocat.mostrarMensaje());
        topguntocat.juega();
        topguntocat.vuela();

        System.out.println("***** #6 *****\n");
        Mona grinchtocat = new Grinchtocat(109,"Grinchtocat","Verde","Robar regalos navideños","Es im gato grinch, color verde con una gorra de Santa Clouse.");
        System.out.println(grinchtocat.mostrarMensaje());
        grinchtocat.camina();
        grinchtocat.juega();

    }
}
