package com.pluralsight;

// Interface for devices that connect to networks
public interface Connectable {
    void connect(String network);
    void disconnect();
    boolean isConnected();
    String getConnectionStatus();
}
