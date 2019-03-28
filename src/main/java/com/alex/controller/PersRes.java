package com.alex.controller;

import com.alex.services.PersoanaService;
import comj.alex.model.Persoana;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//import javax.ws.rs.*;
//import javax.ws.rs.core.MediaType;
//import java.util.List;

@RestController(value = "/persoane")
public class PersRes {

    @Autowired
    PersoanaService persoanaService;

    @GetMapping(value = "/una")
    public Persoana getPersoane(){
        return persoanaService.gerPersoana(null);
    }
//
//    @GET
//    @Path("getpers")
//    @Produces(MediaType.APPLICATION_JSON)
//    @GetMapping("persoane")
//    public List<Persoana> getPersaoana() {
//        return GetPersoane.getInstance().getPersoane();
//    }
//
//    @POST
//    @Path("addpers")
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)
//    public Persoana addPers(Persoana persoana) {
//
//        return GetPersoane.getInstance().addPersoana(persoana);
//    }
//
//    @PUT
//    @Path("updatepers")
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)
//    public Persoana updatePersoana(Persoana persoana) {
//        return GetPersoane.getInstance().updatePersoana(persoana);
//
//    }
//
//    @DELETE
//    @Path("delete")
//    public Persoana deletePersoana(Persoana persoana) {
//        return GetPersoane.getInstance().deletePersoana(persoana);
//    }

}
