package just.monika.trash.client.event.events.render;

import just.monika.trash.client.event.Event;

public class EventUpdateScreen extends Event {

	public int width;
	public int height;

	public EventUpdateScreen(int width, int height) {
		this.width = width;
		this.height = height;
	}
}
