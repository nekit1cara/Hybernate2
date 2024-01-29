package org.hybernate.MappingTablesENTITY;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {



    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_vehicle", nullable = false)
    private int idVehicle;

    @Basic
    @Column(name = "name_vehicle", nullable = false, length = 45)
    private String nameVehicle;

    @Basic
    @Column(name = "class_vehicle", nullable = false, length = 45)
    private String classVehicle;

    @Basic
    @Column(name = "volume_vehicle", nullable = false, precision = 0)
    private double volumeVehicle;

    @Basic
    @Column(name = "price_vehicle", nullable = true)
    private Integer priceVehicle;

    @Basic
    @Column(name = "owner_vehicle", nullable = true, length = 45)
    private String ownerVehicle;



}
