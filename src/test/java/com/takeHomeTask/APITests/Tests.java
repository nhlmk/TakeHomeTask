package com.takeHomeTask.APITests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Tests {
    String baseUrl = "https://petstore.swagger.io/v2";

    // NEGATIVE TEST
    @DisplayName("GET results to /store/order/{orderId} with ID 500")
    @Test
    public void negativeGetTest() {
        Response response = given().accept(ContentType.JSON)
                .and()
                .pathParam("orderId", 500)
                .when()
                .get(baseUrl + "/store/order/{orderId}");

        assertEquals(404, response.statusCode());
        assertEquals("application/json", response.contentType());
    }

    @DisplayName("POST results to /pet")
    @Test
    public void postTest() {
        String requestJsonBody = "{\"id\":1,\"category\":{\"id\":1,\"name\":\"Golden\"}," +
                "\"name\":\"Snape\",\"photoUrls\":[\"string\"],\"tags\":[{\"id\":0,\"name\":\"string\"}]," +
                "\"status\":\"available\"}";
        Response response = given().accept(ContentType.JSON).and().contentType(ContentType.JSON)
                .body(requestJsonBody).when().post(baseUrl + "/pet");

        assertThat(response.path("category.name"), is("Golden"));

        assertThat(response.path("name"), is("Snape"));

        assertThat(response.path("id"), is(1));
        response.prettyPrint();
    }

    @DisplayName("DELETE a pet")
    @Test
    public void deletePetTest(){
        given()
                .accept(ContentType.JSON)
                .and().pathParam("petId", 1)
                .when()
                .delete(baseUrl + "/pet/{petId}")
                .then()
                .statusCode(200)
                .log().body();
    }

    @DisplayName("DELETE /user/{username}")
    @Test
    public void deleteUserTest(){
        given()
                .auth().basic("test", "abc123")
                .and().accept(ContentType.JSON)
                .and().pathParam("username", "user1")
                .when()
                .delete(baseUrl+ "/user/{username}")
                .then()
                .statusCode(404)
                .log().body();
    }

}
