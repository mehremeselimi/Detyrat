import java.util.Scanner;

class degzimet {
    public static void main(String[] args) {
        
        System.out.println("Programi per paraqitjen e notes..");

        

        Scanner sc = new Scanner(System.in);

        
        

        System.out.println("Enter points that you got in exam");

        int points = sc.nextInt();

        int nota;

        if(points >= 51 && points <= 60){
            nota = 6;
            System.out.println("Ju keni marre noten " + nota);
        }
        else if(points >= 61 && points <= 70){
            nota = 7;
            System.out.println("Ju keni marre noten " + nota);
        }
        else if(points >= 71 && points <= 80){
            nota = 8;
            System.out.println("Ju keni marre noten " + nota);
        }
        else if(points >= 81 && points <= 90){
            nota = 9;
            System.out.println("Ju keni marre noten " + nota);
        }
        else if(points >= 91 && points <= 100){
            nota = 10;
            System.out.println("Ju keni marre noten " + nota);
        }
        

        sc.close();


    }
}