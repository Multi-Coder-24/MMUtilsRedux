package org.multicoder.mmutils.prj;

import org.w3c.dom.Element;

import java.util.UUID;

@SuppressWarnings("unused")
public class PublishedVersion {
    public String version;
    public UUID id;
    public UUID hostingPlatformID;
    public String hostingPlatformURL;
    public String changelog;
    public String dateStamp;

    public PublishedVersion(String ...params){
        version = params[0];
        hostingPlatformID = UUID.fromString(params[1]);
        hostingPlatformURL = params[2];
        changelog = params[3];
        dateStamp = params[4];
        id = UUID.randomUUID();
    }
    public void serialize(Element container){
        container.setAttribute("version", version);
        container.setAttribute("hostingPlatform", hostingPlatformID.toString());
        container.setAttribute("hostingPlatformURL", hostingPlatformURL);
        container.setAttribute("changelog", changelog);
        container.setAttribute("dateStamp", dateStamp);
    }
}
