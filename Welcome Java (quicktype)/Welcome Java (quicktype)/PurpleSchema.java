package io.quicktype;

import com.fasterxml.jackson.annotation.*;

public class PurpleSchema {
    private String type;
    private TokenSolicitud items;
    private Ref ref;

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("items")
    public TokenSolicitud getItems() { return items; }
    @JsonProperty("items")
    public void setItems(TokenSolicitud value) { this.items = value; }

    @JsonProperty("$ref")
    public Ref getRef() { return ref; }
    @JsonProperty("$ref")
    public void setRef(Ref value) { this.ref = value; }
}
