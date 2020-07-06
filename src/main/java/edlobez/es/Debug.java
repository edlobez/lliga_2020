/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edlobez.es;

/**
 *
 * @author edlobez-vbox
 */
public class Debug {
    
    private static boolean ON=true;
    private static boolean OFF=false;
    
    private static boolean debugMode=ON;
    
    public static void printDebug(String txt) {
        if (debugMode)
            System.out.println(txt);
    }
    
    public static void debugModeOn () {
        debugMode = true;
    }
    public static void debugModeOff() {
        debugMode = false;
    }

    public static boolean isDebugMode() {
        return debugMode;
    }
    
   
    
}
