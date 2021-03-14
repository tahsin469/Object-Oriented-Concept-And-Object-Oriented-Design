
package bank_management_system;


public class new_customers extends customers{
    current_account s1;

    public new_customers( int id, String name) {
        super(id, name);
       
    }
   
    void check_account_balance_current_account(account a1){
        System.out.println(a1.balance);
    }
}
