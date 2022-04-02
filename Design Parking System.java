//https://leetcode.com/problems/design-parking-system/

class ParkingSystem {
 int b,m,s;
    public ParkingSystem(int big, int medium, int small) {
       b=big;
        m=medium;
        s=small;
    }
    
    public boolean addCar(int carType) {
        switch(carType){
            case 1: if(b-- > 0)
                        return true;
                    else
                        return false;
            case 2: if(m-- > 0)
                        return true;
                    else
                        return false;
            case 3: if(s-- > 0)
                        return true;
                    else
                        return false;
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */