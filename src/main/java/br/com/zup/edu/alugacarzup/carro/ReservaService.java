package br.com.zup.edu.alugacarzup.carro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReservaService {

    @Autowired
    private CarroRepository carroRepository;

    @Autowired
    private ReservaRepository reservaRepository;

    public ResponseEntity<?> cadastraReserva(ReservaRequest reservaRequest){
        Optional<Carro> possivelCarro = carroRepository.findById(reservaRequest.getIdCarro());
        if(possivelCarro.isEmpty()) return ResponseEntity.notFound().build();
        Carro carro = possivelCarro.get();
        if(!carro.isDisponivel()) return ResponseEntity.unprocessableEntity().build();
        carro.reservaCarro(reservaRequest.getReservadoPara());
        reservaRepository.save(reservaRequest.toModel(carro));
        return ResponseEntity.ok().build();
    }
}
