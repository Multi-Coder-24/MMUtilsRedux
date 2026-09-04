package org.multicoder.mmutils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.multicoder.mmutils.ui.MainScreen;

public class Main {
    public static final Logger LOGGER = LogManager.getLogger("MMUtils");
    static void main() {
        LOGGER.info("Starting MMUtils");
        MainScreen screen = new MainScreen();
    }
}
