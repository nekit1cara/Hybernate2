package org.hybernate.MappingTablesENTITY;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
//@Table(name = "people", schema = "mydbnekitcara", catalog = "mydbnekitcara")
@Getter
@Setter
@Cacheable
@AllArgsConstructor
@NoArgsConstructor
public class People {

                                    //People INFO В JDBC

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_people", nullable = false)
    private int idPeople;

    @Basic
    @Column(name = "name_people", nullable = false, length = 45)
    private String namePeople;

    @Basic
    @Column(name = "lastname_people", nullable = false, length = 45)
    private String lastnamePeople;

    @Basic
    @Column(name = "profesion_people", nullable = true, length = 45)
    private String profesionPeople;

    @Basic
    @Column(name = "positions_people", nullable = true, length = 45)
    private String positionsPeople;

    @Basic
    @Column(name = "salary_people", nullable = false)
    private int salaryPeople;



}
