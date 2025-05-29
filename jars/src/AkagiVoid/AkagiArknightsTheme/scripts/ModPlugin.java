package AkagiVoid.AkagiArknightsTheme.scripts;

import com.fs.starfarer.api.BaseModPlugin;
import com.fs.starfarer.api.Global;
import com.fs.starfarer.api.characters.FullName;

public class ModPlugin extends BaseModPlugin {
    //make selected portraits unique to the player, credit NES 4 his java script sample. :3
     @ Override
    public void onGameLoad(boolean newGame) {
		Global.getSector().getPlayerFaction().getPortraits(FullName.Gender.FEMALE).remove("graphics/portraits/amiya_rhodesisland.png");
        Global.getSector().getPlayerFaction().getPortraits(FullName.Gender.MALE).remove("graphics/portraits/doctor_rhodesisland.png");
    }
}
