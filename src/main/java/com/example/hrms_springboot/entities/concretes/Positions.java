package com.example.hrms_springboot.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name="positions")
@Data
@NoArgsConstructor //Parametresiz Const
@AllArgsConstructor //Parametreli Const
public class Positions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /*İki taraftan da giriş olabilir ama db'de beşinciyi yazınca kodda dörtte kalmış olabilir
    Birbirlerini takip etmeleri açısından sağlıklı*/
    @Column(name = "id")
    private int ID;

    @Column(name = "position_name")
    private String PositionName;


    /*public Positions() {
    }
    public Positions(int ID, String positionName) {
        this.ID = ID;
        PositionName = positionName;
    }*/

    /*public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPositionName() {
        return PositionName;
    }

    public void setPositionName(String positionName) {
        PositionName = positionName;
    }*/
}
