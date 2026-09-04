package org.multicoder.mmutils.prj;

import com.google.gson.JsonObject;

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

    public VCSMappings(JsonObject jsonObject){
        hostingPlatform = jsonObject.get("hostingPlatform").getAsString();
        hostURL = jsonObject.get("hostURL").getAsString();
        branches = jsonObject.get("branches").getAsString();
    }

    public JsonObject toJson(){
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("hostingPlatform", hostingPlatform);
        jsonObject.addProperty("hostURL", hostURL);
        jsonObject.addProperty("branches", branches);
        return jsonObject;
    }
}
