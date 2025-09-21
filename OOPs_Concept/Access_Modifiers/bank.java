
class Account{
    public String name;
    protected String email;
    private String password;

    // Setter for password
    public void setPassword(String pwd){
        this.password = pwd;
    }

    // Getter for password (optional, for safe access)
    public String getPassword(){
        return this.password;
    }

    // Override toString method to print account details (excluding private password)
    @Override
    public String toString(){
        return "Name: " + name + ", Email: " + email;
    }
}

public class bank{
    public static void main(String[] args) {
        Account myobj1 = new Account();
        myobj1.email = "sonam123@gmail.com";
        myobj1.name = "sonam";
        myobj1.setPassword("abcd");
        
        System.out.println(myobj1);  // Will call toString() method
    }
}
