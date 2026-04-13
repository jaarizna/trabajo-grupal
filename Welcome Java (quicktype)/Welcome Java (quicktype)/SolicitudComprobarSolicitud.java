package io.quicktype;

import com.fasterxml.jackson.annotation.*;

public class SolicitudComprobarSolicitud {
    private SolicitudComprobarSolicitudGet get;

    @JsonProperty("get")
    public SolicitudComprobarSolicitudGet getGet() { return get; }
    @JsonProperty("get")
    public void setGet(SolicitudComprobarSolicitudGet value) { this.get = value; }
}
