package just.monika.trash.client.module.render;

import just.monika.trash.client.event.EventTarget;
import just.monika.trash.client.event.events.update.EventUpdate;
import just.monika.trash.client.module.Module;
import org.lwjgl.input.Keyboard;

public class FullBright extends Module {

	private float gamma;
	private float targetGamma;

	public FullBright() {
		super("FullBright", Keyboard.KEY_G, Category.RENDER, false);
		this.targetGamma = 100F;
	}

	public void onEnable() {
		super.onEnable();
		this.gamma = mc.gameSettings.gammaSetting;
	}

	public void onDisable() {
		super.onDisable();
		mc.gameSettings.gammaSetting = this.gamma;
	}

	@EventTarget
	public void onRender(EventUpdate e) {
		if (mc.gameSettings.gammaSetting < this.targetGamma)
			mc.gameSettings.gammaSetting += 0.2F;
	}

}
