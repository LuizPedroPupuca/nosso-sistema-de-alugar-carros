package br.com.zup.edu.alugacarzup.carro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    public ResponseEntity<?> cadastraCarro(CarroRequest carroRequest) {
        Carro carro = carroRequest.toModel();
        carroRepository.save(carro);
        return ResponseEntity.ok().build();
    }
}
