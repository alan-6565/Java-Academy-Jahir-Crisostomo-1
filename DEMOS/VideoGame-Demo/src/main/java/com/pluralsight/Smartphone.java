package com.pluralsight;

import java.util.ArrayList;

public class Smartphone implements Chargeable, Connectable, Powerable {
    private String model;
    private int batteryLevel;
    private boolean charging;
    private boolean poweredOn;
    private boolean connected;
    private String currentNetwork;

    public Smartphone(String model) {
        this.model = model;
        this.batteryLevel = 50;
        this.charging = false;
        this.poweredOn = false;
        this.connected = false;
        this.currentNetwork = "";
    }

    // Chargeable interface implementation
    @Override
    public void charge() {
        charging = true;
        System.out.println("📱 " + model + " is charging...");
        batteryLevel = Math.min(100, batteryLevel + 10);
    }

    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }

    @Override
    public boolean isCharging() {
        return charging;
    }

    // Connectable interface implementation
    @Override
    public void connect(String network) {
        if (poweredOn) {
            connected = true;
            currentNetwork = network;
            System.out.println("📡 Connected to " + network);
        } else {
            System.out.println("❌ Cannot connect - device is off");
        }
    }

    @Override
    public void disconnect() {
        connected = false;
        System.out.println("📴 Disconnected from " + currentNetwork);
        currentNetwork = "";
    }

    @Override
    public boolean isConnected() {
        return connected;
    }

    @Override
    public String getConnectionStatus() {
        if (connected) {
            return "Connected to " + currentNetwork;
        }
        return "Not connected";
    }

    // Powerable interface implementation
    @Override
    public void powerOn() {
        if (batteryLevel > 0) {
            poweredOn = true;
            System.out.println("✅ " + model + " powered on");
        } else {
            System.out.println("🔋 Battery dead - cannot power on");
        }
    }

    @Override
    public void powerOff() {
        poweredOn = false;
        if (connected) {
            disconnect();
        }
        System.out.println("⏻ " + model + " powered off");
    }

    @Override
    public boolean isPoweredOn() {
        return poweredOn;
    }

    // Smartphone-specific methods
    public void makeCall(String number) {
        if (poweredOn && batteryLevel > 5) {
            System.out.println("📞 Calling " + number + "...");
            batteryLevel -= 5;
        } else {
            System.out.println("❌ Cannot make call");
        }
    }

    public void showStatus() {
        System.out.println("\n--- " + model + " Status ---");
        System.out.println("Power: " + (poweredOn ? "ON" : "OFF"));
        System.out.println("Battery: " + batteryLevel + "% " + (charging ? "(Charging)" : ""));
        System.out.println("Network: " + getConnectionStatus());
    }
}

