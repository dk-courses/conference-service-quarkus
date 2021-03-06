package nl.craftsmen.conference.service.quarkus;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class ConferenceResource {

    @Inject
    ConferenceService conferenceService;

    @GET
    @Path("/conferences")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Conference> getAll() {
        return conferenceService.getAll();
    }

    @POST
    @Path("/conferences")
    @Consumes(MediaType.APPLICATION_JSON)
    public void create(Conference conference) {
        conferenceService.create(conference);

    }

    @GET
    @Path("/conferenceswithcountry/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<ExtendedConference> getAllWithCountry() {
        return conferenceService.getAllWithCountry();
    }

}