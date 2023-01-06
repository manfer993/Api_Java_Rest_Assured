package org.project.qa.requests;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.project.qa.entities.Resources;

import java.util.List;

public class ResourceRequest extends BaseRequest {
    private static final String RESOURCES_PATH = "resources";
    private String endpoint;

    public Response getResources() {
        endpoint = String.format(URL, RESOURCES_PATH);
        return requestGet(endpoint, createBaseHeaders());
    }

    public Response getResource(String resourceId) {
        endpoint = String.format(URL_WITH_PARAM, RESOURCES_PATH, resourceId);
        return requestGet(endpoint, createBaseHeaders());
    }

    public Response createResource(Resources resource) {
        endpoint = String.format(URL, RESOURCES_PATH);
        return requestPost(endpoint, createBaseHeaders(), resource);
    }

    public Response updateResource(Resources resource, String resourceId) {
        endpoint = String.format(URL_WITH_PARAM, RESOURCES_PATH, resourceId);
        return requestPut(endpoint, createBaseHeaders(), resource);
    }

    public Response deleteResource(String resourceId) {
        endpoint = String.format(URL_WITH_PARAM, RESOURCES_PATH, resourceId);
        return requestDelete(endpoint, createBaseHeaders());
    }

    public Resources getResourceEntity(Response response) {
        return response.as(Resources.class);
    }

    public List<Resources> getResourcesEntity(Response response) {
        JsonPath jsonPath = response.jsonPath();
        return jsonPath.getList("", Resources.class);
    }
}
