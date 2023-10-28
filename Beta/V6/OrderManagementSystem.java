package Beta.V6;

/* 
 * File:  OrderManagementSystem
 * Copy: Copyright (c) 2023 Samuel W. Messer
 * BlazerID: swmesser
 * Vers: 1.0.0 Oct 26, 2023 SWM - Original Coding
 * Desc: Driver for testing concepts
 */

public class OrderManagementSystem {

    public static void main(String[] args) {
        // TODO code application logic here
    }

}

interface Exportable{
    String toCustom();
    String toCSV();
    String toXML();
}

class CustomerInfo implements Exportable{
    private String ID;
    private String Name;
    private String Email;
    // Street, City, State, Zip
    private AddressInfo ShippingAddress;
    private AddressInfo BillingAddress;

    @Override
    public String toCustom() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toCSV() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toXML() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}

class AddressInfo implements Exportable{
    public String Street;
    public String City;
    public String State;
    public String ZipCode;
    
    public boolean isValid(){
        return( false );
    }

    @Override
    public String toCustom() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toCSV() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toXML() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}