package com.devsuperior.movieflix.exception;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class OAuthCustomError {
    private static final long serialVersionUID = 1L;

    private String error;
    @JsonProperty("error_description")
    private String errorDescription;
}
