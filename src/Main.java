public class Main {
    public static void main(String[] args) {
       Camion Kenworth = new Camion(6,2,5,4,
               120,100,"kentworth200",
               "Kenworth","Juan",2000);

        System.out.println(Kenworth.getDatosBasicosVehiculo());
        System.out.println(Kenworth.getDatosAvanzadosVehiculo());
        System.out.println(Kenworth.montarCarga());
        System.out.println(Kenworth.bajarCarga());
    }
}
