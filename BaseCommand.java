package org.usfirst.frc.team1306.robot.commands;

import org.usfirst.frc.team1306.robot.OI;
import org.usfirst.frc.team1306.robot.subsystems.Driverobot;

import edu.wpi.first.wpilibj.command.Command;

/**This is where we set up things for all the other commands
 *author: @Amit_Rajesh
 */
public abstract class BaseCommand extends Command {
	
	public final static Driverobot driverobot= new Driverobot();
	
	private static OI oi; 
	
	
	//This function just returns the OI defined here. This is useful because now
	//we can access the OI from anywhere by importing this class and calling this function
	public static OI getOI() { 
		return oi;
	}

    public BaseCommand() {
        super();
    }  
    // Called just before this Command runs the first time
    public static void init() {
    	oi= new OI(); //The reason I didn't declare it before because it may have been too early
		  //and some things might not have been set up yet...?
    }
 

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
