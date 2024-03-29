// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import java.util.HashMap;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean constants. This class should not be used for any other
 * purpose. All constants should be declared globally (i.e. public static). Do
 * not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the constants are needed, to reduce verbosity.
 */
public final class Constants {
    
    private static HashMap<String, Integer> mapPWM; // the PWM port map
    private static HashMap<String, Integer> mapPCM; // the PCM port map
    private static HashMap<String, Integer> mapCAN; // the CAN port map
    private static HashMap<String, Integer> mapDIO; // the DIO port map
    private static HashMap<String, Integer> mapCTRL; // the controller port map

    public static double[] baseSpeedList = {.4, .6, .8, 1.};
    public static double slapSpeed = -.8;
    public static double intakeSpeed = -.85;
    public static double armUpSpeed = .7;
    public static double armDownSpeed = -.8;
    public static double l_shootSpeed = .8;
    public static double r_shootSpeed = -.7;
    public static double susanSpeed = .4;


    public static double baseWheelXOffset = 0.295; // Meter
    public static double baseWheelYOffset = 0.26; // Meter
    public static boolean base_lf_reverse = true;
    public static boolean base_lb_reverse = true;
    public static boolean base_rf_reverse = true;
    public static boolean base_rb_reverse = true;


    public Constants() {
        mapPWM = new HashMap<>();
        mapPCM = new HashMap<>();
        mapCAN = new HashMap<>();
        mapDIO = new HashMap<>();
        mapCTRL = new HashMap<>();

        setCTRL("Xbox Controller", 0);
        setCTRL("Xbox Controller2", 1);

        setPCM("valve 1 forward", 2);
        setPCM("valve 1 reverse", 3);
        setPCM("valve 2 forward", 0);
        setPCM("valve 2 reverse", 1);

        setCAN("PCM", 49);
        setCAN("drive lf", 1);
        setCAN("drive lb", 3);
        setCAN("drive rf", 0);
        setCAN("drive rb", 2);
        setCAN("ballsSlapper",4);
        setCAN("lazySusan", 7);
        setCAN("lshoot", 0);
        setCAN("rshoot", 1);
        setCAN("arm", 6);
        setCAN("intake", 5);
    }

<<<<<<< HEAD
    public static boolean base_lf_reverse = true;
    public static boolean base_lb_reverse = true;
    public static boolean base_rf_reverse = true;
    public static boolean base_rb_reverse = true;

    public static final int kSlotIdx = 0;
    public static final int kPIDLoopIdx = 0;
    public static final int kTimeoutMs = 30;
    // public final static Gains kGains_Velocit = new Gains( 0.5, 0.01, 20, 1023.0/7200.0,  300,  1.00);


=======
>>>>>>> cd492c4436918a75fce720b08e6ff5103e6e88c3
    /**
     * Method to set a PWM port
     * 
     * @param String name of what port is for (what you call it throughout the
     *               program)
     * @param int    the port number
     */
    public static void setPWM(String name, int port) {
        mapPWM.put(name, port);
    }

    /**
     * Method to set a PCM port
     * 
     * @param String name of what port is for (what you call it throughout the
     *               program)
     * @param int    the port number
     */
    public static void setPCM(String name, int port) {
        mapPCM.put(name, port);
    }

    /**
     * Method to set a CAN port
     * 
     * @param String name of what port is for (what you call it throughout the
     *               program)
     * @param int    the port number
     */
    public static void setCAN(String name, int port) {
        mapCAN.put(name, port);
    }

    /**
     * Method to set a DIO port
     * 
     * @param String name of what port is for (what you call it throughout the
     *               program)
     * @param int    the port number
     */
    public static void setDIO(String name, int port) {
        mapDIO.put(name, port);
    }

    /**
     * Method to set a CTRL port
     * 
     * @param String name of what port is for (what you call it throughout the
     *               program)
     * @param int    the port number
     */
    public static void setCTRL(String name, int port) {
        mapCTRL.put(name, port);
    }

    /**
     * Method to get a PWM port
     * 
     * @param String name of what port is for (what you call it throughout the
     *               program)
     */
    public static int getPWM(String name) {
        return mapPWM.get(name);
    }

    /**
     * Method to get a PCM port
     * 
     * @param String name of what port is for (what you call it throughout the
     *               program)
     */
    public static int getPCM(String name) {
        return mapPCM.get(name);
    }

    /**
     * Method to get a CAN port
     * 
     * @param String name of what port is for (what you call it throughout the
     *               program)
     */
    public static int getCAN(String name) {
        return mapCAN.get(name);
    }

    /**
     * Method to get a DIO port
     * 
     * @param String name of what port is for (what you call it throughout the
     *               program)
     */
    public static int getDIO(String name) {
        return mapDIO.get(name);
    }

    /**
     * Method to get a controller port
     * 
     * @param String name of what port is for (what you call it throughout the
     *               program)
     */
    public static int getCTRL(String name) {
        return mapCTRL.get(name);
    }
}
