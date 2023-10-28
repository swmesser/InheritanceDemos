package Beta.V4;

/* 
 * File: VehicleInfo
 * Copy: Copyright (c) 2023 Samuel W. Messer
 * BlazerID: swmesser
 * Vers: 1.0.0 Oct 17, 2023 SWM - Original Coding
 * Desc: Driver for testing concepts
 */

public abstract class VehicleInfo {
    private String Make;
    private String Model;
    private String VIN;
    private int Year;
    private int PassengerCount;
    
    //TODO: fix this...
    public VehicleInfo(){
        this.VIN = "";
        this.Make = "";
        this.Model = "";
        this.Year = 1900; // 0 or -1
        this.PassengerCount = 0; // -1
    }
    
    public VehicleInfo( String VIN, String Make, String Model, int Year ){
        //TODO: Needs validation
        this( VIN );
        this.setMake(Make);
        this.setModel(Model);
        this.setYear(Year);
        
    }
    
    public VehicleInfo( String VIN ){
        this(); //Calls the private parameterless constructor
        this.VIN = VIN;
    }

    /**
     * @return the Make
     */
    public String getMake() {
        return (this.Make);
    }

    /**
     * @param Make the Make to set
     */
    public void setMake(String Make) {
        this.Make = Make;
    }

    /**
     * @return the Model
     */
    public String getModel() {
        return (this.Model);
    }

    /**
     * @param Model the Model to set
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * @return the VIN
     */
    public String getVIN() {
        return (this.VIN);
    }

    /**
     * @return the Year
     */
    public int getYear() {
        return (this.Year);
    }

    /**
     * @param Year the Year to set
     */
    public void setYear(int Year) {
        this.Year = Year;
    }

    /**
     * @return the PassengerCount
     */
    public int getPassengerCount() {
        return (this.PassengerCount);
    }

    /**
     * @param PassengerCount the PassengerCount to set
     */
    public void setPassengerCount(int PassengerCount) {
        this.PassengerCount = PassengerCount;
    }
    
    public String toCustom(){
        String output = "";
        
        //SHOULD SHOW THE Outputs
        

        output += "VIN: " + this.VIN + '\n';
        output += "Year: " + this.Year + '\n';
        output += "Make: " + this.Make + '\n';
        output += "Model: " + this.Model + '\n';
        output += "Passenger Count: " + this.PassengerCount +'\n';
        
        return( output );
    }
    
    @Override
    public String toString(){
        String output = "";
        
        //SHOWS THE CLASSNAME
        output += "ClassName: " + this.getClass().toString() + '\n';
                
        return(output);
    }
}
