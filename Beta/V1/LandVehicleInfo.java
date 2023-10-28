package Beta.V1;

/* 
 * File: LandVehicleInfo
 * Copy: Copyright (c) 2023 Samuel W. Messer
 * BlazerID: swmesser
 * Vers: 1.0.0 Oct 10, 2023 SWM - Original Coding
 * Desc: Driver for testing concepts
 */

public class LandVehicleInfo extends VehicleInfo {
    //private String TractiveType; // wheel,wheels,tire,tires
    private TractiveTypeEnum TractiveType;
    private int TractiveCount; 
    
    public LandVehicleInfo(){
        super();
        // setting the more specific fields 
        this.TractiveType = TractiveTypeEnum.unknown;
        this.TractiveCount = 0;
    }
    
    public LandVehicleInfo( String VIN ){
        super( VIN ); // we can not set the VIN after construction
        //this(); // we can ONLY call ONE constructor
        this.TractiveType = TractiveTypeEnum.unknown;
        this.TractiveCount = 0;
    }

    /**
     * @return the TractiveType
     */
    public TractiveTypeEnum getTractiveType() {
        return (this.TractiveType);
    }

    /**
     * @param TractiveType the TractiveType to set
     */
    public void setTractiveType(TractiveTypeEnum TractiveType) {
        this.TractiveType = TractiveType;
    }

    /**
     * @return the TractiveCount
     */
    public int getTractiveCount() {
        return (this.TractiveCount);
    }

    /**
     * @param TractiveCount the TractiveCount to set
     */
    public void setTractiveCount(int TractiveCount) {
        this.TractiveCount = TractiveCount;
    }
    
    public String toString(){
        String output = "";
        
        //alternatives
//        output += "VIN: " + this.getVIN() + '\n';
//        output += "VIN: " + super.getVIN() + '\n';
        // for each of the fields in our parent class
        // OR 
        // Rely on the toString from our Parent Class
        output += super.toString();
        // add the specifics for our Child class..
        output += "ClassName: " + this.getClass().toString() + '\n';
        output += "TractiveType: " + this.getTractiveType() +  '\n';
        output += "TractiveCount: " + this.getTractiveCount() + '\n'; 
        
        return( output );
    }
}

enum TractiveTypeEnum{
    unknown,
    wheeled,
    tracked,
    
}

//create the appropriate constructors and toString()
class MotorcycleVehicleInfo extends LandVehicleInfo {
    
    public MotorcycleVehicleInfo() {
        super();
    }
    
    public MotorcycleVehicleInfo( String VIN ){
        super( VIN );
    }
    
    public String toString(){
        String output = "";
        
        output += super.toString();
        
        return( output );
    }
    
}

class PassengerVehicleInfo extends LandVehicleInfo {
    //cartype, doorCount
    private String carType;
    private int doorCount;
    
    public PassengerVehicleInfo(){
        super();
        this.carType = "unknown";
        this.doorCount = 0;
    }
    
    public PassengerVehicleInfo( String VIN ){
        super( VIN );
        this.carType = "unknown";
        this.doorCount = 0;
    }

    /**
     * @return the carType
     */
    public String getCarType() {
        return (this.carType);
    }

    /**
     * @param carType the carType to set
     */
    public void setCarType(String carType) {
        this.carType = carType;
    }

    /**
     * @return the doorCount
     */
    public int getDoor() {
        return (this.doorCount);
    }

    /**
     * @param doorCount the doorCount to set
     */
    public void setDoor(int doorCount) {
        this.doorCount = doorCount;
    }
    
    public String toString(){
        String output = "";
        
        output += super.toString();
        output += "Car Type: " + this.carType + '\n';
        output += "Door Count: " + this.doorCount + '\n';
        
        return( output );
    }
}

class LightTruckVehicleInfo extends LandVehicleInfo {
    private double loadCapacity;
    
    public LightTruckVehicleInfo(){
        super();
        this.loadCapacity = 0;
    }
    
    public LightTruckVehicleInfo( String VIN ){
        super( VIN );
        this.loadCapacity = 0;
    }

    /**
     * @return the loadCapacity
     */
    public double getLoadCapacity() {
        return (this.loadCapacity);
    }

    /**
     * @param loadCapacity the loadCapacity to set
     */
    public void setLoadCapacity(float loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
    
    public String toString(){
        String output = "";
        
        output += super.toString();
        output += "Load Capacity: " + this.loadCapacity + '\n';
        
        return( output );
    }
}

class MediumAndHeavyTruckVehicleInfo extends LandVehicleInfo {
    private double loadCapacity;
    private int axleCount;
    
    public MediumAndHeavyTruckVehicleInfo(){
        super();
        this.axleCount = 0;
        this.loadCapacity = 0.0;
    }
    
    public MediumAndHeavyTruckVehicleInfo( String VIN ){
        super( VIN );
        this.axleCount = 0;
        this.loadCapacity = 0.0;
    }

    /**
     * @return the loadCapacity
     */
    public double getLoadCapacity() {
        return (this.loadCapacity);
    }

    /**
     * @param loadCapacity the loadCapacity to set
     */
    public void setLoadCapacity(float loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    /**
     * @return the axleCount
     */
    public int getAxleCount() {
        return (this.axleCount);
    }

    /**
     * @param axleCount the axleCount to set
     */
    public void setAxleCount(int axleCount) {
        this.axleCount = axleCount;
    }
    
    public String toString(){
        String output = "";
        
        output += super.toString();
        output += "Axle Count: " + this.axleCount + '\n';
        output += "Load Capacity: " + this.loadCapacity + '\n';
        
        return( output );
    }
}