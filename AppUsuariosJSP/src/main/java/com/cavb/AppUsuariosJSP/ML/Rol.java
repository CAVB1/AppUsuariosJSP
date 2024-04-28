package com.cavb.AppUsuariosJSP.ML;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Rol {

    private int IdRol;
    private String Nombre;
}
