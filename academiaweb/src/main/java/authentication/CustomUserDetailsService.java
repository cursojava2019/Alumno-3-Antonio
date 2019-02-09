package authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import model.entities.Usuario;
import model.service.UsuarioService;

@Service("autenticacionService")
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UsuarioService usuarioService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Usuario usu = this.usuarioService.buscarUsuario(username);
		if (usu == null) {
			return null;
		}
		MyUserDetails user = new MyUserDetails(usu);
		return user;

	}

}