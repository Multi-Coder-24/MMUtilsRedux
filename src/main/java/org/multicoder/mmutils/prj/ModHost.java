package org.multicoder.mmutils.prj;


import org.w3c.dom.Element;

import java.util.UUID;

@SuppressWarnings("unused")
public class ModHost {
    public String platformName;
    public String platformURL;
    public String modURL;
    public UUID hostID;
    public ModHost(String ...params){
        platformName = params[0];
        platformURL = params[1];
        modURL = params[2];
        hostID = UUID.randomUUID();
    }

    public void serialize(Element container){
        container.setAttribute("platformName", platformName);
        container.setAttribute("platformURL", platformURL);
        container.setAttribute("modURL", modURL);
        container.setAttribute("hostID", hostID.toString());
    }

}
