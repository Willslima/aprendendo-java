package exercicios;

public class ConversorTemperatura {
    public static void main(String[] args) {
        // (0C x 5.0/9.0) + 32 = 32F
        double  fahrenheit = 64.0; //Alterar
        final double MULTIPLICADOR = 5.0/9.0;
        double celsius = 17.778; //Alterar

        System.out.println((fahrenheit - 32)* MULTIPLICADOR + " Graus fahrenheit");
        System.out.println((celsius*9.0/5.0) + 32 + " Graus Celsius");
    }
}
