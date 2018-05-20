package org.apache.cxf.endpoint.jaxrs.definition;

import java.util.NoSuchElementException;

import javax.ws.rs.HttpMethod;

public enum HttpMethodEnum {
	
	/**
     * HTTP GET method.
     */
	GET(HttpMethod.GET), 
	/**
     * HTTP POST method.
     */
	POST(HttpMethod.POST),
    /**
     * HTTP PUT method.
     */
    PUT(HttpMethod.PUT),
    /**
     * HTTP DELETE method.
     */
    DELETE(HttpMethod.DELETE),
    /**
     * HTTP PATCH method.
     */
    PATCH(HttpMethod.PATCH),
    /**
     * HTTP HEAD method.
     */
    HEAD(HttpMethod.HEAD),
    /**
     * HTTP OPTIONS method.
     */
    OPTIONS(HttpMethod.OPTIONS);
	
	private String key;

	private HttpMethodEnum(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}
	
	public static HttpMethodEnum valueOfIgnoreCase(String key) {
		for (HttpMethodEnum apiType : HttpMethodEnum.values()) {
			if(apiType.getKey().equalsIgnoreCase(key)) {
				return apiType;
			}
		}
    	throw new NoSuchElementException("Cannot found ApiType with key '" + key + "'.");
    }
	
}
