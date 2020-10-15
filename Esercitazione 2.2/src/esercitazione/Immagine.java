package esercitazione;

public class Immagine extends ElementoMultimediale {

	int brightness;
	
	public Immagine(String titolo, int durata, int brightness) {
		super(titolo, durata);
		this.brightness = brightness;
	}

	@Override
	public void Play() {
		
	}
	
	public void Show() {
		System.out.print(getTitolo());
		for (int j = 0; j < brightness; j++)
			System.out.print("*");
		System.out.println();
		
	}

}
