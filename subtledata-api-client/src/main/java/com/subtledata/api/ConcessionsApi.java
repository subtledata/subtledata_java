package com.subtledata.api;

import com.subtledata.client.ApiException;
import com.subtledata.client.ApiInvoker;
import com.subtledata.api.models.ConcessionOrderResults;
import com.subtledata.api.models.ConcessionTicketDetails;
import java.util.*;

public class ConcessionsApi {
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

  public ConcessionOrderResults createConcessionOrder (Integer location_id, String api_key, ConcessionTicketDetails body) throws ApiException {
    // create path and map variables
    String path = "/concessions/{location_id}/order".replaceAll("\\{format\\}","json").replaceAll("\\{" + "location_id" + "\\}", apiInvoker.escapeString(location_id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(location_id == null || api_key == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    if(!"null".equals(String.valueOf(api_key)))
      queryParams.put("api_key", String.valueOf(api_key));
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, body, headerParams);
      if(response != null){
        return (ConcessionOrderResults) ApiInvoker.deserialize(response, "", ConcessionOrderResults.class);
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

