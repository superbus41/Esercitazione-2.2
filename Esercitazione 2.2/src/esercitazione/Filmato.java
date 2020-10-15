package esercitazione;

public class Filmato implements ElementoMultimediale {
	
	String titolo;
	int durata, volume, brightness;
	
	public Filmato(String titolo, int durata, int volume, int brightness) {
		this.titolo = titolo;
		this.durata = durata;
		this.volume = volume;
		this.brightness = brightness;
	}
	
	public String getTitolo() {
		return titolo;
	}

	@Override
	public void play() {
		for (int i = 0; i < durata; i++) {
			System.out.print(titolo);
			for (int j = 0; j < volume; j++)
				System.out.print("!");
			for (int j = 0; j < brightness; j++)
				System.out.print("*");
			System.out.println();
		}
		
	}
	
	@Override
	public void show() {
		
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
