package com.scklrSW.demo.model;

import lombok.*;

import javax.persistence.*;


@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
@ToString
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private long id;

    private String nombreDeEmpleado;
    private String correoEmpleado;
    private long idEmpleado;

}
