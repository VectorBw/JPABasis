package com.univ;

import javax.persistence.*;
import java.util.Date;



@Entity
public class Rent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    @Temporal(TemporalType.DATE)
    Date beginRent;
    @Temporal(TemporalType.DATE)
    Date endRent;

    Person person ;

   Vehicule vehicule;
   public long getId() {
       return id;
   }

    public void setId(long id) {
        this.id = id;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "EndRent", nullable = true, length = 10)
    public Date getEndRent() {
        return endRent;
    }

    public void setEndRent(Date endRent) {
        this.endRent = endRent;
    }
    @Temporal(TemporalType.DATE)
    @Column(name = "BeginRent", nullable = true, length = 10)
    public Date getBeginRent() {
        return beginRent;
    }

    public void setBeginRent(Date beginRent) {
        this.beginRent = beginRent;
    }



    @ManyToOne
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @OneToOne(mappedBy = "vehicule")
    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }
}
