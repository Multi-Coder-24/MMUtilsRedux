package org.multicoder.mmutils.prj;

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
}
