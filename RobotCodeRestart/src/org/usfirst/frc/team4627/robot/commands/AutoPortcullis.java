package org.usfirst.frc.team4627.robot.commands;

import org.usfirst.frc.team4627.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoPortcullis extends Command {

    public AutoPortcullis() {
    	requires(Robot.driveTrain);
    	requires(Robot.elChupaArms);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
   
    /*	
    	
    	Robot.driveTrain.setLeftMotors(0.5);
    	Robot.driveTrain.setRightMotors(-0.5);
    	Timer.delay(1);
    	
    	Robot.elChupaArms.motorPosition = 
    	
    */
    
    	System.out.println("AutoPortacolis is executing");
    
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
 
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    	
    	if(Robot.autonomousPlacementStart != null) {
    		Robot.autonomousPlacementStart.start();
    	}
    	
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
