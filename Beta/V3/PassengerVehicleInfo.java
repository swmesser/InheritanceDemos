package Beta.V3;

/* 
 * File: PassengerVehicleInfo
 * Copy: Copyright (c) 2023 Samuel W. Messer
 * BlazerID: swmesser
 * Vers: 1.0.0 Oct 12, 2023 SWM - Original Coding
 * Desc: Driver for testing concepts
 */

public final class PassengerVehicleInfo extends LandVehicleInfo {
    private String CarType;
    private int DoorCount;
    
    public PassengerVehicleInfo( String VIN ){
        super( VIN );
        this.CarType = "unknown";
        this.DoorCount = 0;
    }

    /**
     * @return the CarType
     */
    public String getCarType() {
        return (this.CarType);
    }

    /**
     * @param CarType the CarType to set
     */
    public void setCarType(String CarType) {
        this.CarType = CarType;
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
    
    public String toString(){
        String output = "";
        
        output += super.toString();
        output += "Door Count: " + this.DoorCount + '\n';
        output += "Car Type: " + this.CarType + '\n';
        
        return( output );
    }
}
