package webrun;

import esd.ListaSequencial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import app.App;

@RestController
public class EsdController {

    private App app = new App();

    @PostMapping("/senhas/{classe}")
    ResponseEntity<String> nova_senha(@PathVariable("classe") String classe) {
        ResponseEntity<String> result;

        try {
            result = new ResponseEntity<>(app.adiciona_cliente(classe), HttpStatus.OK);
        } catch (Exception e) {
            result = new ResponseEntity<>("classe inválida", HttpStatus.BAD_REQUEST);
        }

        return result;
    }

    @GetMapping("/classes")
    List<String> classes() {
        ListaSequencial<String> l_classes = app.classes();
        ArrayList<String> result = new ArrayList<>();

        for (int j=0; j < l_classes.comprimento(); j++) {
            result.add(l_classes.obtem(j));
        }

        return result;
    }

    @GetMapping("/senhas")
    ResponseEntity<String> proxima() {
        ResponseEntity<String> result;

        try {
            result = new ResponseEntity<>(app.proxima_senha(), HttpStatus.OK);
        } catch(Exception e) {
            result = new ResponseEntity<>("fila vazia", HttpStatus.BAD_REQUEST);
        }

        return result;
    }
}
