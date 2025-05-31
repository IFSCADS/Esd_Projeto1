package webrun;

import app.ClasseAtendimento;
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

    record ClasseDescricao(char classe, String descricao) {}

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

    @GetMapping(value="/classes", produces="application/json")
    List<ClasseDescricao> classes() {
        ListaSequencial<ClasseAtendimento> l_classes = app.classes();
        ArrayList<ClasseDescricao> result = new ArrayList<>();
//        result.add(new ClasseDescricao('C', "Teste"));

        for (int j=0; j < l_classes.comprimento(); j++) {
            var classe = l_classes.obtem(j);
            result.add(new ClasseDescricao(classe.getCodigo(), classe.getDescricao()));
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
