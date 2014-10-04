package com.exmertec.cabinet;

import com.exmertec.cabinet.resources.CabinetResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import java.io.File;

public class CabinetApplication extends Application<CabinetConfiguration> {
    @Override
    public void initialize(Bootstrap<CabinetConfiguration> bootstrap) {
    }

    @Override
    public void run(CabinetConfiguration configuration, Environment environment) throws Exception {
        environment.jersey().register(new CabinetResource());
    }

    public static void main(String[] args) throws Exception {
        new CabinetApplication().run(new String[] {"server", "cabinet.yml"});
    }
}
