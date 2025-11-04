package com.pluralsight;

// Interface for devices that can be powered on/off
public interface Powerable {
    void powerOn();
    void powerOff();
    boolean isPoweredOn();
}
