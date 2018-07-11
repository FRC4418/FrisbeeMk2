package org.usfirst.frc.team4418.robot.subsystems;

import org.usfirst.frc.team4418.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ShooterSubsystem extends Subsystem {

	/*
	 * Initialize components
	 */
	public static Talon leftShooter = new Talon(RobotMap.leftShooter);
	public static Talon rightShooter = new Talon(RobotMap.rightShooter);

	
	
	/*
	 * Set default command
	 */
    public void initDefaultCommand() {
    
    }
    
    
    
    /* 
     * Control functions
     */
    public static void ShooterThing(double leftVal, double rightVal) {
    	leftShooter.set(leftVal);
    	rightShooter.set(rightVal);
    }
}

