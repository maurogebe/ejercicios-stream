import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Flota {

    private List<Automovil> automoviles;

    public Flota() {
        this.automoviles = new ArrayList<>();
    }
    
    public void addAutomovil(Automovil automovil) {
        this.automoviles.add(automovil);
    }

    public void listarAutomoviles() {
        this.automoviles.stream()
                .forEach(automovil -> System.out.println(
                        "Automovil " + automovil.getMarca() + " " + automovil.getModelo()
                ));
    }

    public List<Automovil> filtrarAutomoviles(String marca) {
        return this.automoviles.stream()
                .filter(automovil -> automovil.getMarca().equals(marca))
                .collect(Collectors.toList());
    }

    public int kilometrajeTotal() {
        return this.automoviles.stream()
                .mapToInt(Automovil::getKilometraje)
                .sum();
    }

    public List<Automovil> obtenerAutomovilesPorAnnio(int year) {
        return this.automoviles.stream()
                .filter(automovil -> automovil.getYear() == year)
                .collect(Collectors.toList());
    }

    public void actualizarEstadoAutomovil(int id, String estado) {
        Optional<Automovil> automovil = this.automoviles.stream()
                .filter(a -> a.getId() == id)
                .findFirst();
        automovil.ifPresent(a -> a.setEstado(estado));
    }

    public void eliminarAutomovil(int id) {
        this.automoviles = this.automoviles.stream()
                .filter(a -> a.getId() != id)
                .collect(Collectors.toList());
    }
}
