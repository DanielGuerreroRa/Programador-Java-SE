package service;

import java.util.ArrayList;
import java.util.List;

import model.Producto;

public class ProductoService {
	//La lógica de negocio, expondrá los siguientes métodos:
	private List<Producto> productos=new ArrayList<>();
	
	//-eliminarPorCategoria: elimina de la lista aquellos productos que pertenezcan a la categoría indicada
	public void eliminarPorCategoria(String categoria){
		productos.removeIf(n->n.getCategoria().equals(categoria));
	}
	
	//-bajarPrecio: Baja el precio de todos productos en el porcentaje indicado
	public void bajarPrecio(int porcentaje) {
		productos.forEach(p->p.setPrecio(p.getPrecio()*((100-porcentaje)/100)));
	}
	
	//-subirPrecioCategoria: Sube el precio a todos los productos de la categoría indicada, en el porcentaje indicado
	public void subirPrecioCategoria(int porcentaje,String categoria){
		productos.replaceAll(p->{
			if(categoria.equals(p.getCategoria())) {
				p.setPrecio(p.getPrecio()*((100-porcentaje)/100));
			}
			return p;
		});
	}
	
	//-obtenerProductos: Devuelve la lista de productos existentes
	public List<Producto> obtenerProductos() {
		return productos;
	}
	
	//-agregarProducto: Añade el producto recibido 
	public void agregarProducto(Producto p) {
		productos.add(p);
	}
	
	//-ordenarPorPrecio: Ordenar los productos de menor  a mayor
	public void ordenarPorPrecio() {
		productos.sort((a,b)->Double.compare(a.getPrecio(),b.getPrecio())); 
	}

}
