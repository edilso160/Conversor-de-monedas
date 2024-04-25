import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Conversor {
    public  static void convertirPesosADolares(String apiKey){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Digita la cantidad de  pesos  colombianos a convertir a dolares: \t ");
        double cantidadDePesos = scanner.nextDouble();
        double tasaDeCambio = obtenerTasaDeCambio(apiKey);
        double cantidadDeDolares = cantidadDePesos / tasaDeCambio;

        System.out.println(" Cantidad en pesos colombianos " + cantidadDePesos);
        System.out.println(" Tasa de cambio USD-COP " + tasaDeCambio);
        System.out.println(" Cantidad en dolares " + cantidadDeDolares);




    }


    public  static void convertirDolaresAPesos(String apiKey){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Digita la cantidad de dolares a convertir a pesos colombianos: \t ");
        double cantidadDeDolares = scanner.nextDouble();

        double tasaDeCambio = obtenerTasaDeCambio(apiKey);
        double cantidadDePesos = cantidadDeDolares * tasaDeCambio;

        System.out.println(" Cantidad en dolares: " + cantidadDeDolares);
        System.out.println(" Tasa de cambio USD-COP " + tasaDeCambio);
        System.out.println(" Cantidad en pesos " + cantidadDePesos);



    }

    private static double obtenerTasaDeCambio(String apiKey) {
        try {
            URL url = new URL("https://v6.exchangerate-api.com/v6/f5c3ac1f8bc37f0d63a67351/latest/USD");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            JsonObject jsonResponse = JsonParser.parseString(response.toString()).getAsJsonObject();
            JsonObject rates = jsonResponse.getAsJsonObject("rates");

            if (rates != null && rates.has("COP")) {
                return rates.get("COP").getAsDouble();
            } else {
                System.out.println("No se pudo obtener la tasa de cambio USD-COP desde la API.");
                return 0;
            }

        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }


}
