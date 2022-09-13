package com.proyectocrud.proyectocrud.model;

import com.proyectocrud.proyectocrud.enums.Enum_Rol;

import javax.persistence.*;

public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", nullable = false)

    private Long id;
    private String nombreEmpleado;
    private String correoEmpleado;

    @Enumerated(EnumType.STRING)
    @Column(name = "rol")
    private Enum_Rol rol;



}
