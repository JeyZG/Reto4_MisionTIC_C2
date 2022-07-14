package Carrera;

public class Corredor{

    // Atributos
    private String nombreCompleto, numeroIdentificador;
    private double estatura, tiempoMeta;
    private int edad;

    // Constructor
    public Corredor(String nombreCompleto, String numeroIdentificador, double estatura, int edad, double tiempoMeta){
        this.nombreCompleto = nombreCompleto;
        this.numeroIdentificador = numeroIdentificador;
        this.estatura = estatura;
        this.edad = edad;
        this.tiempoMeta = tiempoMeta;
    }

    // Getters y Setters

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNumeroIdentificador() {
        return numeroIdentificador;
    }

    public void setNumeroIdentificador(String numeroIdentificador) {
        this.numeroIdentificador = numeroIdentificador;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getTiempoMeta() {
        return tiempoMeta;
    }

    public void setTiempoMeta(double tiempoMeta) {
        this.tiempoMeta = tiempoMeta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Corredor{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", numeroIdentificador='" + numeroIdentificador + '\'' +
                ", estatura=" + estatura +
                ", tiempoMeta=" + tiempoMeta +
                ", edad=" + edad +
                '}';
    }
}