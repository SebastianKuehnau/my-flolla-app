package com.example.application.endpoints.flollaworld;

import com.vaadin.flow.server.auth.AnonymousAllowed;
import dev.hilla.Endpoint;
import dev.hilla.Nonnull;

@Endpoint
@AnonymousAllowed
public class FlollaWorldEndpoint {
    @Nonnull
    public String sayHello(@Nonnull String name) {
        if (name.isEmpty()) {
            return "Hello flolla stranger";
        } else {
            return "Hello flolla " + name;
        }
    }
}

