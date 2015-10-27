package org.usfirst.frc.team1306.robot.subsystems;

import org.usfirst.frc.team1306.robot.RobotMap;
import org.usfirst.frc.team1306.robot.commands.XboxDrive;

import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */

public class Driverobot extends Subsystem {
    
	//Declare an instance of RobotDrive with the ports of the motors specified in RobotMap
	private final RobotDrive robodrive;

	
	public Driverobot() {
		
		super();
		robodrive= new RobotDrive(RobotMap.LEFT_MOTOR, RobotMap.RIGHT_MOTOR); 
		
	}
		
	//This is the main function. Given a magnitude and an angle, I drive the robot
	public void drive_robot(double speed, double angle) {
		
		
		robodrive.setMaxOutput(0.5); //Maximum output
		robodrive.arcadeDrive(speed, angle);
		
	}
	//Setting magnitude + angle to zero = stopping robot
	public void stop() {
		robodrive.arcadeDrive(0.0, 0.0);
		
	}

    public void initDefaultCommand() {    	
    	setDefaultCommand(new XboxDrive()); //This is the command that will be calling this subsystem
    	
    }
}

