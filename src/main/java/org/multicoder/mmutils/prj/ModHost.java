package org.multicoder.mmutils.prj;

@SuppressWarnings("unused")
public class ModHost {
    public String platformName;
    public String platformURL;
    public String modURL;
    public ModHost(String ...params){
        platformName = params[0];
        platformURL = params[1];
        modURL = params[2];
    }
}
