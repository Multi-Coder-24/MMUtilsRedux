package org.multicoder.mmutils.prj;

import com.google.gson.JsonObject;

public class ModHost {
    public String platformName;
    public String platformURL;
    public String modURL;
    public ModHost(String ...params){
        platformName = params[0];
        platformURL = params[1];
        modURL = params[2];
    }

    public ModHost(JsonObject jsonObject){
        platformName = jsonObject.get("platformName").getAsString();
        platformURL = jsonObject.get("platformURL").getAsString();
        modURL = jsonObject.get("modURL").getAsString();
    }

    public JsonObject toJson(){
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("platformName", platformName);
        jsonObject.addProperty("platformURL", platformURL);
        jsonObject.addProperty("modURL", modURL);
        return jsonObject;
    }
}
