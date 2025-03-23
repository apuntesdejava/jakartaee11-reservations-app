/*
 * Copyright 2025 dsilva.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.reservations.resources;

import com.example.reservations.request.RoomRequest;
import com.example.reservations.service.RoomService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import static jakarta.ws.rs.core.MediaType.APPLICATION_JSON;
import jakarta.ws.rs.core.Response;

/**
 *
 * @author dsilva
 */
@Path("room")
@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
public class RoomResource {

    @Inject
    private RoomService roomService;

    @GET
    public Response findAll() {
        var list = roomService.list();
        return Response.ok(list).build();
    }

    @POST
    public Response create(RoomRequest room) {
        var created = roomService.create(room);
        return Response.ok(created).build();
    }

}
