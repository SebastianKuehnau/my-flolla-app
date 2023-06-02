package com.example.application.views.flollaworld;

import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "hello-flolla-world")
public class HelloFlollaWorldView extends VerticalLayout {
    public HelloFlollaWorldView() {
        add(new Span("Hello Flolla World"));
        add(new FlollaComponent());
    }
}
