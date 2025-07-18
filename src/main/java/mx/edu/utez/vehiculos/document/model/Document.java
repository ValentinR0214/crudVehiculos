package mx.edu.utez.vehiculos.document.model;

import jakarta.persistence.*;

@Entity
@Table(name = "documentos")
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name",columnDefinition = "VARCHAR(30)")
    private String name;
    @Column(name = "description",columnDefinition = "VARCHAR(70)")
    private String description;

    public Document() {
    }

    public Document(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Document(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
