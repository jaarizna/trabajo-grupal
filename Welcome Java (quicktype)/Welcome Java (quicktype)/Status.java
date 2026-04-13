package io.quicktype;

import com.fasterxml.jackson.annotation.*;

public class Status {
    private Type type;
    private Format format;
    private boolean nullable;

    @JsonProperty("type")
    public Type getType() { return type; }
    @JsonProperty("type")
    public void setType(Type value) { this.type = value; }

    @JsonProperty("format")
    public Format getFormat() { return format; }
    @JsonProperty("format")
    public void setFormat(Format value) { this.format = value; }

    @JsonProperty("nullable")
    public boolean getNullable() { return nullable; }
    @JsonProperty("nullable")
    public void setNullable(boolean value) { this.nullable = value; }
}
