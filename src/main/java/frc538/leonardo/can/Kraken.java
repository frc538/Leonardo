package frc538.leonardo.can;

import com.ctre.phoenix6.hardware.TalonFX;

/**
 * Custom wrapping for a TalonFX Motor Controller (Falcon 500)
 */
public class Kraken {
    private final TalonFX mTalon;

    /**
     * Creates a Falcon with the given CAN ID.
     * 
     * @param canId the CAN ID of the Falcon's TalonFX
     */
    public Kraken(int canId) {
        mTalon = new TalonFX(canId);
    }

    /**
     * Sets the output of the motor.
     * 
     * @param scaledOutput motor's output between -1.0 and +1.0
     */
    public void set(double scaledOutput) {
        mTalon.set(scaledOutput);
    }
}
