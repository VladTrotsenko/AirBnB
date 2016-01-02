package gojava.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by root on 19.12.15.
 */
@Entity
@Table(name = "Reservation")
public class Reservation extends AbstractEntity {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name="id", nullable = false, unique = true)
    private int id;

    @Column(name = "idHost")
    private int idHost;

    @Column(name = "idClient")
    private int idClient;

    @Column(name = "idApartment")
    private int idApartment;

    @Column(name = "begin")
    private Date begin;

    @Column(name = "end")
    private Date end;

    public Reservation(Integer idHost, Integer idClient, Integer idApartment,
                       Date begin, Date end) {

        this.idHost = idHost;
        this.idClient = idClient;
        this.idApartment = idApartment;
        this.begin = begin;
        this.end = end;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public int getIdHost() {
        return idHost;
    }

    public void setIdHost(int idHost) {
        this.idHost = idHost;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getIdApartment() {
        return idApartment;
    }

    public void setIdApartment(int idApartment) {
        this.idApartment = idApartment;
    }

    public Date getBegin() {
        return begin;
    }

    public void setBegin(Date begin) {
        this.begin = begin;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }
}
