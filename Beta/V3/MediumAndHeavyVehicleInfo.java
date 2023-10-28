package Beta.V3;

/* 
 * File: MediumAndHeavyVehicleInfo
 * Copy: Copyright (c) 2023 Samuel W. Messer
 * BlazerID: swmesser
 * Vers: 1.0.0 Oct 12, 2023 SWM - Original Coding
 * Desc: Driver for testing concepts
 */

public final class MediumAndHeavyVehicleInfo extends LandVehicleInfo {
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
    
    public String toString(){
        String output = "";
        
        output += super.toString();
        output += "Load Capacity: " + this.loadCapacity + '\n';
        output += "Axle Count: " + this.axleCount + '\n';
        
        return( output );
    }
    
}
