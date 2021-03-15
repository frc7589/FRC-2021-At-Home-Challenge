package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.StoreBall;


public class Spin extends CommandBase{
    private final StoreBall m_storeBall;

    public Spin(StoreBall storeBall){
        m_storeBall = storeBall;
        addRequirements(m_storeBall);
    }

    @Override public void initialize(){
        m_storeBall.Spin();
    }
    @Override public void end(boolean interrupted) {
        m_storeBall.StopSpin();
    }
}
