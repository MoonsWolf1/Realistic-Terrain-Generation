package rtg.world.biome.realistic.fyrecraft;

import net.minecraft.world.biome.Biome;
import rtg.api.world.RTGWorld;
import rtg.api.world.terrain.TerrainBase;


public class RealisticBiomeFYRECrimsonGrove extends RealisticBiomeFYREBase {

    public RealisticBiomeFYRECrimsonGrove(Biome biome) {

        super(biome);
    }

    @Override
    public void initConfig() {

    }

    @Override
    public TerrainBase initTerrain() {

        return new TerrainBOPMeadow();
    }

    public static class TerrainBOPMeadow extends TerrainBase {

        public TerrainBOPMeadow() {

        }

        @Override
        public float generateNoise(RTGWorld rtgWorld, int x, int y, float border, float river) {

            return terrainPlains(x, y, rtgWorld, river, 160f, 10f, 60f, 200f, 66f);
        }
    }
}
