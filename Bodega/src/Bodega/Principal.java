package Bodega;


public class Principal {

	private Bodega bodega;
	private Empacador empacador;
	private Descargador descargador;
	
	public Principal() {
		
		bodega = new Bodega(0, 0);
		empacador = new Empacador(this);
		descargador = new Descargador(this);
		
	}
	
	public void proceso() {
		
		empacador.start();
		descargador.start();
		
	}
	
	public void descargarArticulo(int articulo) {
		
		try {
			
			bodega.descargarArticulo(articulo);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	public void armarPaquete() {
		
		bodega.crearPaquete();
		
	}
	
	public static void main(String[] args) {
		
		new Principal().proceso();
		
	}
	
}
