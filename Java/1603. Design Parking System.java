/**
 * https://leetcode.com/problems/design-parking-system/
 */

// Method 1
class ParkingSystem {
    private int[] count;

    public ParkingSystem(int big, int medium, int small) {
        count = new int[]{big, medium, small};
    }

    public boolean addCar(int carType) {
        return count[carType - 1]-- > 0;
    }
}

// Method 2
class ParkingSystem {
    private int big, medium, small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        boolean res = false;
        switch (carType) {
            case 1:
                if (this.big-- > 0)
                    res = true;
                break;
            case 2:
                if (this.medium-- > 0)
                    res = true;
                break;
            case 3:
                if (this.small-- > 0)
                    res = true;
                break;
        }
        return res;
    }
}