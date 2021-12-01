package com.misiontic.p65.c4.g3.HotelReservaJava.repositories;
import com.misiontic.p65.c4.g3.HotelReservaJava.models.Reserva;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ReservaRepository extends MongoRepository<Reserva, String>{

}
