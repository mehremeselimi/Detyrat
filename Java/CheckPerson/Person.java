public class Person {
    private String Name;
    private String SurName;    
    private String JobPosition;

    public Person(String Name,String SurName)
    {
       this.Name = Name;
       this.SurName = SurName;
       this.JobPosition = "I pa pune";
    } 
    public Person(String Name,String SurName, String JobPosition)
    {
       this.Name = Name;
       this.SurName = SurName;
       this.JobPosition = JobPosition;
    } 

    public String getName(){
        return this.Name;
    }
    public void setName(String newName){
        this.Name = newName;
    }
    public String getSurName(){
        return this.SurName;
    }
    public void setSurName(String newSurName){
        this.SurName = newSurName;
    }
    public String getJobPosition(){
        return this.JobPosition;
    }
    public void setJobPosition(String newJobPosition){
        this.JobPosition = newJobPosition;
    }
    
    
    @Override
    public String toString() {
        return this.Name + " " + this.SurName + " works as: " + this.JobPosition;
    }
}
    