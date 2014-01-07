package org.feuyeux.jaxrs2.atup.device;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/rest-api/*")
class AtupDeviceApplication extends ResourceConfig {
    public AtupDeviceApplication() {
        register(org.feuyeux.jaxrs2.atup.device.resource.AtupDeviceResource.class);
    }
}