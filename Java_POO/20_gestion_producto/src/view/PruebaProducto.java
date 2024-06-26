package view;


import java.util.ArrayList;
import java.util.List;

import model.Producto;
import service.ProductoService;

public class PruebaProducto {
	public static void main(String[] args) {
		ProductoService service=new ProductoService();
		List<Producto> productos=new ArrayList<Producto>();
		productos.add(new Producto("lavadora", 203, "Electrodomésticos"));
        productos.add(new Producto("pan", 0.6, "Alimentación"));
		//Elimina de la lista aquellos productos que pertenezcan a la categoría indicada
		service.eliminarPorCategoria("Alimentación");
		//-bajarPrecio: Baja el precio de todos productos en el porcentaje indicado
		service.bajarPrecio(5);
		//-subirPrecioCategoria: Sube el precio a todos los productos de la categoría indicada, en el porcentaje indicado
		service.subirPrecioCategoria(3, "Alimentación");
		//-obtenerProductos: Devuelve la lista de productos existentes
		service.obtenerProductos();
		//-agregarProducto: Añade el producto recibido 
		service.agregarProducto(new Producto("batidora",18.5,"Electrodomésticos")); 
		
		System.out.println(productos.toString());
		
	}

}
