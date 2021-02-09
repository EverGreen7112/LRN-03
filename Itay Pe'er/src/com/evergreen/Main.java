package com.evergreen;

import java.util.Arrays;

public class Main {

    static double[] motorSpeeds = new double[6];
    // 0 - Elevator A; 1 - Elevator B; 2 - Chassis Front Left; 3 - Chassis Front Right;
    // 4 - Chassis Back Left; 5 - Chassis Back Right; 6 - Gripper left; 7 - Gripper Right;

    public static void main(String[] args) {
        initSetup();
        // Your function here
        int mili = 1 , canti = 100 , meter = 1000 , kilo = 1000000;
        int Msec = 1 , Ksec = 1000;
        Transform(100000 , Msec , Ksec);
    }

    /**
     *
     * @param num
     * @param start
     * @param end
     */
    static void Transform(int num , int start , int end)
    {

        int total = start * num;
        int norT = 0;
        double transformed = (double)total/end;
        if(transformed >= 1) {
            norT = (int) transformed;
            System.out.println(norT);
            num = norT;
        }
        else {
            num = (int)transformed;
            System.out.println(transformed);
        }
    }


    // Bang Bang Control
    // Set Left, Set Right, Set Speed
    // Elevator Up
    // Elevator Down
    // Elevator Wait
    // Move Elevator to Target (BOTTOM / OUTER)
    // Switch
    // Throw to target
    // Get Elevator Distance
    // Drive Mode Main
    // Auto Mode Main
    // Constant Tuner Main
    // Test






    // "Built-In" Functions
        static double getEncoderTicks() { return -1; }
        static double[] getOdometry() { return new double[] {0, 0, 0}; }
        static double getLeftJoystick() { return -1; }
        static double getRightJoystick() { return -1; }
        static double getButtonJoystick() { return -1; }

        static void setSpeed(int port, double value) {
            motorSpeeds[port] = value;
        }


        static void initSetup() {
            Arrays.fill(motorSpeeds, 0);
        }






}
