package org.multicoder.mmutils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.multicoder.mmutils.prj.Container;
import org.multicoder.mmutils.ui.MainScreen;

public class Main {
    public static final Logger LOGGER = LogManager.getLogger("MMUtils");
    static void main() {
        LOGGER.info("Starting MMUtils");
        //MainScreen screen = new MainScreen();
        LOGGER.info("Tetsing Format");
        Container container = new Container("Sample Mod","0.0.1","multicoder","1.21.11","Fabric","An Example Test For The Format");
        container.WriteToFile("MMUtil.json");
    }
}
