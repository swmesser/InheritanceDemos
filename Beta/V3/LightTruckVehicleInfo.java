package Beta.V3;

/* 
 * File: LightTruckVehicleInfo
 * Copy: Copyright (c) 2023 Samuel W. Messer
 * BlazerID: swmesser
 * Vers: 1.0.0 Oct 12, 2023 SWM - Original Coding
 * Desc: Driver for testing concepts
 */

public final class LightTruckVehicleInfo extends LandVehicleInfo {
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
    
    
    public String toString(){
        String output = "";
        
        output += super.toString();
        output += "Load capacity: " + this.loadCapacity + '\n';
        
        return( output );
    }
}
