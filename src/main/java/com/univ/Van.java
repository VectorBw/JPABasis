package com.univ;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name = "Van")
@PrimaryKeyJoinColumn(name = "Van_id")
public class Van extends Vehicule {
    private  int maxWeight;


    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }
}
