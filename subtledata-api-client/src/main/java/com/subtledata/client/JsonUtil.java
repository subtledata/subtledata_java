package com.subtledata.client;

import com.fasterxml.jackson.core.JsonGenerator.Feature;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class JsonUtil {
	static ObjectMapper MAPPER = null;

	static {
    MAPPER = new ObjectMapper();
    MAPPER.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    MAPPER.setSerializationInclusion(JsonInclude.Include.NON_DEFAULT);
    MAPPER.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
    MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    MAPPER.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
	}

  public static ObjectMapper getJsonMapper() {
  	return MAPPER;
  }
}
