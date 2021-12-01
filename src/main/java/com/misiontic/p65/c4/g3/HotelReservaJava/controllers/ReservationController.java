package com.misiontic.p65.c4.g3.HotelReservaJava.controllers;
import com.misiontic.p65.c4.g3.HotelReservaJava.exceptions.ReservaNotFoundException;
import com.misiontic.p65.c4.g3.HotelReservaJava.models.Reserva;
import com.misiontic.p65.c4.g3.HotelReservaJava.repositories.ReservaRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class ReservationController {
    private final ReservaRepository reservaRepository;

    public ReservationController(ReservaRepository reservaRepository) {
        this.reservaRepository = reservaRepository;
    }
    @GetMapping("/reserva/{username}")
    Reserva getReserva(@PathVariable String username){
        return reservaRepository.findById(username)
                .orElseThrow(()-> new ReservaNotFoundException("No se encontró una Reservación asociada al usuario "+
                        username + "solicitado")
                );
    }
    @PostMapping("/reserva")
    Reserva newReserva(@RequestBody Reserva reserva){
        return reservaRepository.save( reserva );
    }
    @PutMapping("/update/{username}")
    Reserva updateReserva(@RequestBody Reserva reserva) {
        return reservaRepository.save(reserva);
    }
    @DeleteMapping("/reserva/{username}")
    Reserva deleteReserva(@PathVariable String username){
        reservaRepository.delete(Reserva String username);
    }
}
