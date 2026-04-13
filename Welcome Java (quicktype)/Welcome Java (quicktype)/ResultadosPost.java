package io.quicktype;

import com.fasterxml.jackson.annotation.*;
import java.util.List;
import java.util.Map;

public class ResultadosPost {
    private List<String> tags;
    private List<FluffyParameter> parameters;
    private Map<String, PostResponse> responses;

    @JsonProperty("tags")
    public List<String> getTags() { return tags; }
    @JsonProperty("tags")
    public void setTags(List<String> value) { this.tags = value; }

    @JsonProperty("parameters")
    public List<FluffyParameter> getParameters() { return parameters; }
    @JsonProperty("parameters")
    public void setParameters(List<FluffyParameter> value) { this.parameters = value; }

    @JsonProperty("responses")
    public Map<String, PostResponse> getResponses() { return responses; }
    @JsonProperty("responses")
    public void setResponses(Map<String, PostResponse> value) { this.responses = value; }
}
