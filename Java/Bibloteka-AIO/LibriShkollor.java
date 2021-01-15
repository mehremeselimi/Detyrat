public class LibriShkollor extends Libri implements Botohet{
	
	private String drejtimi;
	
	public LibriShkollor(int i, String t, int nrA, String d){
		super(i, t, nrA);
		drejtimi = d;
	}
	
	public String getDrejtimi(){ return drejtimi; }
	
	public void setDrejtimi(String d){ drejtimi = d; }
	
	public void shtoAutorin(Autori a){
		if(a == null){
			System.out.println("Autori nuk eshte inicializuar!");
			return;
		}
		if(index == autoret.length){
			System.out.println("Nuk ka vend ne varg!");
			return;
		}
		for(int i = 0; i < index; i++){
			if(autoret[i].equals(a)){
				System.out.println("Libri e ka kete autor!");
				return;
			}
		}
		autoret[index++] = a;
	}
	
	public boolean kaKopertina(){ return false; }
	
	public boolean kaUshtrime(){ return true; }
	
	public String toString(){
		return "Libri Shkollor " + super.toString() + " : " + drejtimi;
	}
}