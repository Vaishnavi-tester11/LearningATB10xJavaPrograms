package ex_16_OOPs_concepts_2.Encapuslation.RealExample;

public class LaB_177 {
    public static void main(String[] args) {
        ICICIBank b=new ICICIBank("Vaishnavi",20000);
        System.out.println(b.getName());
        System.out.println(b.getBal());
        System.out.println(" -------- ");
        b.setName("Ahaana");
        System.out.println(b.getName());
        boolean isCashier=false;
       b.setBal(50000,isCashier);
        System.out.println(b.getBal());
        isCashier=true;
       b.setBal(50000,isCashier);
        System.out.println(b.getBal());

        System.out.println(b.Bank_name);
    }

}

class ICICIBank{

    private String name;
   private  long Bal;
    public String Bank_name="ICICI";
   ICICIBank(String name,long bal){
       this.name=name;
       this.Bal=bal;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return Bal;
    }

    public void setBal(long bal, boolean isCashier) {
        if (isCashier){
            this.Bal = bal;
        }
        else{
            System.out.println("Not allowed to set the balance");
        }
    }
}
