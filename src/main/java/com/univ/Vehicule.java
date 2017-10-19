package com.univ;

import javax.persistence.*;

@Entity
@Table(name = "Veh")
@Inheritance(strategy = InheritanceType.JOINED)
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String plateNumber;

    Rent rent;



    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

   @OneToOne
    public Rent getRent() {
        return rent;
    }

    public void setRent(Rent rent) {
        this.rent = rent;
    }
}
