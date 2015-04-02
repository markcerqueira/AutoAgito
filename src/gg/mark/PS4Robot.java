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
        }
    }

    public void pressX() {
        pressKey(KeyEvent.VK_N);
    }

    public void pressCircle() {
        pressKey(KeyEvent.VK_J);
    }

    public void pressUp() {
        pressKey(KeyEvent.VK_W);
    }

    public void pressDown() {
        pressKey(KeyEvent.VK_Z);
    }

    public void pressLeft() {
        pressKey(KeyEvent.VK_A);
    }

    public void pressRight() {
        pressKey(KeyEvent.VK_S);
    }

    public void pressPSButton() {
        pressKey(KeyEvent.VK_X);
    }

    private void pressKey(int keyEvent) {
        System.out.println("Pressing key = " + keyEvent);

        mRobot.keyPress(keyEvent);
        mRobot.delay(MS_DELAY_BETWEEN_PRESS_AND_RELEASE);
        mRobot.keyRelease(keyEvent);

        mRobot.delay(MS_SLEEP_AFTER_KEY_EVENT_DONE);
    }

    public void delay(int timeMS) {
        mRobot.delay(timeMS);
    }
}
