package io.quicktype;

import com.fasterxml.jackson.annotation.*;

public class Paths {
    private Email email;
    private Resultados resultados;
    private Email solicitudSolicitar;
    private SolicitudGetSolicitudesUsuario solicitudGetSolicitudesUsuario;
    private SolicitudComprobarSolicitud solicitudComprobarSolicitud;

    @JsonProperty("/Email")
    public Email getEmail() { return email; }
    @JsonProperty("/Email")
    public void setEmail(Email value) { this.email = value; }

    @JsonProperty("/Resultados")
    public Resultados getResultados() { return resultados; }
    @JsonProperty("/Resultados")
    public void setResultados(Resultados value) { this.resultados = value; }

    @JsonProperty("/Solicitud/Solicitar")
    public Email getSolicitudSolicitar() { return solicitudSolicitar; }
    @JsonProperty("/Solicitud/Solicitar")
    public void setSolicitudSolicitar(Email value) { this.solicitudSolicitar = value; }

    @JsonProperty("/Solicitud/GetSolicitudesUsuario")
    public SolicitudGetSolicitudesUsuario getSolicitudGetSolicitudesUsuario() { return solicitudGetSolicitudesUsuario; }
    @JsonProperty("/Solicitud/GetSolicitudesUsuario")
    public void setSolicitudGetSolicitudesUsuario(SolicitudGetSolicitudesUsuario value) { this.solicitudGetSolicitudesUsuario = value; }

    @JsonProperty("/Solicitud/ComprobarSolicitud")
    public SolicitudComprobarSolicitud getSolicitudComprobarSolicitud() { return solicitudComprobarSolicitud; }
    @JsonProperty("/Solicitud/ComprobarSolicitud")
    public void setSolicitudComprobarSolicitud(SolicitudComprobarSolicitud value) { this.solicitudComprobarSolicitud = value; }
}
