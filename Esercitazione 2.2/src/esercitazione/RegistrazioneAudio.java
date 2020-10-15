package esercitazione;

public class RegistrazioneAudio extends ElementoMultimediale {
	
	int volume;
	
	public RegistrazioneAudio(String titolo, int durata, int volume) {
		super(titolo, durata);
		this.volume = volume;
	}

	@Override
	public void Play() {
		for (int i = 0; i < getDurata(); i++) {
			System.out.print(getTitolo());
			for (int j = 0; j < volume; j++)
				System.out.print("!");
			System.out.println();
		}
		
	}

	public void Weaker() {
		volume--;
	}
	
	public void Louder() {
		volume++;
	}
	
}
