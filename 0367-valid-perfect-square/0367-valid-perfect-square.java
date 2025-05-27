class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 2) return true;
        return binarySearch(2, num / 2, num);
    }

    private boolean binarySearch(int left, int right, int num) {
        if (left > right) return false;

        int mid = left + (right - left) / 2;
        long guess = (long) mid * mid;

        if (guess == num) return true;
        else if (guess > num) return binarySearch(left, mid - 1, num);
        else return binarySearch(mid + 1, right, num);
    }
}
