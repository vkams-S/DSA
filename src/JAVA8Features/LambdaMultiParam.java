package JAVA8Features;

@java.lang.FunctionalInterface
interface LocationListener{
    void onLocationChange(double latitude,double longitude);

}

/*class TrackingApp implements LocationListener{

    @Override
    public void onLocationChange(double latitude, double longitude) {
        System.out.println("A new Location Received");
        System.out.println("GeoPoints: "+latitude+", "+longitude);
    }
}*/
public class LambdaMultiParam {
    public static void main(String[] args) {
       LocationListener ll = (l1,l2)->{
           System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
           System.out.println("A new Location Received");
           System.out.println("GeoPoints: "+l1+", "+l2);
           System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
       };
       ll.onLocationChange(75.2333, 72.8765);
    }
}
