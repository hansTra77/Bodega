package Bodega;

public class Bodega {
	
	private volatile int cantidadTipoUno; 
	private volatile int cantidadTipoDos;
	private volatile int capacidadBodegaActual;
	
	public Bodega(int articuloUno, int articuloDos) {
		
		this.cantidadTipoUno = articuloUno;
		this.cantidadTipoDos = articuloDos;
		capacidadBodegaActual = 0;
		
	}
	
	public void descargarArticulo(int tipo) {
		
		System.out.println("Tipo: " + tipo);
		
		if(tipo == 1){
			
			while(capacidadBodegaActual > 190)
			;
			cantidadTipoUno++;
			capacidadBodegaActual += 10;
			
		}
		else {
			
			while(capacidadBodegaActual > 185)
			;
			cantidadTipoDos++;
			capacidadBodegaActual += 15;
			
		}
		
		System.out.println("Capacidad actual de bodega: " + capacidadBodegaActual);
		System.out.println("Articulos Tipo Uno: " + cantidadTipoUno);
		System.out.println("Articulos Tipo Dos: " + cantidadTipoDos);
		
	}
	
	public void crearPaquete() {
		
		while(cantidadTipoUno < 3 || cantidadTipoDos < 4)
		;
		cantidadTipoUno -= 3;
		cantidadTipoDos -= 4;
		capacidadBodegaActual -= 90;
		
	}
	
}
