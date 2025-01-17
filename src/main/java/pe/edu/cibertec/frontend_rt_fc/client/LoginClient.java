package pe.edu.cibertec.frontend_rt_fc.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pe.edu.cibertec.frontend_rt_fc.dto.LoginRequestDTO;
import pe.edu.cibertec.frontend_rt_fc.dto.LoginResponseDTO;

@FeignClient(name = "logueo", url = "http://localhost:8081/user")
public interface LoginClient {
    @PostMapping("/autenticar")
    ResponseEntity<LoginResponseDTO> login(@RequestBody LoginRequestDTO loginRequestDTO);
}
