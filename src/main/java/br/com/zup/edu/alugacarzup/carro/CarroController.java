package br.com.zup.edu.alugacarzup.carro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import javax.validation.Valid;

@RestController
@RequestMapping("/carro")
public class CarroController {

    @Autowired
    private CarroService carroService;

    @PostMapping
    @Transactional
    public ResponseEntity<?> salvaCarro(@RequestBody @Valid CarroRequest carroRequest){
        return carroService.cadastraCarro(carroRequest);
    }
}
