package forohub.api.forohub.domain.curso.validaciones;

import forohub.api.forohub.domain.curso.DatosCrearCurso;
import forohub.api.forohub.infra.errores.ValidacionDeIntegridad;
import org.springframework.stereotype.Component;

@Component
public class CategoriaValida implements ValidadorCurso{

    @Override
    public void validar(DatosCrearCurso datos) {
        if (datos.categoria() == null) {
            throw new ValidacionDeIntegridad("Debe asignarle una categoria al curso");
        }
        //Validar Enum

    }
}
