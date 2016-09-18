package Bodega;

import java.util.Random;

public class Descargador extends Thread{

	private Principal principal;
	
	public Descargador(Principal principal) {
		
		this.principal = principal;
		
	}
	
	public void run() {
		
		Random randomTipo = new Random();
		Random tiempo = new Random();
		
		while(true) {
			
			int tipo = randomTipo.nextInt(2) + 1;
			principal.descargarArticulo(tipo);
			//System.out.println("Descargado paquete tipo: " + tipo);
			
			try {
				
				Thread.sleep(tiempo.nextInt(3000));
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
				
			}
			
		}
		
	}
		
}
