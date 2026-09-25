// Last updated: 9/25/2026, 7:41:14 AM
class Solution {
    public double[] convertTemperature(double celsius) {
      return new double[] { celsius + 273.15, (celsius * 1.80) + 32.00};
    }
}