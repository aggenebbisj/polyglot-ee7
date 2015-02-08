package nl.rdj.boundary

import javax.ws.rs.core.MediaType
import javax.ws.rs.{Produces, GET, Path}
import nl.rdj.control.GreetingService

import scala.Array

@Path("ping")
class PingResource {

  @javax.ejb.EJB
  var service: GreetingService = _
  
  @GET
  @Produces(Array(MediaType.APPLICATION_JSON))
  def get(): String = service.greeting

}
