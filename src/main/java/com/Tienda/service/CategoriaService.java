
package com.Tienda.service;

import com.Tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
//    Método que retorna la lista de categorías
    public List<Categoria> getCategorias(boolean activos);
}
