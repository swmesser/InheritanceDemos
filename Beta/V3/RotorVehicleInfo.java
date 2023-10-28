package Beta.V3;

/* 
 * File: RotorVehicleInfo
 * Copy: Copyright (c) 2023 Samuel W. Messer
 * BlazerID: swmesser
 * Vers: 1.0.0 Oct 12, 2023 SWM - Original Coding
 * Desc: Driver for testing concepts
 */

public final class RotorVehicleInfo extends AirVehicleInfo{
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
    
    public String toString(){
        String output = "";
        
        output += super.toString();
        output += "Rotor Count: " + this.rotorCount + '\n';
        
        return( output );
    }
    
}
