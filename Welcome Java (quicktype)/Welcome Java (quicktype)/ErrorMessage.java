package io.quicktype;

import com.fasterxml.jackson.annotation.*;

public class ErrorMessage {
    private Type type;
    private boolean nullable;

    @JsonProperty("type")
    public Type getType() { return type; }
    @JsonProperty("type")
    public void setType(Type value) { this.type = value; }

    @JsonProperty("nullable")
    public boolean getNullable() { return nullable; }
    @JsonProperty("nullable")
    public void setNullable(boolean value) { this.nullable = value; }
}
