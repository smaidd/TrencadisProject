package res;

import model.Persoana;
import servicii.AddService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("adauga")
public class AddPersSerb {
    @POST
    @Path("addpers")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Persoana addPers(Persoana persoana) {

        return AddService.getInstance().addPersoana(persoana);
    }
}
