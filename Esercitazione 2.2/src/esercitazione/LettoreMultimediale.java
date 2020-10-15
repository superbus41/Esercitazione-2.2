package esercitazione;

import java.util.Scanner;

public class LettoreMultimediale {

	public static void main(String[] args) {
		
		ElementoMultimediale[] e = new ElementoMultimediale[5];
		String str;
		int type = 0, durata = 0, brightness = 0, volume = 0, execute = 0;
		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i < e.length; i++){
			
			System.out.println("Scegliere tipo di elemto multimediale:\n1. RegistrazioneAudio\n2. Filmato\n3. Immagine");
			
			do{
				type = s.nextInt();
			}while(type > 3 || type < 1);
			
			System.out.println("Digitare titolo");
			str = s.next();
			
	
			if (type != 3) {
				
				System.out.println("Digitare durata");
				durata = s.nextInt();
				
				System.out.println("Digitare volume");
				volume = s.nextInt();
			}
			
			if (type != 1) {
				System.out.println("Digitare luminosità");
				brightness = s.nextInt();
			}
	
			
			switch(type) {
				case 1: e[i] = new RegistrazioneAudio(str, durata, volume);
				break;
				case 2: e[i] = new Filmato(str, durata, volume, brightness);
				break;
				case 3: e[i] = new Immagine(str, brightness);
				break;
			}
		}
		
		do{
			System.out.println("Quale elemento riprodurre?");
			for(int i = 0; i < e.length; i++)
				System.out.println((i+1) + ". " + e[i].getTitolo());
			System.out.println("0. Per uscire");
			execute = s.nextInt();
			if (execute != 0) {
				if (e[execute - 1] instanceof Immagine) 
					e[execute - 1].show();
				else
					e[execute - 1].play();
			}
		}while (execute != 0); 
		s.close();
	}
}
