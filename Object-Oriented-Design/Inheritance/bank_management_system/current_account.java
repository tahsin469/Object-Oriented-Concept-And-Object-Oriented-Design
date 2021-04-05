
package bank_management_system;


public class current_account extends account{

    public current_account(String i,int j, int k) {
        super(i, j, k);
    }
    
    void transaction_fees(transaction t1){
        System.out.println(t1.fees);
    }
    void first_10_transactions(){
        System.out.println("there are no transaction fees");
    }
    void after_10_transactions(){
        System.out.println("transaction fees assign");
    }
}
