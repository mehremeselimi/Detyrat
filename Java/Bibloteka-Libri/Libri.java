public class Libri{

    private int isbn;
    private String titulli;
    private int vitiPublikimit;

    public Libri(int i, String t, int vP){
        isbn = i;
        titulli = t;
        vitiPublikimit = vP;
    }

    public int getIsbn(){
        return isbn;
    }

    public String getTitulli(){
        return titulli;
    }

    public int getvitiPublikimit(){
        return vitiPublikimit;
    }

    public void setTitulli(String t){
        titulli = t;
    }

    public void setVitiPublikimit(int vP){
        vitiPublikimit = vP;
    }

    @Override
    public String toString(){
        return isbn+": "+titulli+"- "+vitiPublikimit;
    }
}