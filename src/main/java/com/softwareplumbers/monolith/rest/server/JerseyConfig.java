package com.softwareplumbers.monolith.rest.server;

import com.softwareplumbers.dms.rest.server.core.Catalogue;
import com.softwareplumbers.dms.rest.server.core.Documents;
import com.softwareplumbers.dms.rest.server.core.Workspaces;
import com.softwareplumbers.feed.rest.server.Converters;
import com.softwareplumbers.feed.rest.server.FeedExceptionMapper;
import com.softwareplumbers.feed.rest.server.Feeds;
import com.softwareplumbers.rest.server.core.Heartbeat;
import com.softwareplumbers.rest.server.core.CORSRequestFilter;
import com.softwareplumbers.rest.server.core.CORSResponseFilter;
import com.softwareplumbers.rest.server.core.Authentication;
import com.softwareplumbers.rest.server.core.AuthenticationFilter;
import com.softwareplumbers.rest.server.core.CoreExceptionMapper;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;
import org.springframework.stereotype.Component;

import org.glassfish.jersey.media.multipart.MultiPartFeature;

@Component
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		property(ServerProperties.RESPONSE_SET_STATUS_OVER_SEND_ERROR, "true");
		register(Documents.class);
		register(Workspaces.class);
		register(Catalogue.class);
		register(Heartbeat.class);
		register(Feeds.class);
		register(Authentication.class);
		register(CORSRequestFilter.class);
        register(CORSResponseFilter.class);
	    register(MultiPartFeature.class);
	    register(AuthenticationFilter.class);
        register(CoreExceptionMapper.class);
        register(FeedExceptionMapper.class);
        register(Converters.class);
	}

}