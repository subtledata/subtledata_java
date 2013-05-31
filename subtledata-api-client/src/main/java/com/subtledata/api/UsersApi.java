package com.subtledata.api;

import com.subtledata.client.ApiException;
import com.subtledata.client.ApiInvoker;
import com.subtledata.api.models.User;
import com.subtledata.api.models.AuthResponse;
import com.subtledata.api.models.Card;
import com.subtledata.api.models.CardStatus;
import com.subtledata.api.models.Status;
import com.subtledata.api.models.NewCard;
import com.subtledata.api.models.NewUser;
import com.subtledata.api.models.DeleteUserStatus;
import com.subtledata.api.models.NewUserDetails;
import com.subtledata.api.models.AuthUserRequest;
import java.util.*;

public class UsersApi {
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

  public NewUser createUser (String api_key, NewUserDetails body) throws ApiException {
    // create path and map variables
    String path = "/users".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(api_key == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    if(!"null".equals(String.valueOf(api_key)))
      queryParams.put("api_key", String.valueOf(api_key));
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, body, headerParams);
      if(response != null){
        return (NewUser) ApiInvoker.deserialize(response, "", NewUser.class);
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
  public User getUser (Integer user_id, String api_key, Boolean use_cache) throws ApiException {
    // create path and map variables
    String path = "/users/{user_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "user_id" + "\\}", apiInvoker.escapeString(user_id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(user_id == null || api_key == null ) {
       throw new ApiException(400, "missing required params");
    }
    if(!"null".equals(String.valueOf(api_key)))
      queryParams.put("api_key", String.valueOf(api_key));
    if(!"null".equals(String.valueOf(use_cache)))
      queryParams.put("use_cache", String.valueOf(use_cache));
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams);
      if(response != null){
        return (User) ApiInvoker.deserialize(response, "", User.class);
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
  public DeleteUserStatus deleteUser (Integer user_id, String api_key) throws ApiException {
    // create path and map variables
    String path = "/users/{user_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "user_id" + "\\}", apiInvoker.escapeString(user_id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(user_id == null || api_key == null ) {
       throw new ApiException(400, "missing required params");
    }
    if(!"null".equals(String.valueOf(api_key)))
      queryParams.put("api_key", String.valueOf(api_key));
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, null, headerParams);
      if(response != null){
        return (DeleteUserStatus) ApiInvoker.deserialize(response, "", DeleteUserStatus.class);
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
  public AuthResponse authUser (String api_key, AuthUserRequest body) throws ApiException {
    // create path and map variables
    String path = "/users/authenticate".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(api_key == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    if(!"null".equals(String.valueOf(api_key)))
      queryParams.put("api_key", String.valueOf(api_key));
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, body, headerParams);
      if(response != null){
        return (AuthResponse) ApiInvoker.deserialize(response, "", AuthResponse.class);
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
  public User searchUsersByName (String user_name, String api_key, Boolean use_cache) throws ApiException {
    // create path and map variables
    String path = "/users/search/name/{user_name}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "user_name" + "\\}", apiInvoker.escapeString(user_name.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(user_name == null || api_key == null ) {
       throw new ApiException(400, "missing required params");
    }
    if(!"null".equals(String.valueOf(api_key)))
      queryParams.put("api_key", String.valueOf(api_key));
    if(!"null".equals(String.valueOf(use_cache)))
      queryParams.put("use_cache", String.valueOf(use_cache));
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams);
      if(response != null){
        return (User) ApiInvoker.deserialize(response, "", User.class);
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
  public List<Card> getUsersCards (Integer user_id, String api_key) throws ApiException {
    // create path and map variables
    String path = "/users/{user_id}/cards".replaceAll("\\{format\\}","json").replaceAll("\\{" + "user_id" + "\\}", apiInvoker.escapeString(user_id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(user_id == null || api_key == null ) {
       throw new ApiException(400, "missing required params");
    }
    if(!"null".equals(String.valueOf(api_key)))
      queryParams.put("api_key", String.valueOf(api_key));
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams);
      if(response != null){
        return (List<Card>) ApiInvoker.deserialize(response, "List", Card.class);
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
  public CardStatus createCardForUser (Integer user_id, String api_key, NewCard body) throws ApiException {
    // create path and map variables
    String path = "/users/{user_id}/cards".replaceAll("\\{format\\}","json").replaceAll("\\{" + "user_id" + "\\}", apiInvoker.escapeString(user_id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(user_id == null || api_key == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    if(!"null".equals(String.valueOf(api_key)))
      queryParams.put("api_key", String.valueOf(api_key));
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, body, headerParams);
      if(response != null){
        return (CardStatus) ApiInvoker.deserialize(response, "", CardStatus.class);
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
  public Status deleteUserCreditCard (Integer user_id, Integer card_id, String api_key) throws ApiException {
    // create path and map variables
    String path = "/users/{user_id}/cards/{card_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "user_id" + "\\}", apiInvoker.escapeString(user_id.toString())).replaceAll("\\{" + "card_id" + "\\}", apiInvoker.escapeString(card_id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(user_id == null || card_id == null || api_key == null ) {
       throw new ApiException(400, "missing required params");
    }
    if(!"null".equals(String.valueOf(api_key)))
      queryParams.put("api_key", String.valueOf(api_key));
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, null, headerParams);
      if(response != null){
        return (Status) ApiInvoker.deserialize(response, "", Status.class);
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

