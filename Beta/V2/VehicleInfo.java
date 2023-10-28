package Beta.V2;

import java.util.ArrayList;
import java.util.Vector;

/* 
 * File: VehicleInfo
 * Copy: Copyright (c) 2023 Samuel W. Messer
 * BlazerID: swmesser
 * Vers: 1.0.0 Oct 12, 2023 SWM - Original Coding
 * Desc: Driver for testing concepts
 */
//one class- no granularity!
public class VehicleInfo {
    // static or global... no instance required
    private static int SystemIDCounter = 0; // Keep track of how many instances have been created
    private static java.util.ArrayList<java.lang.Integer> SystemIDs = new java.util.ArrayList<java.lang.Integer>();
    
    private static int getNewSystemId(){
        SystemIDCounter = 0;
        boolean found = false;
        int ndx = 0;
        
        while ( found == false ){
            while ( ndx < SystemIDs.size()){
                if ( SystemIDCounter == SystemIDs.get(ndx)){
                    //match found --> already exists
                    SystemIDCounter++;
                    break; //break out of the inner loop
                    // found = true;
                } else {
                    // we keep looking 
                    ndx++;
                    
                }
            }
            if ( ndx == SystemIDs.size() ){
                //looped through arraylist with no matches
                found = true;
            } else {
                //need to keep looking
            }
        } 
        
        
//        while( ndx < SystemIDs.size()){
//            if ( SystemIDCounter == SystemIDs.get(ndx)){
//                //we have a match
//                // go to the next available id
//                SystemIDCounter++;
//            } else {
//                // assign this ID
//            }
//        }
//     
        SystemIDs.add(SystemIDCounter);
        return(SystemIDCounter);
    }
    
    private String SystemIDasString;
    private int SystemIDasInt;
    private String Make;
    private String Model;
    private String VIN;
    private int Year;
    private int PassengerCount;
    //Land Vehicle information
    private int DoorCount;
    private String CarType;
    private int LoadCapacity;
    private int AxleCount;
    //Air Vehicle
    private int WingCount;
    private String GasType;
    private VehicleType CurrentVehicleType;
    
    public VehicleInfo( String VIN, VehicleType CurrentVehicleType ){
        //set all of the defaults 
        
        // get a unique system ID
        // leverage a "global" method/approach
        // Ex: increment the global counter
//        SystemIDCounter++; 
//        this.SystemIDasInt = SystemIDCounter;
//        
//        //check to see if the id is already in use
//        
//        this.SystemIDasString = "AL" + SystemIDCounter;
        this.SystemIDasInt = SystemIDCounter;
        //test
    }
    
    public String toString(){
        String output = "";
        
        if ( CurrentVehicleType == VehicleType.Gas ){
            
        } else if ( CurrentVehicleType == VehicleType.Motorcycle){
            
        } else if ( CurrentVehicleType == VehicleType.Passenger) {
            
        } else {
            
        }
        
        return( output );
    }
    
    
    /**
     * @return the Make
     */
    public String getMake() {
        return (this.Make);
    }

    /**
     * @param Make the Make to set
     */
    public void setMake(String Make) {
        this.Make = Make;
    }

    /**
     * @return the Model
     */
    public String getModel() {
        return (this.Model);
    }

    /**
     * @param Model the Model to set
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * @return the VIN
     */
    public String getVIN() {
        return (this.VIN);
    }

    /**
     * @return the Year
     */
    public int getYear() {
        return (this.Year);
    }

    /**
     * @param Year the Year to set
     */
    public void setYear(int Year) {
        this.Year = Year;
    }

    /**
     * @return the PassengerCount
     */
    public int getPassengerCount() {
        return (this.PassengerCount);
    }

    /**
     * @param PassengerCount the PassengerCount to set
     */
    public void setPassengerCount(int PassengerCount) {
        this.PassengerCount = PassengerCount;
    }
}

enum VehicleType{
    Winged,
    Gas,
    Rotor,
    Passenger,
    Motorcycle,
    Truck
}
