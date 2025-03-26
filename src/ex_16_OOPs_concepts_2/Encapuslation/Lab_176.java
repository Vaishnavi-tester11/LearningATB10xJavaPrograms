package ex_16_OOPs_concepts_2.Encapuslation;

public class Lab_176 {
    public static void main(String[] args) {
        VWOLogin vw=new VWOLogin("admin","pass123");
        System.out.println(vw.password);


        GoodEncapVWOLogin en=new GoodEncapVWOLogin("admin","pwd123");
        //System.out.println(en.password);
        en.setUsername("Ahaana");
        System.out.println(en.getUsername());

        boolean isAdmin=true;
        en.setPassword("123",isAdmin);
        System.out.println(en.getPassword());


    }

}

class VWOLogin{
    String username;
    String password;

    public VWOLogin(String usr,String pwd){
        this.username=usr;
        this.password=pwd;
    }
}

class GoodEncapVWOLogin{
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAdmin) {
        if(isAdmin){
        this.password = password;}
        else{
            System.out.println("Not allowed to change password");
        }
    }

    public GoodEncapVWOLogin(String usr, String pwd){
        this.username=usr;
        this.password=pwd;

    }

}
