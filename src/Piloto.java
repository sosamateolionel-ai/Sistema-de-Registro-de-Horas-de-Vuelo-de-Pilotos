public class Piloto {

    private String numeroLicencia;
    private String nombre;
    private double horasVuelo;

    public Piloto(String numeroLicencia, String nombre) {
        this.numeroLicencia = numeroLicencia;
        this.nombre = nombre;
        this.horasVuelo = 0;
    }

    public String getNumeroLicencia() {
        return numeroLicencia;
    }

    public String getNombre() {
        return nombre;
    }

    public double getHorasVuelo() {
        return horasVuelo;
    }

    public boolean registrarVuelo(double horas) {

        if (horas <= 0) {
            System.out.println("Vuelo rechazado: las horas deben ser mayores a cero (" + horas + ").");
            return false;
        }

        horasVuelo = horasVuelo + horas;
        System.out.println("Vuelo de " + horas + " horas registrado.");
        return true;
    }
}