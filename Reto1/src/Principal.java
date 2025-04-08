public class Principal {
    public static void main(String[] args) {
        //Creo un nuevo objeto de tipo Paciente
        Paciente paciente_uno = new Paciente();

        //Asigno valores a los atributos
        paciente_uno.nombre = "Lena Marie";
        paciente_uno.edad = 25;
        paciente_uno.num_expediente = "EXP202409";

        //Se llama al metodo mostrarinfo()
        paciente_uno.mostrarInfo();
    }
}
