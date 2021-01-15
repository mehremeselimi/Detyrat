public class Biblioteka {

    public static void main(String[] args) {
        
        Libri l1 = new Libri(1,"Libri 1 ",2000);
        Libri l2 = new Libri(2,"Libri 2 ",2002);
        Libri l3 = new Libri(3,"Libri 3 ",2006);
        Libri l4 = new Libri(4,"Libri 4 ",2008);

        String libri1 =l1.toString();
        String libri2 =l2.toString();
        String libri3 =l3.toString();
        String libri4 =l4.toString();

        System.out.println(libri1);
        System.out.println(libri2);
        System.out.println(libri3);
        System.out.println(libri4);
        


    }
    
}
