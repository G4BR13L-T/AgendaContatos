package Contact.Agenda.AgendaContato.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class C_Cadastro {
    @GetMapping("/cadastro")
    public String getCadastro(){
        return "cadastro/cadastro";
    }

    @PostMapping("/cadastro")
    public String postCadastro(@RequestParam("usuario")String usuario,
                               @RequestParam("email")String email,
                               @RequestParam("confEmail") String confEmail,
                               @RequestParam("senha")String senha,
                               @RequestParam("confSenha")String confSenha){
        return "cadastro/cadastro";
    }
}
