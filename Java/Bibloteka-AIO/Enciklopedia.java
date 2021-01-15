public class Enciklopedia extends Libri implements Botohet{
	
	private int nrFaqeve;
	
	public Enciklopedia(int i, String t, int nrA, int nrF){
		super(i, t, nrA);
		nrFaqeve = nrF;
	}
	
	public int getNrFaqeve(){ return nrFaqeve; }
	
	public void setNrFaqeve(int nrF){ nrFaqeve = nrF; }
	
	public void shtoAutorin(Autori a){
		if(a == null){
			System.out.println("Autori nuk eshte inicializuar!");
			return;
		}
		if(index == autoret.length){
			System.out.println("Nuk ka vend ne varg!");
			return;
		}
		if(exists(a)){
			System.out.println("Libri e ka kete autor!");
			return;
		}
		autoret[index++] = a;
	}
	
	public boolean exists(Autori a){
		if(a == null){
			System.out.println("Autori nuk eshte inicializuar!");
			return false;
		}
		for(int i = 0; i < index; i++)
			if(autoret[i].equals(a))
				return true;
		return false;
	}
	
	public boolean kaKopertina(){ return true; }
	
	public boolean kaUshtrime(){ return false; }
	
	public String toString(){ 
		return "Enciklopedia " + super.toString() + " ka " + nrFaqeve + " faqe";
	}
	
}