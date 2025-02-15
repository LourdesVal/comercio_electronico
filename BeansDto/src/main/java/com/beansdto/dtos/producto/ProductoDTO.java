package com.beansdto.dtos.producto;

import com.beansdto.dtos.base.BaseDTO;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "producto")
@Getter
@Setter
public class ProductoDTO extends BaseDTO {
    private static final long serialVersionUID = 1L;
    private Integer Id_Categoria;
    private Integer Id_Usuario;
    private String nombre;
    private String descripcion;
    private double precio;

    @Override
    public String toString() {
        return "ProductoDTO [idCategoria=" + Id_Categoria + ", idUsuario=" + Id_Usuario+ "nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio + "]";
    }
}

