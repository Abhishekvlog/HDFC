import java.util.Scanner;

public class HDFC extends AllOperation {


    @Override
    public void Deposit(int amount) {
        int Balance = getBank_Balance()+amount;
        System.out.println(Balance);
    }

    @Override
    public void Withdraw_money(int amount) {
        int Balance = getBank_Balance() - amount;
        System.out.println(Balance);
    }

    @Override
    public void Show_balance() {
        System.out.println(getBank_Balance());
    }

    @Override
    public void Show_account_details() {
        System.out.println("Name : " + getName());
        System.out.println("Account number : "+getAccount_Number());
        System.out.println("Total Balance : "+getBank_Balance());
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Choice \n 1 : Deposit\n 2 : Withdrawal amount \n 3 : Total Balance \n 4 : Show Detail");
        int choice =sc.nextInt();
        AllOperation allOperation = new HDFC();
        switch (choice){
            case 1 :
                System.out.println("Enter Amount : ");
                int amount = sc.nextInt();
                allOperation.Deposit(amount);
                break;
            case 2 :
                System.out.println("Enter Withdrawal amount : ");
                int Withdrawal_amount = sc.nextInt();
                allOperation.Withdraw_money(Withdrawal_amount);
                break;
            case 3 :
                System.out.println("Total bank Balance : " + allOperation.getBank_Balance());
                break;
            case 4 :
                allOperation.Show_account_details();
                break;
        }
    }
}
