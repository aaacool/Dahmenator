package org.usfirst.frc.team1306.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	private final XboxController xbox;
	

	public double getMagnitude() {
		double magn = xbox.getRTrigger();
		if (magn == 0) { //If the Right Trigger isn't being pressed
			magn=xbox.getLTrigger();
			magn=-magn; //Left trigger=reverse=opposite direction
		}
		return magn;
				
	}
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

	public double getAngle() {
		double x_value = xbox.getX(GenericHID.Hand.kLeft);
		double y_value = xbox.getY(GenericHID.Hand.kLeft);
		
		double angle = Math.atan(y_value/x_value); //Given the x, y ->  angle is tan^-1(y/x)
		return angle;
		
		
	}
	
	public OI() {
		super();
		xbox= new XboxController(RobotMap.XBOX_CONTROLLLER);
	}
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
}

