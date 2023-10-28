package Beta.V5;

/* 
 * File: OrderManagementSystem
 * Copy: Copyright (c) 2023 Samuel W. Messer
 * BlazerID: swmesser
 * Vers: 1.0.0 Oct 26, 2023 SWM - Original Coding
 * Desc: Driver for testing concepts
 */

public class OrderManagementSystem {
    public static void main( String[] args ){
        int index;
        
        index =0;
        System.out.println("Count: " + args.length);
        
        for ( index =0; index < args.length; index++ ){
            System.out.println("args[ " + index + " ] = " + args[ index ]);
        }
        
        CustomerInfo OMSObjectA = new CustomerInfo();
        OMSObjectA.ID = "swmesser";
        OMSObjectA.Name = "Samuel Messer";
        OMSObjectA.toXML(); // will work because I have changed the return value
        OMSObjectA.toCSV();
        
        ProductInfo OMSObjectB = new ProductInfo();
        OMSObjectB.ID = "A1";
        OMSObjectB.Name = "100uF Capacitor";
        OMSObjectB.Category = "Category";
        
        //This can be a Customer, Product OR an Order
        // Because all of our classes are Manageable ( implements the interfaces)
        Manageable OMSObjectC;
        Manageable OMSObjectD = new CustomerInfo();
        Manageable OMSObjectE = new ProductInfo();
        Manageable OMSObjectF = new OrderInfo();
    }
}

// interface - contract that says something will be there, but not how it will be
//  done.
//Note:  no code, just the "contract"
interface Manageable {
    public boolean Exists( String ID );
    public String toCustom();
    public String toXML();
    public String toCSV();

}

interface Taxable {
    public double getTaxRate();
    public double calculateTaxRate();
    public boolean isExcempt();
}

//class OMSBaseInfo{
//    public String ID;
//    public String Name;
//    
//    public static boolean Exists( String ID ){
//        return( false );
//    }
//    
//    public String toCustom(){
//        return( "" );
//    }
//}

//class CustomerInfo {
//makes the customer inherit from the base class
// class CustomerInfo extends OMSBaseInfo
// interface - implement the methods/features described by the "contract"
class CustomerInfo implements Manageable{
    public String ID;
    public String Name;
    public String Email;
    
    // Leave the subclass to choose its own implementations
    // @override
//    public static boolean Exists( String CustomerID ){
//        // knows how/where to search for a CustomerID
//        return( false );
//    }
//    
    //toString();
    
    @Override
    public String toCustom(){
        return( "" ); 
    }

    @Override
    public boolean Exists(String ID) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       return( false );
    }

    @Override
    public String toXML() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return( "" );
    }

    @Override
    public String toCSV() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return( "" );
    }

   
}

// poorly defined flat structures
class ProductInfo implements Manageable, Taxable{
    public String ID;
    public String Name;
    public String Category;
    
//    public static boolean Exists( String ProductID ){
//        return( false );
//    }
    
    //toString();
    
    @Override
    public String toCustom(){
        return( "" );
    }

    @Override
    public boolean Exists(String ID) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toXML() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toCSV() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double getTaxRate() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double calculateTaxRate() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean isExcempt() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

class OrderInfo implements Manageable, Taxable {
    public String ID;
    public String CustomerId;
    public String ProductId;
    public int Quantity;
    public double Price;
    
    //toString();
    
    @Override
    public String toCustom(){
        return( "" );
    }

    @Override
    public boolean Exists(String ID) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toXML() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toCSV() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double getTaxRate() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double calculateTaxRate() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean isExcempt() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

// create an interface
// Exportable
//  toCSV()
//  toCustom
//  toXML
//  toJSON