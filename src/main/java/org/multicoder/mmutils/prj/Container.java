package org.multicoder.mmutils.prj;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonWriter;
import org.multicoder.mmutils.Main;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@SuppressWarnings("unused")
public class Container {
    public UUID id;
    public String name;
    public String version;
    public String shortDescription;
    public String authors;
    public String gameVersions;
    public String modLoaders;
    public VCSMappings mappings;
    public List<Updates> modUpdates;
    public List<ModHost>  modHosts;
    public List<PublishedVersion>  publishedVersions;

    public Container(String ...params){
        name = params[0];
        version = params[1];
        authors = params[2];
        gameVersions = params[3];
        modLoaders = params[4];
        shortDescription = params[5];
        id = UUID.randomUUID();
        mappings = new VCSMappings();
        modUpdates = new ArrayList<>();
        modHosts = new ArrayList<>();
        publishedVersions = new ArrayList<>();
    }

    public void WriteToFile(String path){
        try{
            JsonObject object = new JsonObject();
            object.addProperty("name", name);
            object.addProperty("version", version);
            object.addProperty("shortDescription", shortDescription);
            object.addProperty("authors", authors);
            object.addProperty("gameVersions", gameVersions);
            object.addProperty("modLoaders", modLoaders);
            JsonObject vcsMappings = mappings.toJson();
            object.add("mappings", vcsMappings);
            JsonArray updates = new JsonArray();
            modUpdates.forEach(update -> {
                updates.add(update.toJson());
            });
            object.add("updates", updates);
            JsonArray hosts = new JsonArray();
            modHosts.forEach(host -> {
                hosts.add(host.toJson());
            });
            object.add("hosts", hosts);
            JsonArray versions = new JsonArray();
            publishedVersions.forEach(publishedVersion -> {
                versions.add(publishedVersion.toJson());
            });
            object.add("versions", versions);
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            JsonWriter writer = new JsonWriter(new FileWriter(path));
            gson.toJson(object,writer);
            writer.flush();
            writer.close();
        }
        catch (Exception e){
            Main.LOGGER.error("WriteToFile Error: ", e);
        }
    }
}
