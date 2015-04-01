package gg.mark;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by Mark on 4/1/2015.
 */
public class AutoAgito {
    private static Robot robot;

    private static final int MS_DELAY_BETWEEN_PRESS_AND_RELEASE = 200;
    private static final int MS_SLEEP_AFTER_KEY_EVENT_DONE = 400;

    private static void pressKey(int keyEvent) {
        System.out.println("Pressing key = " + keyEvent);

        robot.keyPress(keyEvent);
        robot.delay(MS_DELAY_BETWEEN_PRESS_AND_RELEASE);
        robot.keyRelease(keyEvent);

        robot.delay(MS_SLEEP_AFTER_KEY_EVENT_DONE);
    }

    private static void pressX() {
        pressKey(KeyEvent.VK_N);
    }

    private static void pressCircle() {
        pressKey(KeyEvent.VK_J);
    }

    private static void pressUp() {
        pressKey(KeyEvent.VK_W);
    }

    private static void pressDown() {
        pressKey(KeyEvent.VK_Z);
    }

    private static void pressLeft() {
        pressKey(KeyEvent.VK_A);
    }

    private static void pressRight() {
        pressKey(KeyEvent.VK_S);
    }

    private static void pressPSButton() {
        pressKey(KeyEvent.VK_X);
    }

    public static void run() {
        try {
            robot = new Robot();
            System.out.println("Waiting 7 seconds so start Gimx-launcher now!");
            robot.delay(7000);
            System.out.println("Done waiting. Starting to do work!");
        }
        catch(Exception e) {
            System.out.println(e);
        }

        for(int i = 0; i < 10; i++) {
            levelUp();
        }
    }

    private static boolean sHasScrolledToSettings = false;

    private static void levelUp() {
        // talk to the trainer and accept secret training
        pressX();

        robot.delay(2000);

        pressX();

        robot.delay(2000);

        pressUp();
        pressX();

        robot.delay(5000);

        // save your game
        pressX();
        pressUp();
        pressX();

        robot.delay(5000);

        // game is now saved
        pressX();

        robot.delay(5000);

        pressPSButton();

        robot.delay(2000);

        pressUp();

        if(!sHasScrolledToSettings) {
            for (int i = 0; i < 7; i++) {
                pressRight();
            }
            pressLeft();

            sHasScrolledToSettings = true;
        }

        pressX();

        robot.delay(2000);

        for(int i = 0; i < 14; i++) {
            pressDown();
        }

        pressX();
        pressX();
        pressX();

        // move to the year
        pressRight();
        pressRight();

        // move year up by one
        pressUp();

        pressX();

        pressPSButton();

        robot.delay(1000);

        pressX();
        pressX();

        robot.delay(3000);

        pressX();

        robot.delay(5000);

        for(int i = 0; i < 13; i++) {
            pressX();
        }
    }
}
