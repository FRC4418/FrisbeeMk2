package org.usfirst.frc.team4418.robot.commands;

import org.usfirst.frc.team4418.robot.OI;
import org.usfirst.frc.team4418.robot.Robot;
import org.usfirst.frc.team4418.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TankControlCommand extends Command {

    public TankControlCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	Robot.driveTrain.TeleOpTankDrive(OI.getStick().getRawAxis(1), OI.getStick().getRawAxis(5));
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	// Stop the robot when teleop tank drive exits
    	Robot.driveTrain.TeleOpTankDrive(0, 0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	// If interrupted, call the end routine
    	end();
    }
}
