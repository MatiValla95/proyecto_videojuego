package P3;

public class Videojuego {
    public String nombre;
    public String genero;
    String version;
    boolean activo;

    public void mostrarInformacion(){
        System.out.println("\nEl videojuego se titula " + nombre + " y pertenece al género de " + genero + " y actualmente tiene un estado de " + activo);
    }

    public void iniciar(){
        activo = true;
    }
    void cerrar(){
        activo = false;
    }

    void mostrarVersion(){
        System.out.println("Version: " + version);
    }
}

