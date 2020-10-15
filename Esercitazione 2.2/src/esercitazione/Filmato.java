package esercitazione;

public class Filmato extends ElementoMultimediale {

	int volume, brightness;
	
	public Filmato(String titolo, int durata, int volume, int brightness) {
		super(titolo, durata);
		this.volume = volume;
		this.brightness = brightness;
	}

	@Override
	public void Play() {
		for (int i = 0; i < getDurata(); i++) {
			System.out.print(getTitolo());
			for (int j = 0; j < volume; j++)
				System.out.print("!");
			for (int j = 0; j < brightness; j++)
				System.out.print("*");
			System.out.println();
		}
		
	}
	
	public void Weaker() {
		volume--;
	}
	
	public void Louder() {
		volume++;
	}
	
	public void Brighter() {
		brightness++;
	}
	
	public void Darker() {
		brightness--;
	}

}
