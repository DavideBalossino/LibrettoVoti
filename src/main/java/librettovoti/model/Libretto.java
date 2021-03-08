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
	
	
}
