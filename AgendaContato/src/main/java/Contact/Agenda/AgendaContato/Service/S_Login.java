package Contact.Agenda.AgendaContato.Service;

import Contact.Agenda.AgendaContato.Model.M_Usuario;
import Contact.Agenda.AgendaContato.Repository.R_Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class S_Login {
    @Autowired
    private R_Usuario rUsuario;

    public S_Login(R_Usuario rUsuario) {
        this.rUsuario = rUsuario;
    }

    public M_Usuario validaLogin(String usuario, String senha) {
        return rUsuario.getByUsuarioSenha(usuario, senha);
    }
}
