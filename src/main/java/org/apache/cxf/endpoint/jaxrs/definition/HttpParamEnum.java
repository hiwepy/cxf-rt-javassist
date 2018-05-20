package org.apache.cxf.endpoint.jaxrs.definition;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.Encoded;

/**
 * 参数注解类型枚举
 * 
 * @see javax.ws.rs.BeanParam
 * @see javax.ws.rs.CookieParam
 * @see javax.ws.rs.HeaderParam
 * @see javax.ws.rs.MatrixParam
 * @see javax.ws.rs.FormParam
 * @see javax.ws.rs.PathParam
 * @see javax.ws.rs.QueryParam
 */
public enum HttpParamEnum {

	/**
	 * The annotation that may be used to inject custom JAX-RS "parameter
	 * aggregator" value object into a resource class field, property or resource
	 * method parameter.
	 * 
	 * @see javax.ws.rs.BeanParam
	 */
	BEAN,
	/**
	 * Binds the value of a HTTP cookie to a resource method parameter, resource
	 * class field, or resource class bean property. A default value can be
	 * specified using the {@link DefaultValue} annotation.
	 * 
	 * @see javax.ws.rs.CookieParam
	 */
	COOKIE,
	/**
	 * Binds the value(s) of a HTTP header to a resource method parameter, resource
	 * class field, or resource class bean property. A default value can be
	 * specified using the {@link DefaultValue} annotation.
	 * 
	 * @see javax.ws.rs.HeaderParam
	 */
	HEADER,
	/**
	 * * Binds the value(s) of a URI matrix parameter to a resource method
	 * parameter, resource class field, or resource class bean property. Values are
	 * URL decoded unless this is disabled using the {@link Encoded} annotation. A
	 * default value can be specified using the {@link DefaultValue} annotation.
	 * 
	 * @see javax.ws.rs.MatrixParam
	 */
	MATRIX,
	/**
	 * Binds the value(s) of a form parameter contained within a request entity body
	 * to a resource method parameter. Values are URL decoded unless this is
	 * disabled using the {@link Encoded} annotation. A default value can be
	 * specified using the {@link DefaultValue} annotation. If the request entity
	 * body is absent or is an unsupported media type, the default value is used.
	 * 
	 * @see javax.ws.rs.FormParam
	 */
	FORM,
	/**
	 * Binds the value of a URI template parameter or a path segment containing the
	 * template parameter to a resource method parameter, resource class field, or
	 * resource class bean property. The value is URL decoded unless this is
	 * disabled using the {@link Encoded &#64;Encoded} annotation. A default value
	 * can be specified using the {@link DefaultValue &#64;DefaultValue} annotation.
	 * 
	 * @see javax.ws.rs.PathParam
	 */
	PATH,
	/**
	 * Binds the value(s) of a HTTP query parameter to a resource method parameter,
	 * resource class field, or resource class bean property. Values are URL decoded
	 * unless this is disabled using the {@link Encoded} annotation. A default value
	 * can be specified using the {@link DefaultValue} annotation.
	 * 
	 * @see javax.ws.rs.QueryParam
	 */
	QUERY;

}
