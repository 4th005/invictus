package invictus.modules.movement;

import org.lwjgl.input.Keyboard;

import invictus.events.Event;
import invictus.events.listeners.EventUpdate;
import invictus.modules.Module;

public class Fly extends Module {
	
	public Fly(){
		super("Fly", Keyboard.KEY_G, Category.MOVEMENT);
	}
	
	public void onEnable(){
		mc.thePlayer.capabilities.isFlying = true;
		mc.thePlayer.capabilities.allowFlying = true;
		
	}
	public void onDisable(){
		mc.thePlayer.capabilities.isFlying = false;
		mc.thePlayer.capabilities.allowFlying = false;
		
	}
	
	public void onEvent(Event e){
		if(e instanceof EventUpdate){
			if(e.isPre()) {
				
			}
		}
	}

}
