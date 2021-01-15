public class User {

    private int id;
    private String email;
    private String password;
    private  boolean isActive;

    public User(int id,String email, String password, boolean isActive){
        this.id = id;
        this.email = email;
        this.password = password;
        this.isActive = isActive;
    }

    public int getId(){
        return id;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public boolean getIsActive(){
        return isActive;
    }

    public void setIsActive(boolean isActive){
        this.isActive = isActive;
    }

    @Override
    public String toString(){
        return "ID:"+id+" Email:"+email+" Password: "+password+" Is Active: "+isActive;
    }


}
