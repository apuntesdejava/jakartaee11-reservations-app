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
package com.example.reservations.service;

import com.example.reservations.dto.RoomDto;
import com.example.reservations.entities.RoomEntity;
import com.example.reservations.repositories.RoomRepository;
import com.example.reservations.request.RoomRequest;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import java.util.List;

/**
 *
 * @author dsilva
 */
@ApplicationScoped
public class RoomService {

    @Inject
    private RoomRepository roomRepository;

    public RoomDto create(RoomRequest room) {
        var entity = RoomEntity.fromRequest(room);
        var created = roomRepository.insert(entity);
        return RoomDto.fromEntity(created);
    }

    public List<RoomDto> list() {
        return roomRepository.findAll()
                .map(RoomDto::fromEntity)
                .toList();
    }
}
