package org.multicoder.mmutils.prj;


import org.w3c.dom.Element;

@SuppressWarnings("unused")
public class VCSMappings {
    public String hostingPlatform;
    public String hostURL;
    public String branches;

    public VCSMappings(String ...params){
        hostingPlatform = params[0];
        hostURL = params[1];
        branches = params[2];
    }
    public VCSMappings(){
        hostingPlatform = "";
        hostURL = "";
        branches = "";
    }
    public void serialize(Element mappings){
        mappings.setAttribute("hostingPlatform", hostingPlatform);
        mappings.setAttribute("hostURL", hostURL);
        mappings.setAttribute("branches", branches);
    }
}
