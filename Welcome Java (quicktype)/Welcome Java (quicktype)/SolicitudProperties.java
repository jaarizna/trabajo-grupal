package io.quicktype;

import com.fasterxml.jackson.annotation.*;

public class SolicitudProperties {
    private CantidadesIniciales cantidadesIniciales;
    private NombreEntidades nombreEntidades;

    @JsonProperty("cantidadesIniciales")
    public CantidadesIniciales getCantidadesIniciales() { return cantidadesIniciales; }
    @JsonProperty("cantidadesIniciales")
    public void setCantidadesIniciales(CantidadesIniciales value) { this.cantidadesIniciales = value; }

    @JsonProperty("nombreEntidades")
    public NombreEntidades getNombreEntidades() { return nombreEntidades; }
    @JsonProperty("nombreEntidades")
    public void setNombreEntidades(NombreEntidades value) { this.nombreEntidades = value; }
}
