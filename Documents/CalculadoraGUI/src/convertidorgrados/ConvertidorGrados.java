package convertidorgrados;

public class ConvertidorGrados {

    public int convertidorCelciusAFarenheit(int celcius) {
        int farenheit;
        farenheit = (int) (1.8 * celcius + 32);
        return farenheit;
    }

    public int convertidorFarenheitACelcius(int farenheit) {
        int celcius;
        celcius = (int) ((farenheit - 32)/1.8);
        return celcius;
    }
}
