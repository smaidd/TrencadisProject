package res;

import model.Persoana;
import servicii.AddService;
import servicii.GetPersoane;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("persoane")
public class PersRes {

    @GET
    @Path("getpers")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Persoana> getPersaoana() {
        List<Persoana> persoane = GetPersoane.getInstance().getPersoane();
        return persoane;
    }

}
