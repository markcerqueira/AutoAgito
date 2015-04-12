package gg.mark;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by Mark on 4/1/2015.
 */
public class AutoAgito {
    // seconds from when program is started to when commands are inputted by robot
    // you'll want to leave enough time to launch GIMX
    private static final int LAUNCH_WINDOW_FOR_GIMX = 10;

    // how many times we will do secret training
    private static final int LOOPS_TO_RUN = 30;

    private PS4Robot mPS4Robot;

    // we can optimize getting to the settings a bit afer the first time we go there
    private boolean mHasScrolledToSettings = false;

    public void run() {
        mPS4Robot = new PS4Robot();

        // make sure robot is okay before we continue
        if(!mPS4Robot.isRobotOkay()) {
            System.out.println("Something went wrong creating PS4Robot; aborting!");
            System.exit(-1);
        }

        // give 10 seconds to launch gimx-launcher
        System.out.println("Waiting " + LAUNCH_WINDOW_FOR_GIMX + " seconds so start gimx-launcher now!");
        mPS4Robot.delay(LAUNCH_WINDOW_FOR_GIMX * 1000 /* convert to milliseconds */);
        System.out.println("Done waiting... starting to do work!");

        for(int i = 0; i < LOOPS_TO_RUN; i++) {
            levelUp();
        }
    }

    private void levelUp() {
        // talk to the trainer and accept secret training
        mPS4Robot.pressX();

        mPS4Robot.delay(2000);

        mPS4Robot.pressX();

        mPS4Robot.delay(2000);

        mPS4Robot.pressUp();
        mPS4Robot.pressX();

        mPS4Robot.delay(5000);

        // save your game
        mPS4Robot.pressX();
        mPS4Robot.pressUp();
        mPS4Robot.pressX();

        mPS4Robot.delay(5000);

        // game is now saved
        mPS4Robot.pressX();

        mPS4Robot.delay(5000);

        mPS4Robot.pressPSButton();

        mPS4Robot.delay(2000);

        mPS4Robot.pressUp();

        // we only need to scroll all the way to the right once
        // afterwards after pushing up, we'll be at the settings icon already
        if(!mHasScrolledToSettings) {
            for (int i = 0; i < 7; i++) {
                mPS4Robot.pressRight();
            }
            mPS4Robot.pressLeft();

            mHasScrolledToSettings = true;
        }

        mPS4Robot.pressX();

        mPS4Robot.delay(2000);

        // move down to Date and Time settings
        for(int i = 0; i < 14; i++) {
            mPS4Robot.pressDown();
        }

        mPS4Robot.pressX();
        mPS4Robot.pressX();
        mPS4Robot.pressX();

        // move to the year
        mPS4Robot.pressRight();
        mPS4Robot.pressRight();

        // move year up by one
        mPS4Robot.pressUp();

        // confirm change
        mPS4Robot.pressX();

        // pressing PS Button takes us back to the main app (i.e. FF Type-0)
        mPS4Robot.pressPSButton();

        mPS4Robot.delay(1000);

        mPS4Robot.pressX();
        mPS4Robot.pressX();

        mPS4Robot.delay(3000);

        mPS4Robot.pressX();

        mPS4Robot.delay(5000);

        // confirm all the XP we just received!
        for(int i = 0; i < 13; i++) {
            mPS4Robot.pressX();
        }
    }
}
