package org.usfirst.frc.team1306.robot;

import edu.wpi.first.wpilibj.Joystick;

public class XboxController extends Joystick {
	
	
	//From what I can gather:
	//RawAxis(1) and RawAxis(2) = X and -Y axis of Left stick
	//RawAxis(4) and RawAxis(5) = X and -Y axis of Right stick
	//RawAxis(3) = Right and Left triggers 
	//RawAxis(6) = D-pad
	
	//All RawAxis values are from -1.0 to 1.0
	
	public XboxController(int port) {
		super(port); //Create a joystick with the port number intended for the Xbox
	}
	public double getX(Hand hand) {
		if (hand.equals(Hand.kLeft)) { //Left hand x axis= RawAxis(1)
			return getRawAxis(1);
		}
		else {
			return getRawAxis(4);
			
		}
	}
	public double getY(Hand hand) {
		if (hand.equals(Hand.kLeft)) {
			return -getRawAxis(2); //-(-Y) = +Y
		}
		else {
			return -getRawAxis(5);
		}
	}
	
	public double getRTrigger() {
		return Math.max(getRawAxis(3), 0); //Guarantees LTrigger will never be negative
	}
	public double getLTrigger() {
		return -Math.min(getRawAxis(3), 0); //Guarantees RTrigger will never be negative 

		
	}
	
	public final static int LS = 5;
	public final static int RS = 6;
		
	}
	

