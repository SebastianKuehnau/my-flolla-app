package com.example.application.views.flollaworld;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextField;

@Tag("flolla-component")
@JsModule("./components/flolla-component.ts")
public class FlollaComponent extends LitTemplate {

    @Id("hello-button")
    Button button;

    @Id("name-field")
    TextField name;
    public FlollaComponent() {
        button.addThemeName(ButtonVariant.LUMO_PRIMARY.getVariantName());
    }
}
