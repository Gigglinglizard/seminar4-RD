package se.kth.iv1350.view;


import se.kth.iv1350.controller.*; 
import se.kth.iv1350.integration.DatabaseFailureException;
import se.kth.iv1350.integration.InvalidItemIdentifierException;

public class view {
    controller contr;
    public view(controller contr){
        this.contr = contr;
    }
    
    public void test(){
        try{
            contr.startSale();

            contr.registerItem(2, 2.0);

            contr.registerItem(2, 2.0);

            contr.registerItem(3, 4.0);

            //contr.registerItem(7,3.0);

            contr.registerItem(1, 10.0);

            contr.registerItem(4, 5.0);

            contr.registerItem(6, 4.0);
        } 
        catch(DatabaseFailureException exception){
            System.out.println("ERROR: Database Offline, please contact IT support.");
        }
        catch(InvalidItemIdentifierException exception){
            System.out.print("ERROR: Invalid Item Identifier.");
        }
        contr.pay(600.0); 
        System.out.println("\n");
        contr.getReceipt(); 
    }
}

