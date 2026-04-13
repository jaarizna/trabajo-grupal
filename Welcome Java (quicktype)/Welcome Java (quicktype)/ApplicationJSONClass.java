package io.quicktype;

import com.fasterxml.jackson.annotation.*;

public class ApplicationJSONClass {
    private ApplicationJSONSchema schema;

    @JsonProperty("schema")
    public ApplicationJSONSchema getSchema() { return schema; }
    @JsonProperty("schema")
    public void setSchema(ApplicationJSONSchema value) { this.schema = value; }
}
