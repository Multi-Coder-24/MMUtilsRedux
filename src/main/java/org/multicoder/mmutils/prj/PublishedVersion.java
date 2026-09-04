package org.multicoder.mmutils.prj;

import com.google.gson.JsonObject;

import java.util.UUID;

@SuppressWarnings("unused")
public class PublishedVersion {
    public String version;
    public UUID id;
    public String hostingPlatform;
    public String hostingPlatformURL;
    public String changelog;

    public PublishedVersion(String ...params){
        version = params[0];
        hostingPlatform = params[1];
        hostingPlatformURL = params[2];
        changelog = params[3];
        id = UUID.randomUUID();
    }

    public PublishedVersion(JsonObject jsonObject){
        version = jsonObject.get("version").getAsString();
        hostingPlatform = jsonObject.get("hostingPlatform").getAsString();
        hostingPlatformURL = jsonObject.get("hostingPlatformURL").getAsString();
        changelog = jsonObject.get("changelog").getAsString();
        id = UUID.fromString(jsonObject.get("id").getAsString());
    }

    public JsonObject toJson(){
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("version", version);
        jsonObject.addProperty("hostingPlatform", hostingPlatform);
        jsonObject.addProperty("hostingPlatformURL", hostingPlatformURL);
        jsonObject.addProperty("changelog", changelog);
        jsonObject.addProperty("id", id.toString());
        return jsonObject;
    }
}
