package millestiasmysteries.biome;

import millestiasmysteries.MillestiasMysteriesMod;
import net.minecraft.resources.ResourceLocation;
import terrablender.api.Regions;
import terrablender.api.TerraBlenderApi;

public class MMTerrablenderAPI implements TerraBlenderApi {

    @Override
    public void onTerraBlenderInitialized() {
        Regions.register(new MMOverworldRegion(ResourceLocation.fromNamespaceAndPath(MillestiasMysteriesMod.MOD_ID, "overworld"), 2));
    }
}
