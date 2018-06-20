package org.usfirst.frc.team4418.robot.subsystems;

import org.usfirst.frc.team4418.robot.RobotMap;
import org.usfirst.frc.team4418.robot.commands.DriveTrainCommand2;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {

public static Talon leftShooter = new Talon(RobotMap.leftShooter);
public static Talon rightShooter = new Talon(RobotMap.rightShooter);
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    	
           // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public static void ShooterThing(double leftVal, double rightVal) {
    	leftShooter.set(leftVal);
    	rightShooter.set(rightVal);
    }
}

