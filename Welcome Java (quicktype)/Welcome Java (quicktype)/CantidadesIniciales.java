package io.quicktype;

import com.fasterxml.jackson.annotation.*;

public class CantidadesIniciales {
    private String type;
    private TokenSolicitud items;
    private boolean nullable;

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("items")
    public TokenSolicitud getItems() { return items; }
    @JsonProperty("items")
    public void setItems(TokenSolicitud value) { this.items = value; }

    @JsonProperty("nullable")
    public boolean getNullable() { return nullable; }
    @JsonProperty("nullable")
    public void setNullable(boolean value) { this.nullable = value; }
}
