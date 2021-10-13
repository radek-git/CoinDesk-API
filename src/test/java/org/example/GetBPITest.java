package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static io.restassured.RestAssured.given;

public class GetBPITest {

    @Test
    public void shouldGetBPITest() throws JsonProcessingException {
        Response response = given()
                .when()
                .get("https://api.coindesk.com/v1/bpi/currentprice.json");

        String res = response.body().print();
        BitcoinPriceIndexResponse bpi = new ObjectMapper().readValue(res, BitcoinPriceIndexResponse.class);

//        System.out.println(LocalDateTime.parse(response.getTime().getUpdated(),
//                DateTimeFormatter.ofPattern("MMM dd, yyyy HH:mm:ss zzz", Locale.US)));
    }
}
