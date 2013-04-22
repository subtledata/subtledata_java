package com.subtledata.api;

import com.subtledata.client.ApiException;
import com.subtledata.client.ApiInvoker;
import com.subtledata.api.models.Category;
import com.subtledata.api.models.TableDetails;
import com.subtledata.api.models.ConnectStatus;
import com.subtledata.api.models.TableMinimal;
import com.subtledata.api.models.PaymentStatus;
import com.subtledata.api.models.User;
import com.subtledata.api.models.ItemToAdd;
import com.subtledata.api.models.OrderResults;
import com.subtledata.api.models.NewExternalPayment;
import com.subtledata.api.models.Location;
import com.subtledata.api.models.NewTicket;
import com.subtledata.api.models.DiscountInfo;
import com.subtledata.api.models.Status;
import com.subtledata.api.models.ExternalPaymentStatus;
import com.subtledata.api.models.NewPayment;
import com.subtledata.api.models.Employee;
import com.subtledata.api.models.TicketStatus;
import com.subtledata.api.models.Ticket;
import com.subtledata.api.models.NewConnection;
import java.util.*;

public class LocationsApi {
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

  public List<Location> getAllLocations (String api_key, Boolean use_cache) throws ApiException {
    // create path and map variables
    String path = "/locations".replaceAll("\\{format\\}","json");

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
        return (List<Location>) ApiInvoker.deserialize(response, "List", Location.class);
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
  public List<Location> getLocationsNear (String api_key, Boolean use_cache, Float latitude, Float longitude, Float radius) throws ApiException {
    // create path and map variables
    String path = "/locations/filter/near".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(api_key == null || latitude == null || longitude == null || radius == null ) {
       throw new ApiException(400, "missing required params");
    }
    if(!"null".equals(String.valueOf(api_key)))
      queryParams.put("api_key", String.valueOf(api_key));
    if(!"null".equals(String.valueOf(use_cache)))
      queryParams.put("use_cache", String.valueOf(use_cache));
    if(!"null".equals(String.valueOf(latitude)))
      queryParams.put("latitude", String.valueOf(latitude));
    if(!"null".equals(String.valueOf(longitude)))
      queryParams.put("longitude", String.valueOf(longitude));
    if(!"null".equals(String.valueOf(radius)))
      queryParams.put("radius", String.valueOf(radius));
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams);
      if(response != null){
        return (List<Location>) ApiInvoker.deserialize(response, "List", Location.class);
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
  public Location getLocation (Integer location_id, String api_key, Boolean use_cache) throws ApiException {
    // create path and map variables
    String path = "/locations/{location_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "location_id" + "\\}", apiInvoker.escapeString(location_id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(location_id == null || api_key == null ) {
       throw new ApiException(400, "missing required params");
    }
    if(!"null".equals(String.valueOf(api_key)))
      queryParams.put("api_key", String.valueOf(api_key));
    if(!"null".equals(String.valueOf(use_cache)))
      queryParams.put("use_cache", String.valueOf(use_cache));
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams);
      if(response != null){
        return (Location) ApiInvoker.deserialize(response, "", Location.class);
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
  public List<Category> getLocationMenu (Integer location_id, String api_key, Boolean use_cache) throws ApiException {
    // create path and map variables
    String path = "/locations/{location_id}/menu".replaceAll("\\{format\\}","json").replaceAll("\\{" + "location_id" + "\\}", apiInvoker.escapeString(location_id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(location_id == null || api_key == null ) {
       throw new ApiException(400, "missing required params");
    }
    if(!"null".equals(String.valueOf(api_key)))
      queryParams.put("api_key", String.valueOf(api_key));
    if(!"null".equals(String.valueOf(use_cache)))
      queryParams.put("use_cache", String.valueOf(use_cache));
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams);
      if(response != null){
        return (List<Category>) ApiInvoker.deserialize(response, "List", Category.class);
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
  public List<Employee> getLocationEmployees (Integer location_id, String api_key, Integer manager_id, Integer revenue_center_id) throws ApiException {
    // create path and map variables
    String path = "/locations/{location_id}/employees".replaceAll("\\{format\\}","json").replaceAll("\\{" + "location_id" + "\\}", apiInvoker.escapeString(location_id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(location_id == null || api_key == null || manager_id == null ) {
       throw new ApiException(400, "missing required params");
    }
    if(!"null".equals(String.valueOf(api_key)))
      queryParams.put("api_key", String.valueOf(api_key));
    if(!"null".equals(String.valueOf(manager_id)))
      queryParams.put("manager_id", String.valueOf(manager_id));
    if(!"null".equals(String.valueOf(revenue_center_id)))
      queryParams.put("revenue_center_id", String.valueOf(revenue_center_id));
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams);
      if(response != null){
        return (List<Employee>) ApiInvoker.deserialize(response, "List", Employee.class);
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
  public List<TableMinimal> getTableList (Integer location_id, String api_key, Boolean use_cache) throws ApiException {
    // create path and map variables
    String path = "/locations/{location_id}/tables".replaceAll("\\{format\\}","json").replaceAll("\\{" + "location_id" + "\\}", apiInvoker.escapeString(location_id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(location_id == null || api_key == null ) {
       throw new ApiException(400, "missing required params");
    }
    if(!"null".equals(String.valueOf(api_key)))
      queryParams.put("api_key", String.valueOf(api_key));
    if(!"null".equals(String.valueOf(use_cache)))
      queryParams.put("use_cache", String.valueOf(use_cache));
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams);
      if(response != null){
        return (List<TableMinimal>) ApiInvoker.deserialize(response, "List", TableMinimal.class);
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
  public List<Ticket> getTickets (Integer location_id, String api_key) throws ApiException {
    // create path and map variables
    String path = "/locations/{location_id}/tickets".replaceAll("\\{format\\}","json").replaceAll("\\{" + "location_id" + "\\}", apiInvoker.escapeString(location_id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(location_id == null || api_key == null ) {
       throw new ApiException(400, "missing required params");
    }
    if(!"null".equals(String.valueOf(api_key)))
      queryParams.put("api_key", String.valueOf(api_key));
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams);
      if(response != null){
        return (List<Ticket>) ApiInvoker.deserialize(response, "List", Ticket.class);
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
  public TicketStatus createTicket (Integer location_id, String api_key, String ticket_type, NewTicket body) throws ApiException {
    // create path and map variables
    String path = "/locations/{location_id}/tickets".replaceAll("\\{format\\}","json").replaceAll("\\{" + "location_id" + "\\}", apiInvoker.escapeString(location_id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(location_id == null || api_key == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    if(!"null".equals(String.valueOf(api_key)))
      queryParams.put("api_key", String.valueOf(api_key));
    if(!"null".equals(String.valueOf(ticket_type)))
      queryParams.put("ticket_type", String.valueOf(ticket_type));
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, body, headerParams);
      if(response != null){
        return (TicketStatus) ApiInvoker.deserialize(response, "", TicketStatus.class);
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
  public TableDetails getTable (Integer location_id, Integer table_id, String api_key) throws ApiException {
    // create path and map variables
    String path = "/locations/{location_id}/tables/{table_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "location_id" + "\\}", apiInvoker.escapeString(location_id.toString())).replaceAll("\\{" + "table_id" + "\\}", apiInvoker.escapeString(table_id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(location_id == null || table_id == null || api_key == null ) {
       throw new ApiException(400, "missing required params");
    }
    if(!"null".equals(String.valueOf(api_key)))
      queryParams.put("api_key", String.valueOf(api_key));
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams);
      if(response != null){
        return (TableDetails) ApiInvoker.deserialize(response, "", TableDetails.class);
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
  public Ticket getTicket (Integer location_id, Integer ticket_id, String api_key, Integer user_id) throws ApiException {
    // create path and map variables
    String path = "/locations/{location_id}/tickets/{ticket_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "location_id" + "\\}", apiInvoker.escapeString(location_id.toString())).replaceAll("\\{" + "ticket_id" + "\\}", apiInvoker.escapeString(ticket_id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(location_id == null || ticket_id == null || api_key == null ) {
       throw new ApiException(400, "missing required params");
    }
    if(!"null".equals(String.valueOf(api_key)))
      queryParams.put("api_key", String.valueOf(api_key));
    if(!"null".equals(String.valueOf(user_id)))
      queryParams.put("user_id", String.valueOf(user_id));
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams);
      if(response != null){
        return (Ticket) ApiInvoker.deserialize(response, "", Ticket.class);
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
  public Status voidTicket (Integer location_id, Integer ticket_id, String api_key, Integer user_id) throws ApiException {
    // create path and map variables
    String path = "/locations/{location_id}/tickets/{ticket_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "location_id" + "\\}", apiInvoker.escapeString(location_id.toString())).replaceAll("\\{" + "ticket_id" + "\\}", apiInvoker.escapeString(ticket_id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(location_id == null || ticket_id == null || api_key == null ) {
       throw new ApiException(400, "missing required params");
    }
    if(!"null".equals(String.valueOf(api_key)))
      queryParams.put("api_key", String.valueOf(api_key));
    if(!"null".equals(String.valueOf(user_id)))
      queryParams.put("user_id", String.valueOf(user_id));
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
  public Ticket getTicketWithPOS_ID (Integer location_id, Integer pos_ticket_id, String api_key, Integer user_id) throws ApiException {
    // create path and map variables
    String path = "/locations/{location_id}/tickets/pos/{pos_ticket_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "location_id" + "\\}", apiInvoker.escapeString(location_id.toString())).replaceAll("\\{" + "pos_ticket_id" + "\\}", apiInvoker.escapeString(pos_ticket_id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(location_id == null || pos_ticket_id == null || api_key == null ) {
       throw new ApiException(400, "missing required params");
    }
    if(!"null".equals(String.valueOf(api_key)))
      queryParams.put("api_key", String.valueOf(api_key));
    if(!"null".equals(String.valueOf(user_id)))
      queryParams.put("user_id", String.valueOf(user_id));
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams);
      if(response != null){
        return (Ticket) ApiInvoker.deserialize(response, "", Ticket.class);
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
  public OrderResults submitOrder (Integer location_id, Integer ticket_id, Integer user_id, String api_key) throws ApiException {
    // create path and map variables
    String path = "/locations/{location_id}/tickets/{ticket_id}/users/{user_id}/order".replaceAll("\\{format\\}","json").replaceAll("\\{" + "location_id" + "\\}", apiInvoker.escapeString(location_id.toString())).replaceAll("\\{" + "ticket_id" + "\\}", apiInvoker.escapeString(ticket_id.toString())).replaceAll("\\{" + "user_id" + "\\}", apiInvoker.escapeString(user_id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(location_id == null || ticket_id == null || user_id == null || api_key == null ) {
       throw new ApiException(400, "missing required params");
    }
    if(!"null".equals(String.valueOf(api_key)))
      queryParams.put("api_key", String.valueOf(api_key));
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, null, headerParams);
      if(response != null){
        return (OrderResults) ApiInvoker.deserialize(response, "", OrderResults.class);
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
  public Status addItemsToOrder (Integer location_id, Integer ticket_id, Integer user_id, String api_key, ItemToAdd body) throws ApiException {
    // create path and map variables
    String path = "/locations/{location_id}/tickets/{ticket_id}/users/{user_id}/order".replaceAll("\\{format\\}","json").replaceAll("\\{" + "location_id" + "\\}", apiInvoker.escapeString(location_id.toString())).replaceAll("\\{" + "ticket_id" + "\\}", apiInvoker.escapeString(ticket_id.toString())).replaceAll("\\{" + "user_id" + "\\}", apiInvoker.escapeString(user_id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(location_id == null || ticket_id == null || user_id == null || api_key == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    if(!"null".equals(String.valueOf(api_key)))
      queryParams.put("api_key", String.valueOf(api_key));
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, body, headerParams);
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
  public List<User> getUsersConnectedToTicket (Integer location_id, Integer ticket_id, String api_key) throws ApiException {
    // create path and map variables
    String path = "/locations/{location_id}/tickets/{ticket_id}/users".replaceAll("\\{format\\}","json").replaceAll("\\{" + "location_id" + "\\}", apiInvoker.escapeString(location_id.toString())).replaceAll("\\{" + "ticket_id" + "\\}", apiInvoker.escapeString(ticket_id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(location_id == null || ticket_id == null || api_key == null ) {
       throw new ApiException(400, "missing required params");
    }
    if(!"null".equals(String.valueOf(api_key)))
      queryParams.put("api_key", String.valueOf(api_key));
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams);
      if(response != null){
        return (List<User>) ApiInvoker.deserialize(response, "List", User.class);
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
  public ConnectStatus connectUserToTicket (Integer location_id, Integer ticket_id, String api_key, NewConnection body) throws ApiException {
    // create path and map variables
    String path = "/locations/{location_id}/tickets/{ticket_id}/users".replaceAll("\\{format\\}","json").replaceAll("\\{" + "location_id" + "\\}", apiInvoker.escapeString(location_id.toString())).replaceAll("\\{" + "ticket_id" + "\\}", apiInvoker.escapeString(ticket_id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(location_id == null || ticket_id == null || api_key == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    if(!"null".equals(String.valueOf(api_key)))
      queryParams.put("api_key", String.valueOf(api_key));
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, body, headerParams);
      if(response != null){
        return (ConnectStatus) ApiInvoker.deserialize(response, "", ConnectStatus.class);
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
  public Status discountTicket (Integer location_id, Integer ticket_id, String api_key, DiscountInfo body) throws ApiException {
    // create path and map variables
    String path = "/locations/{location_id}/tickets/{ticket_id}/discount".replaceAll("\\{format\\}","json").replaceAll("\\{" + "location_id" + "\\}", apiInvoker.escapeString(location_id.toString())).replaceAll("\\{" + "ticket_id" + "\\}", apiInvoker.escapeString(ticket_id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(location_id == null || ticket_id == null || api_key == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    if(!"null".equals(String.valueOf(api_key)))
      queryParams.put("api_key", String.valueOf(api_key));
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, body, headerParams);
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
  public PaymentStatus addPaymentToTicket (Integer location_id, Integer ticket_id, String api_key, NewPayment body) throws ApiException {
    // create path and map variables
    String path = "/locations/{location_id}/tickets/{ticket_id}/payments".replaceAll("\\{format\\}","json").replaceAll("\\{" + "location_id" + "\\}", apiInvoker.escapeString(location_id.toString())).replaceAll("\\{" + "ticket_id" + "\\}", apiInvoker.escapeString(ticket_id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(location_id == null || ticket_id == null || api_key == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    if(!"null".equals(String.valueOf(api_key)))
      queryParams.put("api_key", String.valueOf(api_key));
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, body, headerParams);
      if(response != null){
        return (PaymentStatus) ApiInvoker.deserialize(response, "", PaymentStatus.class);
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
  public ExternalPaymentStatus addExternalPaymentToTicket (Integer location_id, Integer ticket_id, String api_key, NewExternalPayment body) throws ApiException {
    // create path and map variables
    String path = "/locations/{location_id}/tickets/{ticket_id}/payments/external".replaceAll("\\{format\\}","json").replaceAll("\\{" + "location_id" + "\\}", apiInvoker.escapeString(location_id.toString())).replaceAll("\\{" + "ticket_id" + "\\}", apiInvoker.escapeString(ticket_id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(location_id == null || ticket_id == null || api_key == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    if(!"null".equals(String.valueOf(api_key)))
      queryParams.put("api_key", String.valueOf(api_key));
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, body, headerParams);
      if(response != null){
        return (ExternalPaymentStatus) ApiInvoker.deserialize(response, "", ExternalPaymentStatus.class);
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

