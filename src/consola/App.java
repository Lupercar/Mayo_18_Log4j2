package consola;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import entidades.Producto;

public class App {
	
	private static final Logger logger = LogManager.getLogger(App.class.getName());

	public static void main(String[] args) {
		
		if(logger.isInfoEnabled()){
			logger.info("Arrancamos la App"); 
		}
			
		if (logger.isDebugEnabled()) {
			logger.debug("main(String[] args={}) - start", args); //$NON-NLS-1$
		}
		
		if(logger.isTraceEnabled()){
			logger.trace("Creamos el primer producto"); 
		}
		Producto p1 = new Producto(1,"Producto 1",1d);
		
		if(logger.isTraceEnabled())
			logger.trace("Creamos el segundo producto"); 
		Producto p2 = new Producto(2,"Producto 2",2d);
		
		if(logger.isTraceEnabled())
			logger.trace("Cambiamos precio producto 1");
		p1.setPrecio(1.1d);
		
		if(logger.isTraceEnabled())
			logger.trace("Cambiamos nombre producto 2");
		p2.setNombre("Producto2 modificado");

		if (logger.isTraceEnabled()) {
			logger.debug("main(String[] args={}) - end", args); //$NON-NLS-1$
		}
	}
}//fin class consola.App
