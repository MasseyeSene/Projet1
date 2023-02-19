package sn.esmt.tp.admin.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="approles")
public class AppRoleEntity {
    @Id // JPA ID est primaire
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto-incréménte
    private int id;
    @Column(length = 150,nullable = false, unique = true)
    private String name;
}
