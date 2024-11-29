package convertidorgrados;

public class PruebaConvertirdorGrados {
    public static void main(String[] args) {
        ConvertidorGrados cg = new ConvertidorGrados();
        int farenheit = cg.convertidorCelciusAFarenheit(30);
        System.out.println("Grados Farenheit  = " + farenheit );
    }
}
