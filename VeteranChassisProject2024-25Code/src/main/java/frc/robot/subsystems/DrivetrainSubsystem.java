// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix6.controls.Follower;

public class DrivetrainSubsystem extends SubsystemBase {
  private WPI_TalonSRX FrontRightM; 
  private WPI_TalonSRX FrontLeftM; 
  private WPI_TalonSRX BackRightM; 
  private WPI_TalonSRX BackLeftM; 

  DifferentialDrive DiffDrive = new DifferentialDrive(FrontLeftM, FrontRightM);


  /** Creates a new DrivetrainSubsystem. */
  public DrivetrainSubsystem() {
    FrontRightM = new WPI_TalonSRX(Constants.DriveTrainConstants.kFrontRight);
    FrontLeftM = new WPI_TalonSRX(Constants.DriveTrainConstants.kFrontLeft);
    BackRightM = new WPI_TalonSRX(Constants.DriveTrainConstants.kBackRight);
    BackLeftM = new WPI_TalonSRX(Constants.DriveTrainConstants.kBackLeft);
   
    BackLeftM.follow(FrontLeftM);
    BackRightM.follow(FrontRightM);
  }
  
    


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
