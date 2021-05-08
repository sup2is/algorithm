//seat-reservation-manager https://leetcode.com/problems/seat-reservation-manager Compile

class SeatManager {

    private final TreeSet<Integer> seats = new TreeSet<>();

    public SeatManager(int n) {
        for (int i = 1; i <= n; i++) {
            seats.add(i);
        }
    }

    public int reserve() {
        return seats.pollFirst();
    }

    public void unreserve(int seatNumber) {
        if(!seats.contains(seatNumber)) seats.add(seatNumber);
    }

}


/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */
