package Beta.V3;

/* 
 * File: SubmersibleVehicleInfo
 * Copy: Copyright (c) 2023 Samuel W. Messer
 * BlazerID: swmesser
 * Vers: 1.0.0 Oct 12, 2023 SWM - Original Coding
 * Desc: Driver for testing concepts
 */

public final class SubmersibleVehicleInfo extends WaterVehicleInfo{

    public SubmersibleVehicleInfo( String VIN ){
        super( VIN );
    }
    
    public String toString(){
        String output = "";
        
        output += super.toString();
        
        return( output );
    }
}
