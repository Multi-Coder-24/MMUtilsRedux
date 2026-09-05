package org.multicoder.mmutils.prj;

import org.multicoder.mmutils.Main;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.FileOutputStream;
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
    public List<VCSMappings> mappings;
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
        mappings = new ArrayList<>();
        modUpdates = new ArrayList<>();
        modHosts = new ArrayList<>();
        publishedVersions = new ArrayList<>();
    }

    public void WriteFile(String path){
        try {
            //Create blank document and container elements
            Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            Element rootElement = document.createElement("root");
            Element modInfoElement = document.createElement("ModInfo");
            Element mappingsElement = document.createElement("Mappings");
            Element publishingElement = document.createElement("Publishing");
            Element publishedVersionsElement = document.createElement("PublishedVersions");
            Element updatesElement = document.createElement("Updates");
            //Add ModInfo from Container into Element
            modInfoElement.setAttribute("name", name);
            modInfoElement.setAttribute("version", version);
            modInfoElement.setAttribute("authors", authors);
            modInfoElement.setAttribute("gameVersions", gameVersions);
            modInfoElement.setAttribute("modLoaders", modLoaders);
            modInfoElement.setAttribute("id",id.toString());
            modInfoElement.setAttribute("shortDescription", shortDescription);
            //Add Mapping Data
            mappings.forEach((mapping) -> {
                Element mappingElement = document.createElement("Mapping");
                mapping.serialize(mappingElement);
                mappingsElement.appendChild(mappingElement);
            });
            //Add ModHost Data
            modHosts.forEach((modHost) -> {
                Element modHostElement = document.createElement("ModHost");
                modHost.serialize(modHostElement);
                publishingElement.appendChild(modHostElement);
            });
            //Add Published Version Data
            publishedVersions.forEach(publishedVersion -> {
                Element publishedVersionElement = document.createElement("Version");
                publishedVersion.serialize(publishedVersionElement);
                publishedVersionsElement.appendChild(publishedVersionElement);
            });
            publishingElement.appendChild(publishedVersionsElement);
            //Add Updates Data
            modUpdates.forEach((modUpdate) -> {
                Element modUpdateElement = document.createElement("Update");
                updatesElement.appendChild(modUpdateElement);
            });
            rootElement.appendChild(modInfoElement);
            rootElement.appendChild(mappingsElement);
            rootElement.appendChild(publishingElement);
            rootElement.appendChild(updatesElement);
            document.appendChild(rootElement);
            FileOutputStream fos = new FileOutputStream(path);
            fos.write(document.toString().getBytes());
            fos.flush();
            fos.close();

        } catch (Exception e) {
            Main.LOGGER.error("Error writing file: {}", path, e);
        }
    }
}
