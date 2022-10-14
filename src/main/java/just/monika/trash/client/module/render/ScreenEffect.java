package just.monika.trash.client.module.render;

import just.monika.trash.client.manager.managers.SettingManager;
import just.monika.trash.client.module.Module;
import just.monika.trash.client.setting.Setting;
import org.lwjgl.input.Keyboard;

public class ScreenEffect extends Module {

	public ScreenEffect() {
		super("ScreenEffect", Keyboard.KEY_NONE, Category.RENDER, false);

		client.getManagers().getManager(SettingManager.class).addSetting(new Setting(this, "DamageEffect", true));
	}
}
