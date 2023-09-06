import java.util.ArrayList;
import java.util.Date;

class TallerMecanico {
    private ArrayList<Sede> sedes;

    public TallerMecanico() {
        sedes = new ArrayList<>();
    }

    public void agregarSede(Sede sede) {
        sedes.add(sede);
    }

    public EstadisticasTaller obtenerEstadisticasGlobales() {
        // Implementar cálculo de estadísticas globales aquí
        return new EstadisticasTaller();
    }
}

class Sede {
    private ArrayList<Vehiculo> vehiculos;

    public Sede() {
        vehiculos = new ArrayList<>();
    }

    public void registrarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public EstadisticasSede generarEstadisticasSede() {
        // Implementar cálculo de estadísticas de la sede aquí
        return new EstadisticasSede();
    }
}

class Vehiculo {
    private String placa;
    private String marca;
    private String linea;
    private int modelo;
    private Date fechaIngreso;
    private String propietario;
    private ArrayList<Servicio> servicios;

    public Vehiculo(String placa, String marca, String linea, int modelo, Date fechaIngreso, String propietario) {
        this.placa = placa;
        this.marca = marca;
        this.linea = linea;
        this.modelo = modelo;
        this.fechaIngreso = fechaIngreso;
        this.propietario = propietario;
        servicios = new ArrayList<>();
    }

    public void agregarServicio(Servicio servicio) {
        servicios.add(servicio);
    }
}

class Servicio {
    private String tipoReparacion;
    private Date fechaReparacion;
    private String numFactura;
    private double montoTotal;

    public Servicio(String tipoReparacion, Date fechaReparacion, String numFactura, double montoTotal) {
        this.tipoReparacion = tipoReparacion;
        this.fechaReparacion = fechaReparacion;
        this.numFactura = numFactura;
        this.montoTotal = montoTotal;
    }
}

class EstadisticasTaller {
    // Clase para almacenar estadísticas globales del taller
    // Implementar propiedades y métodos necesarios
}

class EstadisticasSede {
    // Clase para almacenar estadísticas de una sede específica
    // Implementar propiedades y métodos necesarios
}

public class Main {
    public static void main(String[] args) {
        // Aquí puedes crear instancias de TallerMecanico, Sede, Vehiculo y Servicio,
        // y realizar operaciones como registrar vehículos, agregar servicios y calcular estadísticas.
    }
}
