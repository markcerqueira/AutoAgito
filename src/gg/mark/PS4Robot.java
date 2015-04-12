package gg.mark;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by Mark on 4/1/2015.
 *
 * Use the PS4-Simple-NoJoyStick.xml config in gimx-launcher
 *
 */
public class PS4Robot {
    private static final int MS_DELAY_BETWEEN_PRESS_AND_RELEASE = 200;
    private static final int MS_SLEEP_AFTER_KEY_EVENT_DONE = 400;

    private Robot mRobot;

    public PS4Robot() {
        try {
            mRobot = new Robot();
        }
        catch(Exception e) {
            System.out.println(e);
            mRobot = null;
        }
    }

    public boolean isRobotOkay() {
        return mRobot != null;
    }

    public void pressX() {
        System.out.println("Pressing X");
        pressKey(KeyEvent.VK_N);
    }

    public void pressCircle() {
        System.out.println("Pressing O");
        pressKey(KeyEvent.VK_J);
    }

    public void pressUp() {
        System.out.println("Pressing UP");
        pressKey(KeyEvent.VK_W);
    }

    public void pressDown() {
        System.out.println("Pressing DOWN");
        pressKey(KeyEvent.VK_Z);
    }

    public void pressLeft() {
        System.out.println("Pressing LEFT");
        pressKey(KeyEvent.VK_A);
    }

    public void pressRight() {
        System.out.println("Pressing RIGHT");
        pressKey(KeyEvent.VK_S);
    }

    public void pressPSButton() {
        System.out.println("Pressing PS");
        pressKey(KeyEvent.VK_X);
    }

    private void pressKey(int keyEvent) {
        mRobot.keyPress(keyEvent);
        mRobot.delay(MS_DELAY_BETWEEN_PRESS_AND_RELEASE);
        mRobot.keyRelease(keyEvent);

        mRobot.delay(MS_SLEEP_AFTER_KEY_EVENT_DONE);
    }

    public void delay(int timeMS) {
        mRobot.delay(timeMS);
    }
}
