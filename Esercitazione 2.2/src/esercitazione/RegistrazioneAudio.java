package esercitazione;

public class RegistrazioneAudio implements ElementoMultimediale {
	
	String titolo;
	int durata, volume;
	

	public RegistrazioneAudio(String titolo, int durata, int volume) {
		this.titolo = titolo;
		this.durata = durata;
		this.volume = volume;
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


	
}
