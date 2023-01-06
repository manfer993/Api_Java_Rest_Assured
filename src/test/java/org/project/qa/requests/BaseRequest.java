package org.project.qa.requests;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

public class BaseRequest {
    protected static final String URL = "https://63b6dfe11907f863aa04ff81.mockapi.io/api/v1/%s";
    protected static final String URL_WITH_PARAM = "https://63b6dfe11907f863aa04ff81.mockapi.io/api/v1/%s/%s";

    private static final String VALUE_CONTENT_TYPE = "application/json";
    private static final String CONTENT_TYPE = "Content-Type";

    protected Response requestGet(String endpoint, Map<String, ?> headers) {
        return RestAssured.given()
                .contentType(VALUE_CONTENT_TYPE)
                .headers(headers)
                .when()
                .get(endpoint);
    }

    protected Response requestPost(String endpoint, Map<String, ?> headers, Object body) {
        return RestAssured.given()
                .contentType(VALUE_CONTENT_TYPE)
                .headers(headers)
                .body(body)
                .when()
                .post(endpoint);
    }

    protected Response requestPut(String endpoint, Map<String, ?> headers, Object body) {
        return RestAssured.given()
                .contentType(VALUE_CONTENT_TYPE)
                .headers(headers)
                .body(body)
                .when()
                .put(endpoint);
    }

    protected Response requestDelete(String endpoint, Map<String, ?> headers) {
        return RestAssured.given()
                .contentType(VALUE_CONTENT_TYPE)
                .headers(headers)
                .when()
                .delete(endpoint);
    }

    protected Map<String, String> createBaseHeaders() {
        Map<String, String> headers = new HashMap<>();
        headers.put(CONTENT_TYPE, VALUE_CONTENT_TYPE);
        return headers;
    }
}
