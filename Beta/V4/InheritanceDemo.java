package Beta.V4;

import Beta.V3.PassengerVehicleInfo;
import java.util.ArrayList;

/* 
 * File:  InheritanceDemo
 * Copy: Copyright (c) 2023 Samuel W. Messer
 * BlazerID: swmesser
 * Vers: 1.0.0 Oct 17, 2023 SWM - Original Coding
 * Desc: Driver for testing concepts
 */

public class InheritanceDemo {

    public static void main(String[] args) {
        // TODO code application logic here
        int index;
        
        index = 0;
        
        System.out.println( "count: " + args.length );
        
        for ( index = 0; index < args.length; index++ ) {
            System.out.println( "args[ " + index +  "] = " + args[ index ]);
        }
        
        if (( args.length == 1 ) && 
            ( args[ 0 ].compareToIgnoreCase("/V1") == 0)){
//            VehicleInfo VehicleA = new VehicleInfo("ID001", 1980, "Honda", "Civic");
//            
//            VehicleA.setPassengerCount( 4 );
//            
//            System.out.println( VehicleA.toString() );
//            
//            LandVehicleInfo VehicleB = new LandVehicleInfo("ID002");
//            
//            VehicleB.setMake("Mercedes");
//            VehicleB.setModel("300D");
//            VehicleB.setPassengerCount( 4 );
//            VehicleB.setTractiveType("Wheel");
//            VehicleB.setTractiveCount( 4 );
//            VehicleB.setYear( 2001 );
//            
//            System.out.println( VehicleB.toString() );
//            
//            System.out.println("VehicleC (cast of VehicleB)");
//            VehicleInfo VehicleC = (VehicleInfo) VehicleB;
//            System.out.println( VehicleC);
//            
//            System.out.println("VehicleD (cast of VehicleA)");
//            LandVehicleInfo VehicleD = (LandVehicleInfo) VehicleA;
//            System.out.println(VehicleD.toString( ));


        }else if (( args.length == 1 ) && 
            ( args[ 0 ].compareToIgnoreCase("/V3") == 0)){
            
            //Cannot be done b/c it is abstract
            //Beta.V3.VehicleInfo VehicleA = new Beta.V3.VehicleInfo("ID001"); 
            //Beta.V3.LandVehicleInfo VehicleB = new Beta.V3.LandVehicleInfo("ID001");
            
            Beta.V3.PassengerVehicleInfo VehicleC = new Beta.V3.PassengerVehicleInfo( "ID01" );
            
            //Using the new abstract classes
            PassengerVehicleInfo VehicleD = new PassengerVehicleInfo( "ID002");
            System.out.println( VehicleD.toString());
            
        } else {
            TestVehicleInfo_v1();
        }
    }
    
    public static void TestVehicleInfo_v1(){
        Beta.V4.VehicleInfo VehicleA;
        Beta.V4.LandVehicleInfo VehicleB;
        Beta.V4.PassengerVehicleInfo VehicleC;
        Beta.V4.PassengerVehicleInfo VehicleD;
        
        //VehicleA = new Beta.V4.VehicleInfo("ID001");  // abstract class --> can not create an instance
        //VehicleB = new Beta.V4.LandVehicleInfo("ID001");  //abstract class --> can not create an instance
        
        VehicleC = new Beta.V4.PassengerVehicleInfo("ID001");
        VehicleC.setYear( 1984 );
        VehicleC.setMake("Mercedes");
        VehicleC.setModel("300D");
        
        
        VehicleD = new Beta.V4.PassengerVehicleInfo("ID002", "Honda", "Civic", 0);
        
        VehicleA = (Beta.V4.VehicleInfo) VehicleD; //PassengerVehicle --> Vehicle
        VehicleB = (Beta.V4.LandVehicleInfo) VehicleC; //PassengerVehicle --> LandVehicle
        
        System.out.println("=============================");
        System.out.println( VehicleA.toCustom() );
        System.out.println( VehicleA.toString() );
        System.out.println("=============================");
        System.out.println("=============================");
        System.out.println( VehicleB.toCustom() );
        System.out.println( VehicleB.toString() );
        System.out.println("=============================");
        System.out.println("=============================");
        System.out.println( VehicleC.toCustom() );
        System.out.println( VehicleC.toString() );
        System.out.println("=============================");
        System.out.println("=============================");
        System.out.println( VehicleD.toCustom() );
        System.out.println( VehicleD.toString() );
        System.out.println("=============================");
    }

    public static void TestVehicleInfo_V2(){
        java.util.ArrayList<Beta.V4.VehicleInfo> Vehicles = new ArrayList<Beta.V4.VehicleInfo>();
        java.util.ArrayList<Beta.V4.LandVehicleInfo> LandVehicles = new ArrayList<Beta.V4.LandVehicleInfo>();
        java.util.ArrayList<Beta.V4.PassengerVehicleInfo> PassengerVehicles = new ArrayList<Beta.V4.PassengerVehicleInfo>();
        Beta.V4.PassengerVehicleInfo VehicleC;
        Beta.V4.PassengerVehicleInfo VehicleD;
        
         VehicleC = new Beta.V4.PassengerVehicleInfo("ID001");
        VehicleC.setYear( 1984 );
        VehicleC.setMake("Mercedes");
        VehicleC.setModel("300D");
        
        
        VehicleD = new Beta.V4.PassengerVehicleInfo("ID002", "Honda", "Civic", 0);
        
        Vehicles.add(VehicleC);
        LandVehicles.add(VehicleC);
        PassengerVehicles.add(VehicleC);
    }
}
