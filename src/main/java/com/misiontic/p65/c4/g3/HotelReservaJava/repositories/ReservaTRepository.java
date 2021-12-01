package com.misiontic.p65.c4.g3.HotelReservaJava.repositories;
import com.misiontic.p65.c4.g3.HotelReservaJava.models.ReservaT;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ReservaTRepository extends MongoRepository<ReservaT, String>{
    List <ReservaT> findByReservationUsername(String reservationUsername);
    List <ReservaT> findByReservationHabitation(String reservationHabitation);
}
