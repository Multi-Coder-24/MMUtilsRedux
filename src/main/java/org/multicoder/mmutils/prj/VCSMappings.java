package org.multicoder.mmutils.prj;


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
}
