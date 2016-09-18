package Bodega;

import java.util.Random;

public class Empacador extends Thread{

	private Principal principal;
	
	public Empacador(Principal principal) {
		
		this.principal = principal;
		
	}
	
	public void run() {
		
		Random tiempo = new Random();
		
		while(true) {
			
			principal.armarPaquete();
			System.out.println("Armado paquete");
			
			try {
				
				Thread.sleep(tiempo.nextInt(3000));
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
				
			}
			
		}
		
	}
	
}
