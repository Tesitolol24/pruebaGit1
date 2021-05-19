public class Camion extends Automovil{
    private int capacidadDeCarga;

    public Camion(int numeroDeRuedas, int numeroDePuertas, int numeroDeEspejos, int asientosDisponibles, double pesoVehiculo, double areaCuadrada, String nombreVehiculo, String marcaVehiculo, String nombrePropietario, int capacidadDeCarga) {
        super(numeroDeRuedas, numeroDePuertas, numeroDeEspejos, asientosDisponibles, pesoVehiculo, areaCuadrada, nombreVehiculo, marcaVehiculo, nombrePropietario);
        this.capacidadDeCarga = capacidadDeCarga;
    }

    public int getCapacidadDeCarga() {
        return capacidadDeCarga;
    }

    public void setCapacidadDeCarga(int capacidadDeCarga) {
        this.capacidadDeCarga = capacidadDeCarga;
    }

    public String montarCarga(){
        return "se ha subido la carga";
    }

    public String bajarCarga(){
        return "se ha bajado la carga";
    }
}
