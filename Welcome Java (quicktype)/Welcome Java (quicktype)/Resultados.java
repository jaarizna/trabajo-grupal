package io.quicktype;

import com.fasterxml.jackson.annotation.*;

public class Resultados {
    private ResultadosPost post;

    @JsonProperty("post")
    public ResultadosPost getPost() { return post; }
    @JsonProperty("post")
    public void setPost(ResultadosPost value) { this.post = value; }
}
