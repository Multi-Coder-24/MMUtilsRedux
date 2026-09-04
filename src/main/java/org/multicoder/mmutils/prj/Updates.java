package org.multicoder.mmutils.prj;

import com.google.gson.JsonObject;

import java.util.UUID;

@SuppressWarnings("unused")
public class Updates {
    public String name;
    public UUID id;
    public String dateStamp;
    public UpdateType type;
    public String content;

    public Updates(String ...params){
        name = params[0];
        id = UUID.randomUUID();
        dateStamp = params[1];
        content = params[2];
        type = UpdateType.GENERAL_NOTE;
    }

    public Updates(JsonObject jsonObject){
        name = jsonObject.get("name").getAsString();
        id = UUID.fromString(jsonObject.get("id").getAsString());
        dateStamp = jsonObject.get("dateStamp").getAsString();
        content = jsonObject.get("content").getAsString();
        type = UpdateType.values()[jsonObject.get("type").getAsInt()];
    }

    public JsonObject toJson(){
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", name);
        jsonObject.addProperty("id", id.toString());
        jsonObject.addProperty("dateStamp", dateStamp);
        jsonObject.addProperty("content", content);
        jsonObject.addProperty("type", type.ordinal());
        return jsonObject;
    }
}
