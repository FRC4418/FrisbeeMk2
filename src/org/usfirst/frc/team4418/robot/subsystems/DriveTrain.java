package org.usfirst.frc.team4418.robot.subsystems;

import org.usfirst.frc.team4418.robot.RobotMap;
import org.usfirst.frc.team4418.robot.commands.DriveTrainCommand2;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {

public static Talon leftFront = new Talon(RobotMap.leftBackTalon);
public static Talon leftBack = new Talon(RobotMap.leftFrontTalon);
public static Talon rightFront = new Talon(RobotMap.rightFrontTalon);
public static Talon rightBack = new Talon(RobotMap.rightFrontTalon);
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    	setDefaultCommand(new DriveTrainCommand2());
           // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public static void TellyOpTankDrive(double leftVal, double rightVal) {
    	leftFront.set(leftVal);
    	leftBack.set(leftVal);
    	rightFront.set(rightVal);
    	rightBack.set(rightVal);
    }
}

