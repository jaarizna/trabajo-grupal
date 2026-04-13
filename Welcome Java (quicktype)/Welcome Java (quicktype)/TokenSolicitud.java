package io.quicktype;

import com.fasterxml.jackson.annotation.*;

public class TokenSolicitud {
    private Type type;
    private Format format;

    @JsonProperty("type")
    public Type getType() { return type; }
    @JsonProperty("type")
    public void setType(Type value) { this.type = value; }

    @JsonProperty("format")
    public Format getFormat() { return format; }
    @JsonProperty("format")
    public void setFormat(Format value) { this.format = value; }
}
