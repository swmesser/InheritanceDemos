package Beta.V1;

/* 
 * File: AirVehicleInfo
 * Copy: Copyright (c) 2023 Samuel W. Messer
 * BlazerID: swmesser
 * Vers: 1.0.0 Oct 10, 2023 SWM - Original Coding
 * Desc: Driver for testing concepts
 */

public class AirVehicleInfo extends VehicleInfo{
    // Note since we have a private parameterless constructor in our base class
    //  we MUST have a constructor in our child (or inherited) class
    public AirVehicleInfo(){
         // this. --> allows us to see all of our getters/setters but NOT the
         // private variables. We can not set the VIN
         super(); // Calls VehicleInfo()
         // set specific fields/defaults
    }
    
    public AirVehicleInfo( String VIN ){
        // call our parent constructor
        super( VIN ); // calls VehicleInfo( String VIN );
    }
}

class WingedVehicleInfo extends AirVehicleInfo{
    private int WingCount;
    
    public WingedVehicleInfo(){
        super();
        this.WingCount = 0;
    }
    
    public WingedVehicleInfo( String VIN ){
        super( VIN );
        this.WingCount = 0;
    }

    /**
     * @return the WingCount
     */
    public int getWingCount() {
        return (this.WingCount);
    }

    /**
     * @param WingCount the WingCount to set
     */
    public void setWingCount(int WingCount) {
        this.WingCount = WingCount;
    }
    
    public String toString(){
        String output = "";
        
        output += super.toString();
        output += "Wing Count: " + this.WingCount + '\n';
        
        return( output );
        
    }
    
}

class GasVehicleInfo extends AirVehicleInfo{
    private String GasType;
    
    public GasVehicleInfo(){
        super();
        this.GasType = "unknown";
    }
    
    public GasVehicleInfo( String VIN ){
        super( VIN );
        this.GasType = "unknown";
    }

    /**
     * @return the GasType
     */
    public String getGasType() {
        return (this.GasType);
    }

    /**
     * @param GasType the GasType to set
     */
    public void setGasType(String GasType) {
        this.GasType = GasType;
    }
    
    public String toString(){
        String output = "";
        
        output += super.toString();
        output += "Gas Type: " + this.GasType + '\n';
        
        return( output );
    }
    
}

class RotorVehicleInfo extends AirVehicleInfo{
    private int RotorCount;
    
    public RotorVehicleInfo(){
        super();
        this.RotorCount = 0;
    }
    
    public RotorVehicleInfo( String VIN ){
        super( VIN );
        this.RotorCount = 0;
    }

    /**
     * @return the RotorCount
     */
    public int getRotorCount() {
        return (this.RotorCount);
    }

    /**
     * @param RotorCount the RotorCount to set
     */
    public void setRotorCount(int RotorCount) {
        this.RotorCount = RotorCount;
    }
    
    public String toString(){
        String output = "";
        
        output += super.toString();
        output += "Rotor Count: " + this.RotorCount + '\n';
        
        return( output );
    }
}