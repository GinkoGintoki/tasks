package Martyr2;

public class DistanceBetweenTwoCities {
    private final static int R = 6371;

    public static double distanceCalculator(double lat1, double lon1, double lat2, double lon2) {
        double dLat = deg2rad(lat2 - lat1);
        double dLon = deg2rad(lon2 - lon1);

        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) *
                Math.sin(dLon / 2) * Math.sin(dLon / 2);

        double b = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        return R * b;
    }

    private static double deg2rad(double deg) {
        return deg * (Math.PI / 180);
    }
}
