package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Takeballarm;

public class armdown extends CommandBase{
    private final Takeballarm m_takeballarm;

    public armdown(Takeballarm takeballarm ){
        m_takeballarm = takeballarm;
        addRequirements(m_takeballarm);
    }

    @Override public void initialize(){
        m_takeballarm.armdown();
    }
    
    @Override public void end(boolean interrupted) {
        m_takeballarm.stoparm();
    }
}