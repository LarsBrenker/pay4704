package de.larsbrenker.reproducer;


import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

@RequestScoped
public class Service {

    @Inject
    @RestClient
    private ConfigResourceService configResourceService;

    public int getConfig() {
        return configResourceService.getDbConfig().getStatus();
    }

}
