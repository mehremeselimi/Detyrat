import java.util.Scanner;
public class Detyra3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Shto Variablen a:");
        double a = sc.nextDouble();

        System.out.print("Shto Variablen b:");
        double b = sc.nextDouble();

        System.out.print("Shto Variablen c:");
        double c = sc.nextDouble();

        double domain = (b*b)-(4*a*c);
        double sqrt = Math.sqrt(domain);



        if(domain>0){
            double zgj1 = (-b + sqrt)/(2*a);
            double zgj2 = (-b - sqrt)/(2*a);

            System.out.println("X1:"+ zgj1);
            System.out.println("X2:"+ zgj2);

        }else if (domain == 0){
            double zgj = (-b + sqrt)/(2*a);
            System.out.println("X1:"+ zgj);
        }else {
            System.out.println("Keto shifra gjeneroj ekuacion kuadratik ne bashksin e numrave i-real");
        }





    }
}
