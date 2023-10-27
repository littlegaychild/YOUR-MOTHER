package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.TankDriveConstants;
import frc.robot.components.TalonComponent;
import frc.robot.components.TalonComponent.TalonMotor;

public class TankDriveSubsystem extends SubsystemBase{
    // Declare left and right side motors here,
    // but don't set them to a value here
    private TalonComponent leftMotor;
    private TalonComponent rightMotor;

    public TankDriveSubsystem() {
        // In the constructor, now set the motors to a value
        leftMotor = new TalonComponent(TankDriveConstants.DRIVE_LEFT_MOTOR_ID, TalonMotor.TalonSRX);
        rightMotor = new TalonComponent(TankDriveConstants.DRIVE_RIGHT_MOTOR_ID, TalonMotor.TalonSRX);
    }

    // Now create two methods, one for each motor
    // These methods should set the percent
    // Output of the left and right motors respectively
    /**
     * @author Gretcyn Miller
     * @param percent the percenbt output of the ledt motors fom -1 to 1
     */
    public void setLeftMotor(double percent) {
        leftMotor.setOutput(percent);
    }
    /**
     * @author Gretcyn Miller
     * @param percent the percenbt output of the rith tmorots fom -1 to 1
     */
    public void setRightMotor(double percent) {
        rightMotor.setOutput(percent);
    }

//EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE
//EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE
}
