package com.dotmarketing.cmis.proxy;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
/**
 * This is  Proxy for HTTPServletRequest, This extends Map to put and get objects.
 * @Deprecated - as of 2016-05-16 use  {@link com.dotcms.mock.request.MockHttpRequest(String host, String uri).request()} instead
 */
@Deprecated
public interface DotRequestProxy extends HttpServletRequest,Map{
	
}
