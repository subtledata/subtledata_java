package com.subtledata.api;

import com.subtledata.client.ApiException;
import com.subtledata.client.ApiInvoker;
import com.subtledata.api.models.Country;
import com.subtledata.api.models.State;
import java.util.*;

public class GeneralApi {
  String basePath = "https://api.subtledata.com/v1";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }
  
  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }
  
  public String getBasePath() {
    return basePath;
  }

  public List<Country> getAllCountries (String api_key, Boolean use_cache) throws ApiException {
    // create path and map variables
    String path = "/general/countries".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(api_key == null ) {
       throw new ApiException(400, "missing required params");
    }
    if(!"null".equals(String.valueOf(api_key)))
      queryParams.put("api_key", String.valueOf(api_key));
    if(!"null".equals(String.valueOf(use_cache)))
      queryParams.put("use_cache", String.valueOf(use_cache));
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams);
      if(response != null){
        return (List<Country>) ApiInvoker.deserialize(response, "List", Country.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public List<State> getAllStates (String api_key, Boolean use_cache) throws ApiException {
    // create path and map variables
    String path = "/general/states".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(api_key == null ) {
       throw new ApiException(400, "missing required params");
    }
    if(!"null".equals(String.valueOf(api_key)))
      queryParams.put("api_key", String.valueOf(api_key));
    if(!"null".equals(String.valueOf(use_cache)))
      queryParams.put("use_cache", String.valueOf(use_cache));
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams);
      if(response != null){
        return (List<State>) ApiInvoker.deserialize(response, "List", State.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  }

