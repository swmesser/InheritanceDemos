package Beta.V3;

/* 
 * File: SurfaceVehicleInfo
 * Copy: Copyright (c) 2023 Samuel W. Messer
 * BlazerID: swmesser
 * Vers: 1.0.0 Oct 12, 2023 SWM - Original Coding
 * Desc: Driver for testing concepts
 */

public final class SurfaceVehicleInfo extends WaterVehicleInfo{

    public SurfaceVehicleInfo( String VIN ){
        super( VIN );
    }
    
    public String toString(){
        String output = "";
        
        output += super.toString();
        
        return( output );
    }
}
