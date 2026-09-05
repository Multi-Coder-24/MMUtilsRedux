package org.multicoder.mmutils.prj;

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
}
