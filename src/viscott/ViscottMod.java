package viscott;

import arc.Core;
import arc.Events;
import arc.util.Log;
import arc.util.Time;
import mindustry.game.EventType;
import mindustry.mod.Mod;
import mindustry.ui.dialogs.BaseDialog;
import viscott.content.*;
import viscott.content.shootpatterns.CyclicShootPattern;

public class ViscottMod extends Mod {

    public ViscottMod(){
    }

    @Override
    public void loadContent(){
        Log.info("Loading some example content.");
        PvAttributes.load();
        PvStats.load();
        PvEffects.load();
        PvItems.load();
        PvStatusEffects.load();
        PvLiquids.load();
        PvWeathers.load();
        PvUnits.load();
        PvBlocks.load();
        PvTurrets.load();
        PvPlanets.load();
        PvVanillaChanges.load();
        ProjectViscottTechTree.load();
    }

}
