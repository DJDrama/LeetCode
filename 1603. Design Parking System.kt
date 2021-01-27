/**
 * https://leetcode.com/problems/design-parking-system/
 */

class ParkingSystem(big: Int, medium: Int, small: Int) {
    private var big = 0
    private var medium = 0
    private var small = 0

    init {
        this.big = big
        this.small = small
        this.medium = medium
    }

    fun addCar(carType: Int): Boolean {
        when (carType) {
            1 -> return big-- > 0
            2 -> return medium-- > 0
            3 -> return small-- > 0
        }
        return false
    }

}