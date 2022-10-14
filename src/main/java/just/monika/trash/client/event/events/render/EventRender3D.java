package just.monika.trash.client.event.events.render;

import just.monika.trash.client.event.Event;

public class EventRender3D extends Event {

	public float particlTicks;

	public EventRender3D(float particlTicks) {
		this.particlTicks = particlTicks;
	}

}
