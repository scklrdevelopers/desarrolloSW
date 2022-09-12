package com.scklrSW.demo.model;

import lombok.*;

import javax.persistence.*;


@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
@ToString

public class Empress {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private long id;

    private String nombre;
    private String direccion;
    private long telefono;
    private long nit;


}
