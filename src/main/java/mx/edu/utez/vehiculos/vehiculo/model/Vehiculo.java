package mx.edu.utez.vehiculos.vehiculo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "modelos")
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", columnDefinition = "VARCHAR(50)")
    private String nombre;

    @Column(name = "descripcion", columnDefinition = "TEXT")
    private String descripcion;

    @Column(name = "marca", columnDefinition = "VARCHAR(50)")
    private String marca;


    public Vehiculo() {}

    public Vehiculo(String nombre, String descripcion, String marca, boolean status) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.marca = marca;
    }

    public Vehiculo(Long id, String nombre, String descripcion, String marca, boolean status) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.marca = marca;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
