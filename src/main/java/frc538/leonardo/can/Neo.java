package frc538.leonardo.can;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

/**
 * Custom wrapping for a SPARK Max Motor Controller (Neo or Neo 550)
 */
public class Neo {
    private final SparkMax mNeo;

    /**
     * Creates a Neo/Neo 550 with the given CAN ID.
     * 
     * @param canId the CAN ID of the Neo's SPARK Max
     */
    public Neo(int canId) {
        mNeo = new SparkMax(canId, MotorType.kBrushless);
    }

    /**
     * Sets the output of the motor.
     * 
     * @param scaledOutput motor's output between -1.0 and +1.0
     */
    public void set(double scaledOutput) {
        mNeo.set(scaledOutput);
    }
}
