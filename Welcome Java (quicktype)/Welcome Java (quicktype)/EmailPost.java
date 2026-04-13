package io.quicktype;

import com.fasterxml.jackson.annotation.*;
import java.util.List;
import java.util.Map;

public class EmailPost {
    private List<String> tags;
    private List<PurpleParameter> parameters;
    private Map<String, PostResponse> responses;
    private RequestBody requestBody;

    @JsonProperty("tags")
    public List<String> getTags() { return tags; }
    @JsonProperty("tags")
    public void setTags(List<String> value) { this.tags = value; }

    @JsonProperty("parameters")
    public List<PurpleParameter> getParameters() { return parameters; }
    @JsonProperty("parameters")
    public void setParameters(List<PurpleParameter> value) { this.parameters = value; }

    @JsonProperty("responses")
    public Map<String, PostResponse> getResponses() { return responses; }
    @JsonProperty("responses")
    public void setResponses(Map<String, PostResponse> value) { this.responses = value; }

    @JsonProperty("requestBody")
    public RequestBody getRequestBody() { return requestBody; }
    @JsonProperty("requestBody")
    public void setRequestBody(RequestBody value) { this.requestBody = value; }
}
