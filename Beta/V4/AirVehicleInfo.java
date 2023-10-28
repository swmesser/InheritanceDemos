package Beta.V4;

/* 
 * File: AirVehicleInfo
 * Copy: Copyright (c) 2023 Samuel W. Messer
 * BlazerID: swmesser
 * Vers: 1.0.0 Oct 17, 2023 SWM - Original Coding
 * Desc: Driver for testing concepts
 */

public abstract class AirVehicleInfo extends VehicleInfo{
    
    public AirVehicleInfo( String VIN ){
        super( VIN );
    }
}

final class GasVehicleInfo extends AirVehicleInfo {
    private String gasType;
    
    public GasVehicleInfo( String VIN ){
        super( VIN );
        this.gasType = "unknown";
    }

    /**
     * @return the gasType
     */
    public String getGasType() {
        return (this.gasType);
    }

    /**
     * @param gasType the gasType to set
     */
    public void setGasType(String gasType) {
        this.gasType = gasType;
    }
    
    @Override
    public String toString(){
        String output = "";
        
        output += super.toCustom();
        output += "Gas Type: " + this.gasType + '\n';
        
        return( output );
    }
}

final class RotorVehicleInfo extends AirVehicleInfo {
    private int rotorCount;
    
    public RotorVehicleInfo( String VIN ){
        super( VIN );
        this.rotorCount = 0;
    }

    /**
     * @return the rotorCount
     */
    public int getRotorCount() {
        return (this.rotorCount);
    }

    /**
     * @param rotorCount the rotorCount to set
     */
    public void setRotorCount(int rotorCount) {
        this.rotorCount = rotorCount;
    }
    
    @Override
    public String toString(){
        String output = "";
        
        output += super.toCustom();
        output += "Rotor Count: " + this.rotorCount + '\n';
        
        return( output );
    }
}

final class WingedVehicleInfo extends AirVehicleInfo{
    private int wingCount;
    
    public WingedVehicleInfo( String VIN ){
        super( VIN );
        this.wingCount = 0;
    }

    /**
     * @return the wingCount
     */
    public int getWingCount() {
        return (this.wingCount);
    }

    /**
     * @param wingCount the wingCount to set
     */
    public void setWingCount(int wingCount) {
        this.wingCount = wingCount;
    }

    @Override
    public String toCustom(){
        String output = "";
        
        output += super.toCustom();
        output += "Wing Count: " + this.wingCount + '\n';
        
        return( output );
    }
    
    @Override
    public String toString(){
        String output = "";
        
        output += "Classname: " + this.getClass().toString();
        
        return( output );
        
    }
}