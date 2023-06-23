package sk.rudokendra.vydavkyapplication.model;

import jakarta.persistence.*;
import java.sql.Date;
@Entity
@Table(name= "Vydavok")
public class Vydavok {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto increment
    @Column (name= "id", updatable = false , nullable = false)
    private long id;
    @Column (name = "popis")
    private String popis;
    @Column (name = "cena", nullable = false)
    private Double cena;
    @Column (name = "kategoria", nullable = false)
    private String kategoria;
    @Column (name = "datum")
    private Date datum;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPopis() {
        return popis;
    }

    public void setPopis(String popis) {
        this.popis = popis;
    }

    public Double getCena() {
        return cena;
    }

    public void setCena(Double cena) {
        this.cena = cena;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }
}
