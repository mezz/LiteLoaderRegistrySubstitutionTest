package mezz.liteloaderregistrysubstitutiontest;

import net.minecraft.block.BlockAnvil;
import net.minecraft.block.SoundType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

@Mod(
		modid = LiteLoaderRegistrySubstitutionTestMod.MODID,
		version = LiteLoaderRegistrySubstitutionTestMod.VERSION,
		acceptedMinecraftVersions = "[1.12.2,)"
)
public class LiteLoaderRegistrySubstitutionTestMod {
	static final String MODID = "liteloaderregistrysubstitutiontest";
	static final String VERSION = "1.0";

	@Mod.EventHandler
	public void preinit(FMLPreInitializationEvent event) {
		BlockSubAnvil block = new BlockSubAnvil();
		ForgeRegistries.BLOCKS.register(block);
	}

	private static class BlockSubAnvil extends BlockAnvil
	{
		public BlockSubAnvil() {
			this.setRegistryName(new ResourceLocation("anvil"));
			this.setHardness(5.0F);
			this.setSoundType(SoundType.ANVIL);
			this.setResistance(2000.0F);
			this.setUnlocalizedName("anvil");
		}
	}
}
