//design-parking-system: https://leetcode.com/problems/design-parking-system/ Complete

public class ParkingSystem {

    int[] parking;
    
    public ParkingSystem(int big, int medium, int small) {
        this.parking = new int[3];
        parking[0] = big;
        parking[1] = medium;
        parking[2] = small;
    }

    public boolean addCar(int carType) {
        if(parking[carType - 1] > 0) {
            parking[carType - 1]--;
            return true;
        }
        return false;
    }
}


