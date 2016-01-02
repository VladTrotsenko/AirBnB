package gojava.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by root on 04.11.15.
 */
@Entity
@Table(name = "Apartment")
public class Apartment extends AbstractEntity {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name="id", nullable = false, unique = true)
    private int id;

    @Column(name="cityName")
    private String cityName;

    @Column(name = "apartmentType")
    private String apartmentType;

    @Column(name = "begin")
    private Date begin;

    @Column(name = "end")
    private Date end;

    @Column(name = "isAvailable")
    private boolean isAvailable;

    @Column(name = "hostId")
    private int hostId;

    public Apartment(String cityName, String apartmentType,
                     Date begin, Date end, Integer hostId) {

        this.cityName = cityName;
        this.isAvailable = true;
        this.apartmentType = apartmentType;
        this.begin = begin;
        this.end = end;
        this.hostId = hostId;
    }

    public Apartment() {}

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public Date getBegin() {
        return begin;
    }

    public void setBegin(Date firstDayAvailable) {
        this.begin = firstDayAvailable;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date lastDayAvailable) {
        this.end = lastDayAvailable;
    }

    public int getHostId() {
        return hostId;
    }

    public void setHostId(int hostId) {
        this.hostId = hostId;
    }

    public String getApartmentType() {
        return this.apartmentType;
    }

    public void setApartmentType(String apartmentType) {
        this.apartmentType = apartmentType;
    }

    @Override
    public String toString() {
        return ("Apartment [id=" + this.getId() + ", city= " + this.getCityName() +
                ", apartmentType=" + this.getApartmentType() + ", begin=" + this.getBegin() +
                ", end=" + this.getEnd() + ", HostId= " + this.getHostId() +"]");
    }
}
