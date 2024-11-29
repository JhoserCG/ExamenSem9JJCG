
package semana09.semana09;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {
    
    @GetMapping("/info")
    public Alumno getAlumno (){
        
        Alumno alumno = new Alumno("Jhoser", "Cordova Garcia", "jhosercordovagmail.com", "Carmen Alto");
      return alumno;
}
    
}
