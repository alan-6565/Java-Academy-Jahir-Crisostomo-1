package com.pluralsight;

class House extends Asset{
    private String address;
    private int condition;//(1 -excellent, 2 -good, 3 -fair, 4 -poor)
    private int squareFoot;
    private int lotSize;

    public House(String description, String dataAcquired, double originalCost,String address, int condition, int squareFoot, int lotSize) {
        super(description, dataAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue() {
        double valuePerSf;

        switch (condition){
            case 1:
                valuePerSf = 180.00;
                break;
            case 2:
                valuePerSf = 130.00;
                break;
            case 3:
                valuePerSf = 90.00;
                break;
            case 4:
                valuePerSf = 80.00;
                break;
            default:
                valuePerSf = 0;
                break;

        }
        double baseValue = squareFoot * valuePerSf;
        double lotBonus = lotSize * 0.25;
        return baseValue + lotBonus;
    }
}
