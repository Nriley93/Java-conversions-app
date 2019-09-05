
package business;

/**
 * @author Nick Riley
 */
public class ConvCalc {
//    Constants for unit description
    public static final String MIDESC = "Miles";
    public static final String KMDESC = "Kilometers";
    public static final String FDESC = "Fehrenheit";
    public static final String CDESC = "Celsius";
    public static final String FTDESC = "Feet";
    public static final String MDESC = "Meters";
    public static final String OZDESC = "Ounces";
    public static final String GRDESC = "Grams";
    public static final String LTDESC = "Liters";
    public static final String GADESC = "Gallons";
    
    
    
    /**
    *   Conversions
    */
    public static double getMi2Km(double miles) throws Exception {
        double km;
        if(miles >= 0){
            km = miles * 1.60934;
        } else{
            throw new Exception("Miles cannot be negative");
        }
        return km;
    }
    
    public static double getM2F(double meters)throws Exception{
        double feet = meters * 3.2808;
        if(meters >= 0) {
            return feet;
        } else {
            throw new Exception("Meters cannot be negative");
        }
    }
    
    public static double getF2C(double fTemp){
        double cTemp = (5.0/9.0) * (fTemp - 32.0);
        return cTemp;
    }
    
    public static double getC2F(double cTemp){
        double fTemp = cTemp * (9.0 / 5.0) + 32;
        return fTemp;
    }
    
    public static double getKelvin(double cTemp) throws Exception{
        double kTemp = cTemp + 273.15;
        if(kTemp >= 0){
            return kTemp;
        } else {
            throw new Exception("Impossible temp: below 0 Kelvin");
        }
    }
    
    public static double getO2G(double oz) throws Exception{
        double grams = oz * 28.3459;
        if(oz >= 0){
            return grams;
        } else {
            throw new Exception("Cannot be a negative value");
        }
    }
    
    public static double getL2G(double liters)throws Exception{
        double gallons = liters * .26417;
        if(liters >= 0){
            return gallons;
        } else {
            throw new Exception("Cannot be a negative value");
        }
    }
}
