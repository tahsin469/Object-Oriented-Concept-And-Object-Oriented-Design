
package bank_management_system;


public class old_customers extends customers{
     saving_account s2;

    public old_customers( int id, String name) {
        super(id, name);
     
    }

     void check1(deposit d1){
         if (d1.amount == 2000) {
             System.out.println("current account");
         }
         else
             System.out.println("saving account");
     }
     
     void check2(withdraw w1){
         if (w1.money == 500) {
             System.out.println("saving account");
         }
         else
             System.out.println("current account");
     }
     
     void check_account_balance_saving_account(account a1){
        System.out.println(a1.balance);
    }
    
}
