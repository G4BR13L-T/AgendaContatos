package Contact.Agenda.AgendaContato.Controller;

import Contact.Agenda.AgendaContato.Model.M_Usuario;
import Contact.Agenda.AgendaContato.Service.S_Login;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class C_Login {
    private final S_Login sLogin;

    public C_Login(S_Login sLogin) {
        this.sLogin = sLogin;
    }

    @GetMapping("/")
    public String getLogin(HttpSession session, Model model) {
        return "index";
    }

    @PostMapping("/")
    public String postLogin(@RequestParam("usuario") String usuario,
                            @RequestParam("senha") String senha,
                            HttpSession session) {
        M_Usuario mUsuario = sLogin.validaLogin(usuario, senha);
        session.setAttribute("usuario", mUsuario);
        return "redirect:/";
    }
}
