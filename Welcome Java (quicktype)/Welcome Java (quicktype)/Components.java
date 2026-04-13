package io.quicktype;

import com.fasterxml.jackson.annotation.*;

public class Components {
    private Schemas schemas;

    @JsonProperty("schemas")
    public Schemas getSchemas() { return schemas; }
    @JsonProperty("schemas")
    public void setSchemas(Schemas value) { this.schemas = value; }
}
