package Beta.V1;

/* 
 * File: WaterVehicleInfo
 * Copy: Copyright (c) 2023 Samuel W. Messer
 * BlazerID: swmesser
 * Vers: 1.0.0 Oct 12, 2023 SWM - Original Coding
 * Desc: Driver for testing concepts
 */

public class WaterVehicleInfo extends VehicleInfo {
    public WaterVehicleInfo( String VIN ){
        super( VIN );
    } 
}

class SubmersibleVehicleInfo extends WaterVehicleInfo {
    public SubmersibleVehicleInfo( String VIN ){
        super( VIN );
    }
}

class SurfaceVehicleInfo extends WaterVehicleInfo {
    public SurfaceVehicleInfo( String VIN ){
        super( VIN );
    }
}