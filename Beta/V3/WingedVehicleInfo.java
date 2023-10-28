package Beta.V3;

/* 
 * File: WingedVehicleInfo
 * Copy: Copyright (c) 2023 Samuel W. Messer
 * BlazerID: swmesser
 * Vers: 1.0.0 Oct 12, 2023 SWM - Original Coding
 * Desc: Driver for testing concepts
 */

public final class WingedVehicleInfo extends AirVehicleInfo {
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

    public String toString(){
        String output = "";
        
        output += super.toString();
        output += "Wing Count: " + this.wingCount + '\n';
        
        return( output );
    }
}
