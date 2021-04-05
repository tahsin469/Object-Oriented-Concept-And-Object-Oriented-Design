
package bank_management_system;


public class Main {

    
    public static void main(String[] args) {
        saving_account saving_account_obj = new saving_account("Tahsin",20,2000);
        current_account current_account_obj = new current_account("Rana",30,3000);
        deposit deposit_obj = new deposit(2000);
        withdraw withdraw_obj = new withdraw(500);
        new_customers new_customers_obj = new new_customers(45,"Ahsan");
        old_customers old_customers_obj = new old_customers(46,"Subbir");
        old_customers_obj.check1(deposit_obj);
        old_customers_obj.check2(withdraw_obj);
        transaction transaction_obj = new transaction("1%");
        current_account_obj.transaction_fees(transaction_obj);
        saving_account_obj.first_5_deposits();
        current_account_obj.first_10_transactions();
        saving_account_obj.after_5_deposits();
        current_account_obj.after_10_transactions();
        new_customers_obj.check_account_balance_saving_account(saving_account_obj);
        new_customers_obj.check_account_balance_current_account(current_account_obj);
        old_customers_obj.check_account_balance_saving_account(saving_account_obj);
        old_customers_obj.check_account_balance_current_account(current_account_obj);
        
        
    }

    
    
}
