package esercitazione;

public class Immagine implements ElementoMultimediale {

	String titolo;
	int brightness;

	public Immagine(String titolo, int brightness) {
		super();
		this.titolo = titolo;
		this.brightness = brightness;
	}
	
	public String getTitolo() {
		return titolo;
	}
	
	@Override
	public void play() {
		
	}


	public void show() {
		System.out.print(titolo);
		for (int j = 0; j < brightness; j++)
			System.out.print("*");
		System.out.println();
		
	}

}
