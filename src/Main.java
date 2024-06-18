import java.util.List;

public class Main {
    public static void main(String[] args) {
        Flota flota = new Flota();
        flota.addAutomovil(new Automovil(1, "Toyota", "Corolla", 50000, 2015, "Usado"));
        flota.addAutomovil(new Automovil(2, "Honda", "Civic", 30000, 2018, "Usado"));
        flota.addAutomovil(new Automovil(3, "Ford", "Fiesta", 40000, 2016, "Usado"));
        flota.addAutomovil(new Automovil(4, "Chevrolet", "Malibu", 25000, 2017, "Usado"));
        flota.addAutomovil(new Automovil(5, "Tesla", "Model S", 10000, 2020, "Nuevo"));
        flota.addAutomovil(new Automovil(6, "Nissan", "Altima", 20000, 2019, "Usado"));
        flota.addAutomovil(new Automovil(7, "BMW", "Serie 3", 15000, 2021, "Nuevo"));
        flota.addAutomovil(new Automovil(8, "Mercedes-Benz", "Clase C", 30000, 2017, "Usado"));
        flota.addAutomovil(new Automovil(9, "Audi", "A4", 35000, 2018, "Usado"));
        flota.addAutomovil(new Automovil(10, "Kia", "Optima", 60000, 2015, "Usado"));
        flota.addAutomovil(new Automovil(11, "Kia", "Cerato", 80000, 2018, "Nuevo"));

        flota.listarAutomoviles();
        List<Automovil> kia = flota.filtrarAutomoviles("Kia");
        int kilometrajeTotal = flota.kilometrajeTotal();

        System.out.println("Kilometraje total: " + kilometrajeTotal + " km");

        List<Automovil> automoviles2017 = flota.obtenerAutomovilesPorAnnio(2017);

        flota.actualizarEstadoAutomovil(11, "Usado");
        flota.eliminarAutomovil(7);

        System.out.println("Finalizado");
    }
}