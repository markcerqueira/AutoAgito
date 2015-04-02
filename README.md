# Auto Agito
Automates Secret Training "exploit" in Final Fantasy Type-0

Here's a [video](https://www.youtube.com/watch?v=4Yy3DOvEc1U) of Auto Agito in action on Youtube!

# Hardware
* Windwows computer (I used a Macbook Pro running Windows 7 in VMWare Fusion)
* [Titan One](http://www.extreme-mods.com/Titan-One-for-Playstation-4-PS4-Xbox-One-Xbox-360-Playstation-3-PS3_p_5513.html)
* DualShock 4 and micro USB cable (needed to keep our Titan One authenticated with the PS4)
* Mini USB cable to hook up computer to Titan One
* Final Fantasy Type-0 (duh) and PS4 (double duh)

# Software
* gimx-launcher 3.5 x86_64
* IntelliJ Community Edition (or if you prefer inferior IDEs, just pick one that can run Java programs)

# Instructions
* Go to your PS4 Settings -> Date and Time -> Date and Time Settings -> Set Using Internet -> Uncheck Set Automatically
* Update firmware on your Titan One to 2.17 by using the Gtuner app
* Plug the Titan One into a USB port on the PS4
* Plug the DualShock 4 into the Titan One (INPUT port) using the micro USB cable
* Connect your computer to the Titan One (PCPROG port)
* Copy the PS4-Simple-NoJoystick.xml file into C:\Users\USER_NAME\AppData\Roaming\gimx\config
* Launch gimx-launcher and set Output to GPP/Cronus, Input to Windows events, Config to PS4-Simple-NoJoystick.xml
* You can leave grab checkbox under Mouse unchecked and you can check terminal under Output to see button presses
* Hit Start and test that you can move around (w, a, s, z) and click x and circle (n and j)
* Press Shift+ESC to quit key capture
* Launch FF Type-0 and stand in front of the Secret Training Guy (STG) in the Arena
* Press Run button in your IDE
* Once the program is running you'll see a message saying you have 10 seconds to launch gimx-launcher; go ahead and do that
* Behold. The program's keystrokes should make your character talk to STG, save your game, advance time by one year, return, and reap all that sweet EXP. 

## Links
* [Description of Secret Training exploit] (http://www.justpushstart.com/2015/03/final-fantasy-type-0-hd-hit-level-99-30-minutes/)
* [Authenticating with DualShock4 controller for Titan One] (https://www.consoletuner.com/kbase/connecting_on_playstation_4_print.htm)
* [Buy Final Fantasy Type-0 on Amazon](http://www.amazon.com/Final-Fantasy-Type-0-HD-PlayStation-4/dp/B00KWJ4JW4)
