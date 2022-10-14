package just.monika.trash.client.module.render.hud;

import just.monika.trash.client.module.render.hud.components.Arraylist;
import just.monika.trash.client.module.render.hud.components.DrawPotions;
import just.monika.trash.client.module.render.hud.components.TabGUI;
import org.lwjgl.input.Keyboard;

import just.monika.trash.client.manager.managers.FontManager;
import just.monika.trash.client.manager.managers.SettingManager;
import just.monika.trash.client.module.Module;
import just.monika.trash.client.setting.Setting;
import just.monika.trash.client.ttf.MinecraftFontRenderer;

public class HUD extends Module {

	protected MinecraftFontRenderer hud = client.getManagers().getManager(FontManager.class).fontSize36;
	protected MinecraftFontRenderer hudName =client.getManagers().getManager(FontManager.class).fontSize60;
	protected MinecraftFontRenderer hudS = client.getManagers().getManager(FontManager.class).fontSize30;
	protected MinecraftFontRenderer arraylist = client.getManagers().getManager(FontManager.class).fontSize24;

	private Arraylist ar;
	private DrawPotions dp;
	private TabGUI tab;

	public HUD() {
		super("HUD", Keyboard.KEY_F, Category.RENDER, false);
		client.getManagers().getManager(SettingManager.class).addSetting(new Setting(this, "TabGUI", true));
		client.getManagers().getManager(SettingManager.class).addSetting(new Setting(this, "Hotbar", true));
		client.getManagers().getManager(SettingManager.class).addSetting(new Setting(this, "ArrayList", true));
		client.getManagers().getManager(SettingManager.class).addSetting(new Setting(this, "PotionEffect", true));
	}

	public void onEnable() {
		super.onEnable();
	}

	public void onDisable() {
		super.onDisable();
	}


}
