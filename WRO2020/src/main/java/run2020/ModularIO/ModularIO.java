package run2020.ModularIO;


import ev3dev.actuators.lego.motors.EV3LargeRegulatedMotor;
import ev3dev.actuators.lego.motors.EV3MediumRegulatedMotor;
import ev3dev.sensors.ev3.EV3ColorSensor;
import ev3dev.sensors.ev3.EV3UltrasonicSensor;
import ev3dev.actuators.LCDStretch;
import ev3dev.sensors.Button;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.robotics.SampleProvider;
import java.lang.Math;


public class ModularIO {
	
	//define motors & sensors
	final EV3LargeRegulatedMotor driveB = new EV3LargeRegulatedMotor(MotorPort.B);
    final EV3LargeRegulatedMotor driveC = new EV3LargeRegulatedMotor(MotorPort.C);
    final EV3MediumRegulatedMotor motorA = new EV3MediumRegulatedMotor(MotorPort.A);
    final EV3MediumRegulatedMotor motorD = new EV3MediumRegulatedMotor(MotorPort.D);
    final EV3ColorSensor color2 = new EV3ColorSensor(SensorPort.S2);
    final EV3ColorSensor color3 = new EV3ColorSensor(SensorPort.S3);
    
    //define global variables
     double DegreesPerCM;
     double CMPerDegree;
     int reverse;
    
    public final void Config(double wheelDiameter, double wheelDistance, boolean reversed) {
   
    	driveB.brake();
    	driveC.brake();
    	
    	//set global variables
    	DegreesPerCM = (1 / (Math.PI * wheelDiameter)) * 360;
    	if (reversed) {
    		reverse = -1;
    	} else {
    		reverse = 1;
    	}
    	
    	//define color sensor read modes
    	SampleProvider ColorSensorRead2 = color2.getRedMode();
    	SampleProvider ColorSensorRead3 = color3.getRedMode();
    	
    }
}