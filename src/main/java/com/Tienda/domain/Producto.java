package com.Tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable; //se pueda convertir en arreglo de bytes que pueda ser traducido a otras tecnologías
import lombok.Data;


@Data // datos: getters, setters...
@Entity
@Table(name = "producto")
public class Producto implements Serializable{
    //    Versión de seralización
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long idProducto;
    private String descripcion;
    private String detalle;
    private double precio;
    private int existencias;
    private String rutaImagen;
    private boolean activo;
    
    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

    public Producto() {
    }

//    public Producto(Long idCategoria, String descripcion, String detalle, double precio, int existencias, String rutaImagen, boolean activo) {
//        this.idCategoria = idCategoria;
//        this.descripcion = descripcion;
//        this.detalle = detalle;
//        this.precio = precio;
//        this.existencias = existencias;
//        this.rutaImagen = rutaImagen;
//        this.activo = activo;
//    }
    
    
    
}
