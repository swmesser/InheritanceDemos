package Beta.V3;

/* 
 * File: LandVehicle
 * Copy: Copyright (c) 2023 Samuel W. Messer
 * BlazerID: swmesser
 * Vers: 1.0.0 Oct 12, 2023 SWM - Original Coding
 * Desc: Driver for testing concepts
 */
// abstract - prevents an instance of a class being generated
//      requires that this class be extended to be "useful"
public abstract class LandVehicleInfo extends VehicleInfo {
    private String TractiveType;
    private int TractiveCount;
    
    public LandVehicleInfo( String VIN ){
        super( VIN );
        this.TractiveCount = 0;
        this.TractiveType = "unknown";
        
    }
    
    /**
     * @return the TractiveType
     */
    public String getTractiveType() {
        return (this.TractiveType);
    }

    /**
     * @param TractiveType the TractiveType to set
     */
    public void setTractiveType(String TractiveType) {
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


////final -- no one can inherit from this class
//final class PassengerVehicleInfo extends LandVehicleInfo {
//    
//}
//
//final class MotorCycleVehicleInfo extends LandVehicleInfo {
//    
//}
//
//final class LightTruckVehicleInfo extends LandVehicleInfo {
//    
//}
//
//final class MediumAndHeavyTruckVehicleInfo extends LandVehicleInfo {
//    
//}

//Can not inherit from the final PassengerVehicleInfo
//class SideBySideVehicleInfo extends PassengerVehicleInfo{
//    
//}