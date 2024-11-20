// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix6.controls.Follower;

public class DrivetrainSubsystem extends SubsystemBase {
  private Spark FrontRightM; 
  private Spark FrontLeftM;
  private Spark BackRightM; 
  private Spark BackLeftM; 

  

  DifferentialDrive DiffDrive = new DifferentialDrive(FrontLeftM, FrontRightM);


  /** Creates a new DrivetrainSubsystem. */
  public DrivetrainSubsystem() {
    FrontRightM = new Spark(Constants.DriveTrainConstants.kFrontRight);
    FrontLeftM = new Spark(Constants.DriveTrainConstants.kFrontLeft);
    BackRightM = new Spark(Constants.DriveTrainConstants.kBackRight);
    BackLeftM = new Spark(Constants.DriveTrainConstants.kBackLeft);
   
    BackLeftM..
    BackRightM.follow(FrontRightM);
  }
  
    


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
