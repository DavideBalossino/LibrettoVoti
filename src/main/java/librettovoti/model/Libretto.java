package librettovoti.model;
import java.util.*;

public class Libretto {
	private List<Voto> voti;
	
	public Libretto() {
		voti=new ArrayList<>();
	}
	
	public void add(Voto v) {
		voti.add(v);
	}

	@Override
	public String toString() {
		String s="";
		for(Voto v: this.voti) {
			s=s+v.toString()+"\n";
		}
		return s;
	}
	
	public List<Voto> listaVotiUguali(int punteggio){
		List<Voto> risultato=new ArrayList<>();
		for(Voto v: this.voti) {
			if(v.getVoto()==punteggio) {
				risultato.add(v);
			}
		}
		return risultato;
	}
	
	public Libretto votiUguali(int punteggio) {
		Libretto risultato=new Libretto();
		for(Voto v: this.voti) {
			if(v.getVoto()==punteggio) {
			risultato.add(v);}
		//	risultato.voti.add(v);
		}
		return risultato;
	}
	
	
}
