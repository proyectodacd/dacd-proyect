package org.example;
import org.jsoup.Connection;
import org.jsoup.Jsoup;

import java.io.IOException;

// PUEDO EDITAR EN GITHUB (AYO NO ME PEGUES AL VER ESTO)

public class AviationStackApiConsumer {
    public static void main(String[] args) {
        try{
            String endpoint = "https://api.aviationstack.com/v1/flights";
            Connection connection = Jsoup.connect(endpoint);
            connection.ignoreContentType(true);
            connection.data("access_key", "66c5fafcb31f116b9ee7dce896c47d3c");
            connection.data("limit", "3");

            Connection.Response response = connection.method(Connection.Method.GET).execute();
            System.out.println(response.body());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
