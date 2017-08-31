package org.usfirst.frc253.Pneumatics.commands;

import org.usfirst.frc253.Pneumatics.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
*
*/
public class ActSolenoid3Reverse extends Command {

   // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

   // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

   // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
   public ActSolenoid3Reverse() {

   // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
       // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
   	requires(Robot.pneumatics);
       // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
       // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES

       // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
   }

   // Called just before this Command runs the first time
   protected void initialize() {
   }

   // Called repeatedly when this Command is scheduled to run
   protected void execute() {
   	Robot.pneumatics.Solenoid3Reverse();
   }

   // Make this return true when this Command no longer needs to run execute()
   protected boolean isFinished() {
       return false;
   }

   // Called once after isFinished returns true
   protected void end() {
   	Robot.pneumatics.Solenoid3Off();
   }

   // Called when another command which requires one or more of the same
   // subsystems is scheduled to run
   protected void interrupted() {
   }
}