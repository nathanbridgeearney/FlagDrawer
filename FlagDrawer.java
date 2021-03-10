// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a COMP102 assignment.
// You may not distribute it in any other way without permission.

/* Code for COMP-102-112 - 2021T1, Assignment 1
 * Name: Nathan Bridge-Earney
 * Username: bridgenath1
 * ID:300565456
 */

import ecs100.*;
import java.awt.Color;

/**
 * Draws various flags
 *
 * You can find lots of flag details (including the correct dimensions and colours)
 * from  http://www.crwflags.com/fotw/flags/    
 */

public class FlagDrawer{

    public static final double LEFT = 100;  // the left side of the flags
    public static final double TOP = 50;    // the top of the flags

    /**   CORE
     * Draw the flag of Belgium.
     * The flag has three vertical stripes;
     * The left is black, the middle is yellow, and the right is red.
     * The flag is 13/15 as high as it is wide (ratio 13:15).
     */
    public void drawBelgiumFlag(){
        UI.clearGraphics();
        UI.println("Belgium Flag");
        double width = UI.askDouble("How wide: ");
        /* YOUR CODE HERE */
        UI.setColor(Color.BLACK);
        UI.drawRect(LEFT,TOP,width/3,width / 100 *  (1300/15) );
        UI.fillRect(LEFT,TOP,width/3,width / 100 *  (1300/15) );
        UI.setColor(Color.YELLOW);
        UI.drawRect(LEFT + width / 3,TOP,width/3,width / 100 *  (1300/15) );
        UI.fillRect(LEFT + width / 3,TOP,width/3,width / 100 *  (1300/15) );
        UI.setColor(Color.RED);
        UI.drawRect(LEFT + width * 2/3,TOP,width/3,width / 100 *  (1300/15) );
        UI.fillRect(LEFT + width * 2/3,TOP,width/3,width / 100 *  (1300/15) );

    }

    /**   CORE
     *  The Red Cross flag consists of a white square with a red cross in the center
     *  The cross can be drawn as a horizontal rectangle and a vertical rectangle.
     */
    public void drawRedCrossFlag() {
        UI.println("Red Cross Flag: ");
        UI.clearGraphics();
        double size = UI.askDouble("How wide: ");
        /*# YOUR CODE HERE */
        UI.drawRect(LEFT,TOP, size, size);
        UI.setColor(Color.red);
        UI.fillRect(LEFT+size*0.4,TOP+size*0.2,size*0.2,size*0.6);
        UI.fillRect(LEFT+size*0.2,TOP+size*0.4,size*0.6,size*0.2);
    }

    /**   COMPLETION
     *  Pacman
     *  A red pacman facing up on a black background chasing yellow, green, and blue dots.
     *  
     */
    public  void drawPacman() {
        UI.clearGraphics();        
        UI.println("Pacman Flag");
        double width = UI.askDouble("How wide: ");
        /*# YOUR CODE HERE */
        UI.setColor(Color.BLACK);
        UI.fillRect(LEFT,TOP,width, width*2);
        UI.setColor(Color.red);
        UI.fillArc(width * 0.4, width * 0.9 ,width * 0.25, width * 0.25, 120,300);
        UI.setColor(Color.YELLOW);
        UI.fillOval(width * 0.47, width * 0.6,width* 0.1, width * 0.1 );
        UI.setColor(Color.GREEN);
        UI.fillOval(width * 0.47, width * 0.4,width* 0.1, width * 0.1 );
        UI.setColor(Color.BLUE);
        UI.fillOval(width * 0.47, width * 0.2,width* 0.1, width * 0.1 );

    }

    /**   COMPLETION
     * Draw the flag of Greenland.
     * The top half of the flag is white, and the bottom half is red.
     * There is a circle in the middle (off-set to left)  which is
     * also half white/red but on the opposite sides.
     * The flag is 2/3 as high as it is wide (ratio 2:3).
     */
    public void drawGreenlandFlag() {
        UI.clearGraphics();
        UI.println("Greenland Flag");
        double width = UI.askDouble("How wide: ");
        /*# YOUR CODE HERE */

        UI.drawRect(0,0,width,width * 2/3);
        UI.setColor(Color.red);
        UI.fillOval(width * 0.17, width * 0.1 ,width * 4/9, width * 4/9);
        UI.fillRect(0,width * 1/3,width, width * 1/3 );
        UI.setColor(Color.WHITE);
        UI.fillArc(width * 0.17, width * 0.1 ,width * 4/9, width * 4/9, 180,180);

        UI.setColor(Color.black);
        UI.drawRect(0,0,width,width * 2/3);

    }

    /**   CHALLENGE
     * Draw the Koru Flag.
     * It was one of the new flag designs for the 2016 referendum,
     * designed by Sven Baker from Wellington
     * The flag is 1/2 as high as it is wide (ratio 1:2).
     */
    public void drawKoruFlag() {
        UI.clearGraphics();
        UI.println("Koru Flag");
        double width = UI.askDouble("How wide: ");
        /*# YOUR CODE HERE */
        UI.setColor(Color.BLUE.darker());
        UI.fillRect(0,0,width, width*0.5);

        UI.setColor(Color.RED);
        UI.fillRect(0,0,width * 0.37 , width*0.5);


        UI.setColor(Color.WHITE);
        UI.fillOval(width * 0.2, width * -0.04 ,width * 0.57, width *0.57);

        UI.setColor(Color.BLUE.darker());
        UI.fillOval(width * 0.28, width * 0.04 ,width * 0.41, width * 0.41);
        UI.fillArc(width * 0.59,width * 0.155, width * 0.19, width * 0.19, 180, 180 );

        UI.setColor(Color.WHITE);
        UI.fillOval(width * 0.6, width * 0.15 ,width * 0.17, width *0.17);

        UI.setColor(Color.BLACK);
        UI.drawRect(0,0,width,width*0.5);
    }

    /**   CHALLENGE
     * Draw the flag of Samoa,
     * The flag is 1/2 as high as it is wide (ratio 1:2).
     * A red field with the blue rectangle on the top left quadrant bearing the Southern Cross
     *    of four white larger five-pointed stars and the smaller star in the center.
     * A full marks solution will have a method for drawing a 5 pointed star,
     * and call that method for each of the stars
     */
     public void drawSamoaFlag() {
        UI.clearGraphics();        
        UI.println("Samoa Flag");
         double width = UI.askDouble("How wide: ");
        UI.setColor(Color.RED);
        UI.fillRect(0,0,width,width * 0.5);
        UI.setColor(Color.BLUE.darker());
        UI.fillRect(0,0,width * 0.5,width * 0.25);
        double Height = width /2;
        double StarSize = width/100;
        double[] northStar = {(width/4)-6,Height/20};
        drawStars(northStar,1*StarSize);
        double[] eastStar = {(3.2*width/10)-6,Height/6};
        drawStars(eastStar,1*StarSize);
        double[] smallStar = {(1.2*width/4)-6,Height/4};
        drawStars(smallStar,0.7*StarSize);
        double[] southStar = {(width/4)-6,Height/2.6};
        drawStars(southStar,1.05*StarSize);
        double[] westStar = {(width/5.5)-6,Height/4.8};
        drawStars(westStar,1*StarSize);

    }
    public void drawStars(double[] StarOffsets, double width){

        double[] xCords = new double[]{1.309,1.618,2.618,1.809,2.118,1.309,.50,.809,0,1,1.309};
        double[] yCords = new double[]{0,.9511,.9511,1.5388,2.4899,1.9021,2.4899,1.5388,.9511,.9511,0};
        double[] XCords = new double[11];
        double[] YCords = new double[11];
        for(int i = 0; i < xCords.length; i++){
            XCords[i] = (xCords[i] * width) + StarOffsets[0];
        }
        for(int i= 0; i < YCords.length; i++){
            YCords[i] = (yCords[i] * width) + StarOffsets[1];
        }
        UI.setColor(Color.WHITE);
        UI.fillPolygon(XCords, YCords ,11);

    }




    public void setupGUI(){
        UI.addButton("Clear", UI::clearPanes);
        UI.addButton("Core: Flag of Belgium", this::drawBelgiumFlag);
        UI.addButton("Core: Red Cross Flag",  this::drawRedCrossFlag);
        // COMPLETION
        UI.addButton("Completion: Pacman Flag", this::drawPacman);
        UI.addButton("Completion: Flag of Greenland", this::drawGreenlandFlag);
        // CHALLENGE
        UI.addButton("Challenge: Koru flag", this::drawKoruFlag);
        UI.addButton("Challenge: Flag of Samoa", this::drawSamoaFlag);
        UI.addButton("Quit", UI::quit);

        UI.setDivider(0.3);
    }

    public static void main(String[] arguments){
        FlagDrawer fd = new FlagDrawer();
        fd.setupGUI();
    }

}
