package ex_21_Exception;

public class Lab_215_custom_Exception {
    public static void main(String[] args) {
        Bank sbi=new Bank("INR",100);
        Bank icici=new Bank("INR",123);
        Bank jp_chase=new Bank("USD",101);
        //int result= sbi.add(icici);
        int result=sbi.add(jp_chase);
        System.out.println(result);
    }
}

class Bank{
   private String currency;
   private Integer amount;

   Bank(String currency, Integer amt){
       this.currency=currency;
       this.amount=amt;
   }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    public Integer add(Bank bankName){
       if(!bankName.currency.equalsIgnoreCase("INR")){
           try {
               throw new Exception("Currency Miss Match Exception");
           } catch (Exception e) {
               System.out.println(e.getMessage());
           }
       }else {
           return bankName.amount + this.amount;
       }
       return 0;
    }
}