package com.kt.cxf.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

/**
 * User rest web service.
 * 
 * @author sofien
 *
 */
@Path("/user")
@Api(value = "/user", description = "User rest web service")
public interface UserService {
  
  @GET
  @Path("/{id}/address")
  @Produces(MediaType.APPLICATION_JSON)
  @ApiOperation(value = "Get user addresses - USR01", response = Address.class)
  public List<Address> getUserAddresses();

  @GET
  @Path("/{id}")
  @Produces(MediaType.APPLICATION_JSON)
  @ApiOperation(value = "Get user - USR02", response = User.class)
  public User getUser(@PathParam("id") Long id);

  @DELETE
  @Path("/{id}")
  @ApiOperation(value = "Delete user - USR03")
  public void deleteUser(@PathParam("id") Long id);

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  @ApiOperation(value = "Save new user - USR04", response = User.class)
  public User saveUser(User user);

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  @ApiOperation(value = "Update user - USR05")
  public void updateUser(User user);



}
