public class ex005 {
    public static void main(String[] args) {
        int alturaVitorOnlyInches = 75;
        System.out.println("75 inches in cm: ");
        convertToCentimeters(alturaVitorOnlyInches);
        int alturaVitorFeets = 6;
        int alturaVitorInches = 4;
        System.out.println("6'4 in cm: ");
        convertToCentimeters(alturaVitorFeets, alturaVitorInches);

    }
    public static double convertToCentimeters(int heightInInches) {
        double defaultCM = 0.393701;
        double convertido = heightInInches / defaultCM ;
        System.out.println(convertido + "cm");
        return convertido;
    }
    public static void convertToCentimeters(int heightInFeet, int heightInInches) {
        int fullInches = (heightInFeet * 12) + heightInInches;
        convertToCentimeters(fullInches);
    }
}
