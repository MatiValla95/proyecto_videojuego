package P3;

public class Main {
    static void main() {
        Videojuego smb3 = new Videojuego();
        Videojuego gta6 = new Videojuego();
        Videojuego cr = new Videojuego();

        smb3.nombre = "Super Mario Bros. 3";
        smb3.genero = "Plataformas";
        smb3.version = "2018";
        smb3.activo = false;

        gta6.nombre = "Grand Theft Auto VI";
        gta6.genero = "Acción";
        gta6.version = "2026";
        gta6.activo = true;

        cr.nombre = "Clash Royale";
        cr.genero = "Estrategia en tiempo real";
        cr.version = "160402020";
        cr.activo = true;

        cr.mostrarInformacion();
        smb3.mostrarInformacion();
        gta6.mostrarInformacion();

        gta6.cerrar();
        smb3.iniciar();

        smb3.mostrarInformacion();
        gta6.mostrarInformacion();
    }
}
