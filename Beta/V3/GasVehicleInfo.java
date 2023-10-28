package Beta.V3;

/* 
 * File: GasVehicleInfo
 * Copy: Copyright (c) 2023 Samuel W. Messer
 * BlazerID: swmesser
 * Vers: 1.0.0 Oct 12, 2023 SWM - Original Coding
 * Desc: Driver for testing concepts
 */

public final class GasVehicleInfo extends AirVehicleInfo{
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
    
    public String toString(){
        String output = "";
        
        output += super.toString();
        output += "Gas Type: " + this.gasType + '\n';
        
        return( output );
    }
}
