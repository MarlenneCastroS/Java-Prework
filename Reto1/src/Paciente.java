public class Paciente {
    String nombre;
    int edad;
    String num_expediente;


    public void mostrarInfo() {
        System.out.println("Paciente:" + nombre);
        System.out.println("Edad:" + edad);
        System.out.println("Expediente:" + num_expediente);
    }
}