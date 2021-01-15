public class Autori{

    private int id;
    private String emri;
    private String mbiemri;

    public Autori(int i, String e, String m){
        id  = i; //readonly
        emri = e;
        mbiemri = m;
    }

    public int getId(){ return id; }

    public String getEmri(){ return emri; }

    public String getMbiemri(){ return mbiemri; }

    public void setEmri(String e){ emri = e; }

    public void setMbiemri(String m){ mbiemri = m; }

    public boolean equals(Object o){
        if(o instanceof Autori){
            return id == ((Autori)o).getId();
        }
        return false;
    }

    public String toString(){
        return id + " : " + emri +  " " + mbiemri;
    }

}