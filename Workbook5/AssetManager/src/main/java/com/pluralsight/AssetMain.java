package com.pluralsight;

import java.util.ArrayList;

public class AssetMain {
    public static void main(String[] args) {
        ArrayList<Asset> asset = new ArrayList<Asset>();
        asset.add(new House("Family Home", "2020-05-14", 300000, "123 Oak Street", 2,2000,5000));
        asset.add(new House("Mansion Home", "2022-05-14", 300000, "332 palm Street", 3,3000,4500));
        asset.add(new Vehicle("family car", "data", 20000, "honda accord", 2020, 20000));

        for (int i = 0; i < asset.size(); i++) {
            String message = "";

            if (asset.get(i) instanceof House){
                House house = (House) asset.get(i);
                message = "House at " + house.getAddress();
            }
            else if (asset.get(i) instanceof Vehicle){
                System.out.println("Vehicle: " + ((Vehicle) asset.get(i)).getYear() + " " + ((Vehicle) asset.get(i)).getMakeModel());

            }
            System.out.println(message);
            System.out.print("description: " + asset.get(i).getDescription() + ", ");
            System.out.print("date i recieved: " + asset.get(i).getDataAcquired() + ", ");
            System.out.print("paid for: " + asset.get(i).getOriginalCost() + ", ");
            System.out.println("description: " + asset.get(i).getValue());
        }
    }
}
