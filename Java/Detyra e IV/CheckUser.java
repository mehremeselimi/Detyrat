public class CheckUser {

    public static void main(String[] args) {
        User u1 = new User(1,"test@test","password",true);
        User u2 = new User(2,"test1@test","password1",false);


        System.out.println(u1.toString());


    }
}
