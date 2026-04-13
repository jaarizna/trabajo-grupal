package io.quicktype;

import com.fasterxml.jackson.annotation.*;
import java.util.List;
import java.util.Map;

public class SolicitudGetSolicitudesUsuarioGet {
    private List<String> tags;
    private List<PurpleParameter> parameters;
    private Map<String, GetResponse> responses;

    @JsonProperty("tags")
    public List<String> getTags() { return tags; }
    @JsonProperty("tags")
    public void setTags(List<String> value) { this.tags = value; }

    @JsonProperty("parameters")
    public List<PurpleParameter> getParameters() { return parameters; }
    @JsonProperty("parameters")
    public void setParameters(List<PurpleParameter> value) { this.parameters = value; }

    @JsonProperty("responses")
    public Map<String, GetResponse> getResponses() { return responses; }
    @JsonProperty("responses")
    public void setResponses(Map<String, GetResponse> value) { this.responses = value; }
}
