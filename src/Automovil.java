public abstract class Automovil {
    private int numeroDeRuedas;
    private int numeroDePuertas;
    private int numeroDeEspejos;
    private int asientosDisponibles;
    private double pesoVehiculo;
    private double areaCuadrada;
    private String nombreVehiculo;
    private String marcaVehiculo;
    private String nombrePropietario;

    public Automovil(int numeroDeRuedas, int numeroDePuertas, int numeroDeEspejos, int asientosDisponibles, double pesoVehiculo, double areaCuadrada, String nombreVehiculo, String marcaVehiculo, String nombrePropietario) {
        this.numeroDeRuedas = numeroDeRuedas;
        this.numeroDePuertas = numeroDePuertas;
        this.numeroDeEspejos = numeroDeEspejos;
        this.asientosDisponibles = asientosDisponibles;
        this.pesoVehiculo = pesoVehiculo;
        this.areaCuadrada = areaCuadrada;
        this.nombreVehiculo = nombreVehiculo;
        this.marcaVehiculo = marcaVehiculo;
        this.nombrePropietario = nombrePropietario;
    }

    public int getNumeroDeRuedas() {
        return numeroDeRuedas;
    }

    public void setNumeroDeRuedas(int numeroDeRuedas) {
        this.numeroDeRuedas = numeroDeRuedas;
    }

    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

    public int getNumeroDeEspejos() {
        return numeroDeEspejos;
    }

    public void setNumeroDeEspejos(int numeroDeEspejos) {
        this.numeroDeEspejos = numeroDeEspejos;
    }

    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }

    public void setAsientosDisponibles(int asientosDisponibles) {
        this.asientosDisponibles = asientosDisponibles;
    }

    public double getPesoVehiculo() {
        return pesoVehiculo;
    }

    public void setPesoVehiculo(double pesoVehiculo) {
        this.pesoVehiculo = pesoVehiculo;
    }

    public double getAreaCuadrada() {
        return areaCuadrada;
    }

    public void setAreaCuadrada(double areaCuadrada) {
        this.areaCuadrada = areaCuadrada;
    }

    public String getNombreVehiculo() {
        return nombreVehiculo;
    }

    public void setNombreVehiculo(String nombreVehiculo) {
        this.nombreVehiculo = nombreVehiculo;
    }

    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public String getDatosBasicosVehiculo(){
        return "El automovil es: "+nombreVehiculo+" de la marca: "+ marcaVehiculo +
                "su propietario es: "+nombrePropietario;
    }

    public String getDatosAvanzadosVehiculo(){
        return "El automovil es: "+nombreVehiculo+" de la marca: "+ marcaVehiculo +
                "su propietario es: "+nombrePropietario+ " en su interior tiene: "+asientosDisponibles+
                " asientos disponibles, tiene un peso de: "+ pesoVehiculo +", tiene una cantidad de ruedas de: "+ numeroDeRuedas+
                ", tiene una cantidad de espejos de: "+ numeroDeEspejos+ ", tiene una cantidad de puertas de: "+numeroDePuertas;
    }
}
