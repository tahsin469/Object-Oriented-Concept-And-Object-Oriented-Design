
package bank_management_system;


public class saving_account extends account{

    public saving_account(String i,int j,int k) {
        super(i, j, k);
    }
    void first_5_deposits(){
        System.out.println("there are no interest will add");
    }
    void after_5_deposits(){
            System.out.println(" apply interest rate");
    }
}
