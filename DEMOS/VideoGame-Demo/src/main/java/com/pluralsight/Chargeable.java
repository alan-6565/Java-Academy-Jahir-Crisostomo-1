package com.pluralsight;

// Interface for devices with batteries
public interface Chargeable {
    void charge();
    int getBatteryLevel();
    boolean isCharging();
}
