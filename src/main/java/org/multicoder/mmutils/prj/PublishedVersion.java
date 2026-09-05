package org.multicoder.mmutils.prj;

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
}
