package de.larsbrenker.reproducer;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class Controller implements Serializable {

    private static final Logger LOGGER = LogManager.getLogger(Controller.class);

    @Inject
    @RestClient
    private ConfigResourceService configResourceService;

    public void getConfig() {
        LOGGER.info("getConfig {}", configResourceService.getDbConfig().getStatus());
    }

}
