import { html, LitElement } from 'lit';
import '@vaadin/button';
import '@vaadin/text-field';
import {Notification} from "@vaadin/notification";
import {customElement} from "lit/decorators.js";
import {FlollaWorldEndpoint} from "Frontend/generated/endpoints";

@customElement('flolla-component')
class FlollaComponent extends LitElement {
    name = '';

    connectedCallback() {
        super.connectedCallback();
    }

    render() {
        return html`
          <div>
              <vaadin-text-field id="name-field" label="Your name" @value-changed=${this.nameChanged}></vaadin-text-field>
              <vaadin-button id="hello-button" @click=${this.sayHello}>Say hello</vaadin-button>
          </div>
        `;
        }

    nameChanged(e: CustomEvent) {
        this.name = e.detail.value;
    }

    async sayHello() {
        const serverResponse = await FlollaWorldEndpoint.sayHello(this.name);
        Notification.show(serverResponse);
    }
}