/*
 * Jonathan Graydon
 * Soccer Ball Program
 * This program will output the x,y,z position and velocity of a soccer ball
 */

 public class SoccerBall{
    public static void main(String[]args){
        xyzValues values = new xyzValues();

        values.positionX = (int)(Math.random() * 100 - 50);
        values.positionY = (int)(Math.random() * 100 - 50);
        values.positionZ = (int)(Math.random() * 100 - 50);

        values.velocityX = (int)(Math.random() * 100 - 50);
        values.velocityY = (int)(Math.random() * 100 - 50);
        values.velocityZ = (int)(Math.random() * 100 - 50);

        System.out.println("----------List of values----------");
        System.out.println("X position: " + values.positionX);
        System.out.println("Y position: " + values.positionY);
        System.out.println("Z position: " + values.positionZ);

        System.out.println("X velocity: " + values.velocityX);
        System.out.println("Y velocity: " + values.velocityY);
        System.out.println("Z velocity: " + values.velocityZ);
    }
 }

class xyzValues{
    double positionX = 0.0;
    double positionY = 0.0;
    double positionZ = 0.0;

    double velocityX = 0.0;
    double velocityY = 0.0;
    double velocityZ = 0.0;
 }