package org.project.qa.requests;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.project.qa.entities.Clients;

import java.util.List;

public class ClientRequest extends BaseRequest {
    private static final String CLIENTS_PATH = "clients";
    private String endpoint;

    public Response getClients() {
        endpoint = String.format(URL, CLIENTS_PATH);
        return requestGet(endpoint, createBaseHeaders());
    }

    public Response getClient(String clientId) {
        endpoint = String.format(URL_WITH_PARAM, CLIENTS_PATH, clientId);
        return requestGet(endpoint, createBaseHeaders());
    }

    public Response createClient(Clients client) {
        endpoint = String.format(URL, CLIENTS_PATH);
        return requestPost(endpoint, createBaseHeaders(), client);
    }

    public Response updateClient(Clients client, String clientId) {
        endpoint = String.format(URL_WITH_PARAM, CLIENTS_PATH, clientId);
        return requestPut(endpoint, createBaseHeaders(), client);
    }

    public Response deleteClient(String clientId) {
        endpoint = String.format(URL_WITH_PARAM, CLIENTS_PATH, clientId);
        return requestDelete(endpoint, createBaseHeaders());
    }

    public Clients getClientEntity(Response response) {
        return response.as(Clients.class);
    }

    public List<Clients> getClientsEntity(Response response) {
        JsonPath jsonPath = response.jsonPath();
        return jsonPath.getList("", Clients.class);
    }
}
