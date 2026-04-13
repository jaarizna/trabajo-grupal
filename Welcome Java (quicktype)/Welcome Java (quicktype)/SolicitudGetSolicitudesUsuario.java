package io.quicktype;

import com.fasterxml.jackson.annotation.*;

public class SolicitudGetSolicitudesUsuario {
    private SolicitudGetSolicitudesUsuarioGet get;

    @JsonProperty("get")
    public SolicitudGetSolicitudesUsuarioGet getGet() { return get; }
    @JsonProperty("get")
    public void setGet(SolicitudGetSolicitudesUsuarioGet value) { this.get = value; }
}
