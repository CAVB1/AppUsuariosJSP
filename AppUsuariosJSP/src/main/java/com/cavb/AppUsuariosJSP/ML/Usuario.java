package com.cavb.AppUsuariosJSP.ML;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    private int IdUsuario;
    private String UserName;
    private String Nombre;
    private String ApellidoPaterno;
    private String ApellidoMaterno;
    private String Email;
    private String Password;
    private Date FechaNacimiento;
    private char Sexo;
    private String Telefono;
    private String Celular;
    private String CURP;
    private String Imagen;
    public Rol Rol;
}
