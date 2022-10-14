package just.monika.trash.client.event.events.render;

import just.monika.trash.client.event.Event;

public class EventRender2D extends Event {

	public int width, height;

	public EventRender2D(int width, int height) {
		this.width = width;
		this.height = height;
	}
}
