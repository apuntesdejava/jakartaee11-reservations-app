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
package com.example.reservations.entities;

import com.example.reservations.entities.enums.Status;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 *
 * @author dsilva
 */
@Entity
@Table(name = "reservation")
public class ReservationEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private LocalDateTime reservationDate;

        @ManyToOne
        private UserEntity user;

        @ManyToOne
        private HotelEntity hotel;

        @ManyToOne
        private RoomEntity room;

        @ManyToOne
        private RestaurantEntity restaurant;

        @ManyToOne
        private TableEntity table;

        @Enumerated(EnumType.STRING)
        private Status status;

        // Public no-arg constructor
        public ReservationEntity() {
        }

        // Getters and Setters
        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public LocalDateTime getReservationDate() {
                return reservationDate;
        }

        public void setReservationDate(LocalDateTime reservationDate) {
                this.reservationDate = reservationDate;
        }

        public UserEntity getUser() {
                return user;
        }

        public void setUser(UserEntity user) {
                this.user = user;
        }

        public HotelEntity getHotel() {
                return hotel;
        }

        public void setHotel(HotelEntity hotel) {
                this.hotel = hotel;
        }

        public RoomEntity getRoom() {
                return room;
        }

        public void setRoom(RoomEntity room) {
                this.room = room;
        }

        public RestaurantEntity getRestaurant() {
                return restaurant;
        }

        public void setRestaurant(RestaurantEntity restaurant) {
                this.restaurant = restaurant;
        }

        public TableEntity getTable() {
                return table;
        }

        public void setTable(TableEntity table) {
                this.table = table;
        }

        public Status getStatus() {
                return status;
        }

        public void setStatus(Status status) {
                this.status = status;
        }

        @Override
        public boolean equals(Object o) {
                if (o == null || getClass() != o.getClass()) return false;
                ReservationEntity that = (ReservationEntity) o;
                return Objects.equals(id, that.id);
        }

        @Override
        public int hashCode() {
                return Objects.hashCode(id);
        }
}