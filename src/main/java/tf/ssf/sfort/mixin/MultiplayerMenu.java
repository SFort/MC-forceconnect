package tf.ssf.sfort.mixin;

import net.minecraft.client.gui.screen.multiplayer.MultiplayerScreen;
import net.minecraft.client.network.ServerInfo;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MultiplayerScreen.class)
public abstract class MultiplayerMenu {
	@Shadow protected abstract void connect(ServerInfo entry);

	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		this.connect(new ServerInfo("sforts hardcore","ssf.tf",false));
	}
}
