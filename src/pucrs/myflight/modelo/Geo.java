package pucrs.myflight.modelo;

public class Geo {
	private double latitude;
	private double longitude;
	
	public Geo(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public double distancia(Geo p2) {
	    return distancia(this, p2);
    }

	public static double distancia(Geo p1, Geo p2) {
	    double lat1 = Math.toRadians(p1.latitude);
        double lat2 = Math.toRadians(p2.latitude);
        double lon1 = Math.toRadians(p1.longitude);
        double lon2 = Math.toRadians(p2.longitude);

        double diflat = (lat1 - lat2)/2;
        diflat = Math.sin(diflat) * Math.sin(diflat);

        double diflon = (lon1 - lon2)/2;
        diflon = Math.sin(diflon) * Math.sin(diflon);

        double aux = diflat + diflon * Math.cos(lat1)*Math.cos(lat2);
        aux = Math.sqrt(aux);

        return 2*6371 * Math.asin(aux);
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public double getLongitude() {
		return longitude;
	}

	@Override
	public String toString() {
		return latitude + ", " + longitude;
	}
}
