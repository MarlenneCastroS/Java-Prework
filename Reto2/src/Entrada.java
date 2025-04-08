public class Entrada {
    String nombre_evento;
    double precio_entrada;

    // Constructor que inicializa Entrada
    public Entrada(String nombre_evento, double precio_entrada){
        this.nombre_evento = nombre_evento;
        this.precio_entrada = precio_entrada;
    }

    //Metodo para mostrar informacion
    public void mostrarinfo(){
        System.out.println("Evento:" + nombre_evento + "|" + "Precio $" + precio_entrada);
    }
}
