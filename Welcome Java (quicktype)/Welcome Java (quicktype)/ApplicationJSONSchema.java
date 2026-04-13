package io.quicktype;

import com.fasterxml.jackson.annotation.*;

public class ApplicationJSONSchema {
    private Ref ref;

    @JsonProperty("$ref")
    public Ref getRef() { return ref; }
    @JsonProperty("$ref")
    public void setRef(Ref value) { this.ref = value; }
}
