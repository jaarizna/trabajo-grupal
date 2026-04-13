package io.quicktype;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Welcome {
    private String openapi;
    private Info info;
    private Paths paths;
    private Components components;
    private List<Tag> tags;

    @JsonProperty("openapi")
    public String getOpenapi() { return openapi; }
    @JsonProperty("openapi")
    public void setOpenapi(String value) { this.openapi = value; }

    @JsonProperty("info")
    public Info getInfo() { return info; }
    @JsonProperty("info")
    public void setInfo(Info value) { this.info = value; }

    @JsonProperty("paths")
    public Paths getPaths() { return paths; }
    @JsonProperty("paths")
    public void setPaths(Paths value) { this.paths = value; }

    @JsonProperty("components")
    public Components getComponents() { return components; }
    @JsonProperty("components")
    public void setComponents(Components value) { this.components = value; }

    @JsonProperty("tags")
    public List<Tag> getTags() { return tags; }
    @JsonProperty("tags")
    public void setTags(List<Tag> value) { this.tags = value; }
}
