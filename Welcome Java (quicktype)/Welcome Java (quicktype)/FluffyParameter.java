package io.quicktype;

import com.fasterxml.jackson.annotation.*;

public class FluffyParameter {
    private String name;
    private String in;
    private TokenSolicitud schema;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("in")
    public String getIn() { return in; }
    @JsonProperty("in")
    public void setIn(String value) { this.in = value; }

    @JsonProperty("schema")
    public TokenSolicitud getSchema() { return schema; }
    @JsonProperty("schema")
    public void setSchema(TokenSolicitud value) { this.schema = value; }
}
