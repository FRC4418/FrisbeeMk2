/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4418.robot;

import org.usfirst.frc.team4418.robot.commands.ShooterCommand;
import edu.wpi.first.wpilibj.command.*;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	/* 
	 * Control stick and button initialization
	 */
	public static Joystick stick = new Joystick(0);
	
	public static JoystickButton button1 = new JoystickButton(stick,1);
	
	// Get statements
	public static Joystick getStick() {
		return stick;
	}
	
	
	
	/* 
	 * Set what the buttons do
	 */
	public OI() {
		button1.toggleWhenPressed(new ShooterCommand());
	}
}
