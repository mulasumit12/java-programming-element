public class EarthVolumeCalculator {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double radiusMiles = radiusKm / 1.609;
        double volumeKm3 = (4/3)*Math.PI * Math.pow(radiusKm, 3);
        double volumeMiles3 = (4/3)* Math.PI * Math.pow(radiusMiles, 3);
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);
    }
}
