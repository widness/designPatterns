package ch.hevs.design_patterns.lab1_ex1.observer;

/**
 *
 * @author scz
 */
public interface Observer {
    void update(int position, Problem p, int bloodPressure, int electroCardioGram, int pulseOximetry);
}
