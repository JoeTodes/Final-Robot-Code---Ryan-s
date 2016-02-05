package org.usfirst.frc.team4627.robot.commands;

import org.usfirst.frc.team4627.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoLowBar extends Command {

    public AutoLowBar() {
        requires(Robot.driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    
        
        Robot.driveTrain.setLeftMotors(0.25);
        Robot.driveTrain.setRightMotors(-0.25);
        Timer.delay(4);
    
        System.out.println("AutoLowBar is executing");
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
