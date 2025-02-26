package Task_30;

import java.util.Scanner;

public class ATM_Withdrawal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Acc_Bal=10000;
        int Updated_Acc_Bal=0;
        System.out.println("PLease enter the withdrawal amount");
        int Withdraw_amt=sc.nextInt();

        if(Withdraw_amt<=0){
            System.out.println("please enter the withdrawal amount greater than 0");
        }
        else if( Withdraw_amt % 100 !=0){
            System.out.println(" Please enter the withdrawal amount in the multiples of 100");
        }
        else if ( Withdraw_amt > Acc_Bal){
            System.out.println("Please enter the withdrawal amount not exceed the Account Balance");
        }
        else{
            Updated_Acc_Bal=Acc_Bal-Withdraw_amt;
            System.out.println("Your available balance is "+Updated_Acc_Bal);
        }
    }
}
