package entidades;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Producto {

	private static final Logger logger = LogManager.getLogger(Producto.class.getName());

	private int codigo;
	private String nombre;
	private double precio;

	public Producto() {
		this(0, "", 0d);
		if (logger.isTraceEnabled())
			logger.trace("Entramos en el constructor sin parámetros");

		if (logger.isTraceEnabled())
			logger.trace("Salimos del constructor sin parámetros");
	}

	public Producto(int codigo, String nombre, double precio) {
		super();
		if (logger.isTraceEnabled())
			logger.trace("Entramos en el constructor con parámetros");

		if (logger.isDebugEnabled()) {
			logger.debug("Código: " + codigo);
			logger.debug("Nombre: " + nombre);
			logger.debug("Precio: " + precio);
		}
		
		setCodigo(codigo);
		setNombre(nombre);
		setPrecio(precio);
		
		if (logger.isTraceEnabled())
			logger.trace("Salimos del constructor con parámetros");
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (logger.isTraceEnabled())
			logger.trace("Entramos en setNombre");

		if (logger.isDebugEnabled()) {
			logger.debug("Nombre antiguo: " + this.nombre);
			logger.debug("Nombre nuevo: " + nombre);
		}
		this.nombre = nombre;

		if (logger.isTraceEnabled())
			logger.trace("Salimos del setNombre");
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if (logger.isTraceEnabled())
			logger.trace("Entramos en setPrecio");

		if (logger.isDebugEnabled()) {
			logger.debug("Precio antiguo: " + this.precio);
			logger.debug("Precio nuevo: " + precio);
		}
		this.precio = precio;

		if (logger.isTraceEnabled())
			logger.trace("Salimos del setPrecio");
	}

	@Override
	public String toString() {
		return "Producto [Codigo()=" + getCodigo() + ", Nombre()=" + getNombre() + ", Precio()=" + getPrecio() + "]";
	}

}// fin class entidades.Producto
