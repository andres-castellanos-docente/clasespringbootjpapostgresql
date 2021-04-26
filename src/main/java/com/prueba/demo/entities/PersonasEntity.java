package com.prueba.demo.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "personas", schema = "public", catalog = "prueba")
public class PersonasEntity {
    private Long id;
    private String primernombre;
    private String segundnombre;
    private String primerapellido;
    private String segundoapellido;
    private Long celular;
    private String email;


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "primernombre", nullable = false, length = 80)
    public String getPrimernombre() {
        return primernombre;
    }

    public void setPrimernombre(String primernombre) {
        this.primernombre = primernombre;
    }

    @Basic
    @Column(name = "segundnombre", nullable = true, length = 80)
    public String getSegundnombre() {
        return segundnombre;
    }

    public void setSegundnombre(String segundnombre) {
        this.segundnombre = segundnombre;
    }

    @Basic
    @Column(name = "primerapellido", nullable = false, length = 80)
    public String getPrimerapellido() {
        return primerapellido;
    }

    public void setPrimerapellido(String primerapellido) {
        this.primerapellido = primerapellido;
    }

    @Basic
    @Column(name = "segundoapellido", nullable = true, length = 80)
    public String getSegundoapellido() {
        return segundoapellido;
    }

    public void setSegundoapellido(String segundoapellido) {
        this.segundoapellido = segundoapellido;
    }

    @Basic
    @Column(name = "celular", nullable = false)
    public Long getCelular() {
        return celular;
    }

    public void setCelular(Long celular) {
        this.celular = celular;
    }

    @Basic
    @Column(name = "email", nullable = false, length = 100)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonasEntity that = (PersonasEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(primernombre, that.primernombre) && Objects.equals(segundnombre, that.segundnombre) && Objects.equals(primerapellido, that.primerapellido) && Objects.equals(segundoapellido, that.segundoapellido) && Objects.equals(celular, that.celular) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, primernombre, segundnombre, primerapellido, segundoapellido, celular, email);
    }
}
