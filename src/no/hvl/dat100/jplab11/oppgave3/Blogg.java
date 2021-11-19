package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	private Innlegg[] innleggtabell;
	private int nesteledig = 0;

	public Blogg() {
		
		innleggtabell = new Innlegg[20];
		
	}

	public Blogg(int lengde) {

		innleggtabell = new Innlegg[lengde];
		
	}

	public int getAntall() {
		
		return nesteledig;
		
	}
	
	public Innlegg[] getSamling() {
		
		return innleggtabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {

		int indeks = -1;
		for(int i = 0; i < innleggtabell.length; i++) {
			
			if(innleggtabell[i].erLik(innlegg)) {
				
				indeks = i;
				
			}
			
		}
		
		return indeks;
		
	}

	public boolean finnes(Innlegg innlegg) {
		
		boolean funnet = false;
		
			for(int i = 0; i < nesteledig; i++) {
				
				if(innleggtabell[i].erLik(innlegg)) {
					
					funnet = true;
					
				}
				
			}
			
		return funnet;
		
	}

	public boolean ledigPlass() {
		
		boolean ledig = false;
		
		if(nesteledig < innleggtabell.length) {
			
			ledig = true;
			
		}

		return ledig;
	}
	
	public boolean leggTil(Innlegg innlegg) {
		
	
		
		if(ledigPlass()) {
			
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			return true;
			
		}
		
		return false;
		
	}
	
	public String toString() {
		
		String streng = nesteledig + "\n";
		
		for(int i = 0; i < nesteledig; i++) {
			
			streng = streng + innleggtabell[i].toString();
			
		}
		
		return streng;
		
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		
		Innlegg[] nytabell = new Innlegg[innleggtabell.length * 2];
		
		for(int i = 0; i < nesteledig; i++) {
			
			nytabell[i] = innleggtabell[i];
			
		}
		
		innleggtabell = nytabell;
		
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		for(int i = 0; i < innleggtabell.length; i++) {
			
			if(innleggtabell[i].getId() == innlegg.getId()) {
				
				innleggtabell[i] = null;
				return true;
				
			}
			
		}
		
		return false;
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}