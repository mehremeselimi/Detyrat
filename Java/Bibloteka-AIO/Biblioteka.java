public class Biblioteka{
	
	private String emri;
	private Libri[] librat;
	private int index = 0;
	
	public Biblioteka(String e, int nrLibrave){
		emri = e;
		librat = new Libri[nrLibrave];
	}
	
	public boolean ekziston(Libri l){
		if(l == null){
			System.out.println("Libri nuk eshte inicializuar!");
			return false;
		}
		for(int i =0; i < index; i++){
			if(librat[i].equals(l))
				return true;
		}
		return false;
	}
	
	public void shtoLibrin(Libri l){
		if(l == null){
			System.out.println("Libri nuk eshte inicializuar!");
			return;
		}
		if(index == librat.length){
			System.out.println("Nuk ka vend ne varg!");
			return;
		}
		if(ekziston(l)){
			System.out.println("Libri ekziston ne varg!");
			return;
		}
		librat[index++] = l;
	}
	
	public Enciklopedia maxNumriFaqeve(){
		if(index == 0){
			System.out.println("Nuk ka asnje liber ne varg!");
			return null;
		}
		Enciklopedia temp = null;
		for(int i = 0; i < index; i++){
			if(librat[i] instanceof Enciklopedia){
				Enciklopedia e = (Enciklopedia)librat[i];
				if(temp == null || temp.getNrFaqeve() <= e.getNrFaqeve())
					temp = e;
			}
		}
		if(temp == null)
			System.out.println("Nuk ka asnje Enciklopedi ne varg!");
		return temp;
	}
	
	public LibriShkollor libriDrejtimit(String d){
		if(index == 0){
			System.out.println("Nuk ka asnje liber ne varg!");
			return null;
		}
		LibriShkollor l = null;
		for(int i = 0; i <  index; i++){
			if(librat[i] instanceof LibriShkollor){
				l = (LibriShkollor)librat[i];
				if(l.getDrejtimi().equals(d))
					return l;
			}
		}
		if(l == null)
			System.out.println("Nuk ka asnje Liber Shkollor ne varg!");
		else
			System.out.println("Nuk ka asnje Liber Shkollor me kete drejtim ne varg!");
		return l;
	}
	
	public void shtypKopertinat(boolean k){
		for(int i = 0; i < index; i++){
			if(librat[i] instanceof Botohet){
				Botohet b = (Botohet)librat[i];
				if(b.kaKopertina() == k)
					System.out.println(b);
			}
		}
	}
	
	public static void main(String[] args){
		Biblioteka b = new Biblioteka("Library", 50);
		LibriShkollor l1 = new LibriShkollor(12345, "Java 1", 2, "SHKI 1");
		l1.shtoAutorin(new Autori(123, "Filan", "Fisteku"));
		l1.shtoAutorin(new Autori(223, "Filane", "Fistekaj"));
		b.shtoLibrin(l1);
		LibriShkollor l2 = new LibriShkollor(22345, "Java 2", 1, "SHKI 1");
		l2.shtoAutorin(new Autori(423, "Fistek", "Filani"));
		b.shtoLibrin(l2);
		Enciklopedia e1  = new Enciklopedia(11345, "Anatomia 1", 1, 500);
		e1.shtoAutorin(new Autori(123, "Filan", "Fisteku"));
		Enciklopedia e2  = new Enciklopedia(14345, "Anatomia 2", 2, 200);
		e2.shtoAutorin(new Autori(123, "Filan", "Fisteku"));
		e2.shtoAutorin(new Autori(223, "Filane", "Fistekaj"));
		Enciklopedia e3  = new Enciklopedia(15345, "Anatomia 3", 1, 500);
		e3.shtoAutorin(new Autori(223, "Filane", "Fistekaj"));
		b.shtoLibrin(e1);
		b.shtoLibrin(e2);
		b.shtoLibrin(e3);
		System.out.println();
		System.out.println("maxNumriFaqeve:\n" + b.maxNumriFaqeve());
		System.out.println();
		System.out.println("Drejtimi \"SHKI 1\":\n" + b.libriDrejtimit("SHKI 1"));
		System.out.println();
		System.out.println("Librat me kopertina:");
		b.shtypKopertinat(true);
		System.out.println();
	}
}