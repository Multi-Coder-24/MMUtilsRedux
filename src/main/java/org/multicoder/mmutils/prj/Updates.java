package org.multicoder.mmutils.prj;

import org.w3c.dom.Element;

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

    public void serialize(Element container){
        container.setAttribute("name", name);
        container.setAttribute("id", id.toString());
        container.setAttribute("dateStamp", dateStamp);
        container.setAttribute("type", String.valueOf(type.ordinal()));
        container.setTextContent(content);
    }
}
