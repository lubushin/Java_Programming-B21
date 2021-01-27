package day35_CustomClass;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.time.LocalDate;

public class BankAccount {
    public String accountName;
    public String accountNumber;
    public double availableBalance = 0;

    public void setInfo(String accName, String accNumber){
       accountName = accName;
       accountNumber = accNumber;
    }
    public void getInfo(){
        System.out.println("=============================================");
        System.out.println("Date: "+ LocalDate.now());
        System.out.println("Account Name: "+accountName);
        System.out.println("Account number: "+accountNumber);
        System.out.println("Available balance: "+availableBalance);
        System.out.println("=============================================");
    }

    public void deposit(double amount){
      availableBalance+=amount;
    }
    public void withdraw(double amount){
        availableBalance -=amount;
    }

    public void showBalance(){
        System.out.println("As of today "+ LocalDate.now()+" your available balance is: $"+availableBalance);

    }



}
