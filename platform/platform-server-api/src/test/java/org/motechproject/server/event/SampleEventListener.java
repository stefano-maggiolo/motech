package org.motechproject.server.event;

import org.motechproject.event.EventListener;
import org.motechproject.event.MotechEvent;

public class SampleEventListener implements EventListener {

    @Override
    public void handle(MotechEvent event) {
    }

    @Override
    public String getIdentifier() {
        return "TestEventListener";
    }
}
