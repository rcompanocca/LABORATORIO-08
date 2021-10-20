//AUTOR: RONI COMPANOCCA CHECCO
//LABORATORIO 08 
//HashMap - ENVIO DE PAQUETES
import java.util.*;

public class AppPrincipal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String estado = null;
		System.out.println("PAQUETERIA");
		
		//¿PROFESORA DISCULPE NO ENTENDI BIEN EL GENERAR ALEATORIAMENTE 20 PAQUETES?
		HashMap <Integer, Paquete> ale = new HashMap<Integer, Paquete>();
		ale.put(0, new Paquete("Paquete01", 12.5, 4));
		ale.put(1, new Paquete("Paquete02", 12.3, 3));
		ale.put(2, new Paquete("Paquete03", 13.4, 7));
		ale.put(3, new Paquete("Paquete04", 15.5, 5));
		ale.put(4, new Paquete("Paquete05", 16.5, 4));
		ale.put(5, new Paquete("Paquete06", 17.7, 48));
		ale.put(6, new Paquete("Paquete07", 14.5, 23));
		ale.put(7, new Paquete("Paquete08", 13.8, 20));
		ale.put(8, new Paquete("Paquete09", 22.5, 56));
		ale.put(9, new Paquete("Paquete10", 32.5, 9));
		ale.put(10, new Paquete("Paquete11", 42.6, 19));
		ale.put(11, new Paquete("Paquete12", 14.9, 17));
		ale.put(12, new Paquete("Paquete13", 16.5, 15));
		ale.put(13, new Paquete("Paquete14", 17.5, 11));
		ale.put(14, new Paquete("Paquete15", 12.8, 12));
		ale.put(15, new Paquete("Paquete16", 18.5, 25));
		ale.put(16, new Paquete("Paquete17", 10.5, 2));
		ale.put(17, new Paquete("Paquete18", 11.5, 9));
		ale.put(18, new Paquete("Paquete19", 12.1, 2));
		ale.put(19, new Paquete("Paquete20", 12.5, 47));
		
		Iterator<Integer> aux = ale.keySet().iterator();
		
		while(aux.hasNext()) {
			Integer key = aux.next();
			System.out.println("Clave: "+key+", valor: ("+ale.get(key)+")");
						
		}
		System.out.println("");
		HashMap <Integer, String[]> estadoDePaquete = new HashMap<Integer, String[]>();
		estadoDePaquete.put(0, new String[] {"recibido", "en proceso", "entregado", "fallo entrega"});
		estadoDePaquete.put(1, new String[] {"recibido", "en proceso", "entregado", "fallo entrega"});
		estadoDePaquete.put(2, new String[] {"recibido", "en proceso", "entregado", "fallo entrega"});
		estadoDePaquete.put(3, new String[] {"recibido", "en proceso", "entregado", "fallo entrega"});
		estadoDePaquete.put(4, new String[] {"recibido", "en proceso", "entregado", "fallo entrega"});
		estadoDePaquete.put(5, new String[] {"recibido", "en proceso", "entregado", "fallo entrega"});
		estadoDePaquete.put(6, new String[] {"recibido", "en proceso", "entregado", "fallo entrega"});
		estadoDePaquete.put(7, new String[] {"recibido", "en proceso", "entregado", "fallo entrega"});
		estadoDePaquete.put(8, new String[] {"recibido", "en proceso", "entregado", "fallo entrega"});
		estadoDePaquete.put(9, new String[] {"recibido", "en proceso", "entregado", "fallo entrega"});
		estadoDePaquete.put(10, new String[] {"recibido", "en proceso", "entregado", "fallo entrega"});
		estadoDePaquete.put(11, new String[] {"recibido", "en proceso", "entregado", "fallo entrega"});
		estadoDePaquete.put(12, new String[] {"recibido", "en proceso", "entregado", "fallo entrega"});
		estadoDePaquete.put(13, new String[] {"recibido", "en proceso", "entregado", "fallo entrega"});
		estadoDePaquete.put(14, new String[] {"recibido", "en proceso", "entregado", "fallo entrega"});
		estadoDePaquete.put(15, new String[] {"recibido", "en proceso", "entregado", "fallo entrega"});
		estadoDePaquete.put(16, new String[] {"recibido", "en proceso", "entregado", "fallo entrega"});
		estadoDePaquete.put(17, new String[] {"recibido", "en proceso", "entregado", "fallo entrega"});
		estadoDePaquete.put(18, new String[] {"recibido", "en proceso", "entregado", "fallo entrega"});
		estadoDePaquete.put(19, new String[] {"recibido", "en proceso", "entregado", "fallo entrega"});
		
		Iterator<Integer> auxiliar = estadoDePaquete.keySet().iterator();
		for(int i=0; i<estadoDePaquete.size(); i++) {
			Integer key = auxiliar.next();
			if (i==key) {
				System.out.println("¿Como va el estado de entrega del paquete"+i+1+"?");
				estado.equalsIgnoreCase(scan.nextLine());
			}
			
		}
	}
}
