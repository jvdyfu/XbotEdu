package xbot.edubot.subsystems.arm;

import com.google.inject.Inject;

import xbot.common.controls.actuators.XCANTalon;
import xbot.common.controls.sensors.XDigitalInput;
import xbot.common.injection.wpi_factories.CommonLibFactory;

public class ArmSubsystem {
    
    public XCANTalon armMotor;
    public XDigitalInput upperLimitSwitch; 
    public XDigitalInput lowerLimitSwitch;
    
    @Inject
    public ArmSubsystem(CommonLibFactory factory) {
        armMotor = factory.createCANTalon(5);
        
        upperLimitSwitch = factory.createDigitalInput(0);
        lowerLimitSwitch = factory.createDigitalInput(1);
    }

}
