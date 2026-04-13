package io.quicktype;

import com.fasterxml.jackson.annotation.*;

public class NombreEntidades {
    private String type;
    private Done items;
    private boolean nullable;

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("items")
    public Done getItems() { return items; }
    @JsonProperty("items")
    public void setItems(Done value) { this.items = value; }

    @JsonProperty("nullable")
    public boolean getNullable() { return nullable; }
    @JsonProperty("nullable")
    public void setNullable(boolean value) { this.nullable = value; }
}
