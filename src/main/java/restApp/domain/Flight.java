package restApp.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "t_zboruri")
public class Flight implements Serializable{

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "sursa")
    private String sursa;

    @Column(name = "destinatie")
    private String destinatie;

    @Column(name = "ora_de_plecare")
    private Integer oraDePlecare;

    @Column(name = "ziua_plecarii")
    private Integer ziuaPlecarii;

    @Column(name = "durata_zborului")
    private Integer durataZborului;

    @Column(name = "numar_locuri_disponibile")
    private Integer numarLocuriDisponibile;

    @Column(name = "anulat")
    private Integer anulat;

    @OneToMany(mappedBy = "flight")
    private List<Reservation> reservations;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSursa() {
        return sursa;
    }

    public void setSursa(String sursa) {
        this.sursa = sursa;
    }

    public String getDestinatie() {
        return destinatie;
    }

    public void setDestinatie(String destinatie) {
        this.destinatie = destinatie;
    }

    public Integer getOraDePlecare() {
        return oraDePlecare;
    }

    public void setOraDePlecare(Integer oraDePlecare) {
        this.oraDePlecare = oraDePlecare;
    }

    public Integer getZiuaPlecarii() {
        return ziuaPlecarii;
    }

    public void setZiuaPlecarii(Integer ziuaPlecarii) {
        this.ziuaPlecarii = ziuaPlecarii;
    }

    public Integer getDurataZborului() {
        return durataZborului;
    }

    public void setDurataZborului(Integer durataZborului) {
        this.durataZborului = durataZborului;
    }

    public Integer getNumarLocuriDisponibile() {
        return numarLocuriDisponibile;
    }

    public void setNumarLocuriDisponibile(Integer numarLocuriDisponibile) {
        this.numarLocuriDisponibile = numarLocuriDisponibile;
    }

    public Integer getAnulat() {
        return anulat;
    }

    public void setAnulat(Integer anulat) {
        this.anulat = anulat;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}
