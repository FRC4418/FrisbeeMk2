package org.usfirst.frc.team4418.robot.subsystems;

import org.usfirst.frc.team4418.robot.RobotMap;
import org.usfirst.frc.team4418.robot.commands.TankControlCommand;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
	/* 
	 * Initialize components
	 */
	public static Talon leftFront = new Talon(RobotMap.leftBackTalon);
	public static Talon leftBack = new Talon(RobotMap.leftFrontTalon);
	public static Talon rightFront = new Talon(RobotMap.rightFrontTalon);
	public static Talon rightBack = new Talon(RobotMap.rightBackTalon);
    
	
	
	/* 
	 * Set the default command
	 */
    public void initDefaultCommand() {
    	setDefaultCommand(new TankControlCommand());
    }
    
    
    
    /* 
     * Control functions
     */
    public static void tankDrive(double leftVal, double rightVal) { // Directly run tank drive
    	// Set the motors to run at the input values
    	leftFront.set(-leftVal);
    	leftBack.set(-leftVal);
    	rightFront.set(rightVal);
    	rightBack.set(rightVal);
    }
    
    public static void TeleOpTankDrive(double leftVal, double rightVal) { // Mess with inputs to improve human readability before passing inputs to tankDrive()
    	// Apply an input map to the values
    	
    	// Apply a deadzone
    	
    	// Pass values to tankDrive()
    	tankDrive(leftVal, rightVal);
    }
}

