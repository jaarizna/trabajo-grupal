package io.quicktype;

import com.fasterxml.jackson.annotation.*;

public class PurpleApplicationJSON {
    private PurpleSchema schema;

    @JsonProperty("schema")
    public PurpleSchema getSchema() { return schema; }
    @JsonProperty("schema")
    public void setSchema(PurpleSchema value) { this.schema = value; }
}
