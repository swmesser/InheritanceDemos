package Beta.V4;


/* 
 * File: WaterVehicleInfo
 * Copy: Copyright (c) 2023 Samuel W. Messer
 * BlazerID: swmesser
 * Vers: 1.0.0 Oct 17, 2023 SWM - Original Coding
 * Desc: Driver for testing concepts
 */

public abstract class WaterVehicleInfo extends VehicleInfo{
     public WaterVehicleInfo( String VIN ){
        super( VIN );
    }
}

final class SurfaceVehicleInfo extends WaterVehicleInfo{
    public SurfaceVehicleInfo( String VIN ){
        super( VIN );
    }
    
    @Override
    public String toCustom(){
        String output = "";
        
        output += super.toCustom();
        
        return( output );
    }
    
    @Override
    public String toString(){
        String output = "";
        
        output += "Classname: " + this.getClass().toString();
        
        return( output );
        
    }
}

final class SubmersibleVehicleInfo extends WaterVehicleInfo{
    public SubmersibleVehicleInfo( String VIN ){
        super( VIN );
    }
    
    @Override
    public String toCustom(){
        String output = "";
        
        output += super.toCustom();
        
        return( output );
    }
    
    @Override
    public String toString(){
        String output = "";
        
        output += "Classname: " + this.getClass().toString();
        
        return( output );
        
    }
}