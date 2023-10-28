package Beta.V4;

/* 
 * File: LandVehicle
 * Copy: Copyright (c) 2023 Samuel W. Messer
 * BlazerID: swmesser
 * Vers: 1.0.0 Oct 17, 2023 SWM - Original Coding
 * Desc: Driver for testing concepts
 */


//Difference in this and V3 is this locations. The final classes can not be public in here as there can only be one public class per class file
//This would be similar to the individual files compressed down into this one per each sub category
public abstract class LandVehicleInfo extends VehicleInfo {
    private TractiveTypeEnum TractiveType;
    private int TractiveCount;
    
    public LandVehicleInfo( String VIN ){
        super( VIN );
        
        //Validate all of this garbage
        this.TractiveType = TractiveTypeEnum.unknown;
        this.TractiveCount = 0; // -1 
    }
    
    public LandVehicleInfo( String VIN, TractiveTypeEnum TractiveType, int TractiveCount ){
        this( VIN );
        this.TractiveType = TractiveTypeEnum.unknown;
        this.TractiveCount = 0;
        
    }
    
    public LandVehicleInfo( String VIN, String Make, String Model, int Year ){
        //this( VIN ); // Calls LandVehicleInfo
        super( VIN,Make, Model, Year ); // Calls VehicleInfo
        this.TractiveCount = 0;
        this.TractiveType = TractiveTypeEnum.unknown;
        
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
    
    @Override
    public String toString(){
        String output = "";
        
        output += this.getClass().toString();
        
        return(output);
    }
    
    @Override
    public String toCustom(){
        String output = "";
        
        output += super.toCustom();
        output += "Tractive Count: " + this.TractiveCount + '\n';
        output += "Tractive Type: " + this.TractiveType + '\n';
        
        return( output );
    }
}

enum TractiveTypeEnum{
    wheeled,
    tracked,
    skidded,
    unknown
}

final class PassengerVehicleInfo extends LandVehicleInfo {
    private PassengerVehicleEnum PassengerVehicleType;
    private int DoorCount;
    
    public PassengerVehicleInfo( String VIN ){
        super( VIN );
        this.PassengerVehicleType = PassengerVehicleEnum.unknown;
        this.DoorCount = 0;
    }
    
    public PassengerVehicleInfo( String VIN, String Make, String Model, int Year ){
        super( VIN, Make, Model, Year);
        this.PassengerVehicleType = PassengerVehicleEnum.unknown;
        this.DoorCount = 0;
    }

    /**
     * @return the PassengerVehicleType
     */
    public PassengerVehicleEnum getPassengerVehicleType() {
        return (this.PassengerVehicleType);
    }

    /**
     * @param PassengerVehicleType the PassengerVehicleType to set
     */
    public void setPassengerVehicleType(PassengerVehicleEnum PassengerVehicleType) {
        this.PassengerVehicleType = PassengerVehicleType;
    }

    /**
     * @return the DoorCount
     */
    public int getDoorCount() {
        return (this.DoorCount);
    }

    /**
     * @param DoorCount the DoorCount to set
     */
    public void setDoorCount(int DoorCount) {
        this.DoorCount = DoorCount;
    }
    
    @Override
    public String toCustom(){
        String output = "";
        
        output += super.toCustom();
        output += "Door Count: " + this.DoorCount + '\n'; // Optionally call .getDoorCount
        output += "Passenger Vehicle Type: " + this.PassengerVehicleType + '\n';
        
        return( output );
    }
    
    @Override
    public String toString(){
        String output = "";
        
        output += "Classname: " + this.getClass().toString();
        
        return( output );
        
    }
}

enum PassengerVehicleEnum{
    Coupe,
    Sedan,
    Wagon,
    unknown
}

final class MotorcycleVehicleInfo extends LandVehicleInfo {
    public MotorcycleVehicleInfo( String VIN ){
        super( VIN );
    }
    
    @Override
    public String toCustom(){
        String output = "";
        
        output += super.toCustom();
        
        return( output );
    }
    
    public String toString(){
        String output = "";
        
        output += "Classname: " + this.getClass().toString();
        
        return( output );
        
    }
}

final class LightTruckVehicleInfo extends LandVehicleInfo {
    private int loadCapacity;
    
    public LightTruckVehicleInfo( String VIN ) {
        super(VIN);
        this.loadCapacity = 0;
    }

    /**
     * @return the loadCapacity
     */
    public int getLoadCapacity() {
        return (this.loadCapacity);
    }

    /**
     * @param loadCapacity the loadCapacity to set
     */
    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
    
    
    @Override
    public String toCustom(){
        String output = "";
        
        output += super.toString();
        output += "Load capacity: " + this.loadCapacity + '\n';
        
        return( output );
    }
    
    @Override
    public String toString(){
        String output = "";
        
        output += "Classname: " + this.getClass().toString();
        
        return( output );
        
    }
}
    
final class MediumAndHeavyVehicleInfo extends LandVehicleInfo{
    private int loadCapacity;
    private int axleCount;
    
    public MediumAndHeavyVehicleInfo( String VIN ){
        super( VIN );
        this.loadCapacity = 0;
        this.axleCount = 0;
    }

    /**
     * @return the loadCapacity
     */
    public int getLoadCapacity() {
        return (this.loadCapacity);
    }

    /**
     * @param loadCapacity the loadCapacity to set
     */
    public void setLoadCapacity(int loadCapacity) {
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
    
    @Override
    public String toCustom(){
        String output = "";
        
        output += super.toCustom();
        output += "Load Capacity: " + this.loadCapacity + '\n';
        output += "Axle Count: " + this.axleCount + '\n';
        
        return( output );
    }
    
    @Override
    public String toString(){
        String output = "";
        
        output += "Classname: " + this.getClass().toString() + '\n';
        
        return(output);
    }
}
