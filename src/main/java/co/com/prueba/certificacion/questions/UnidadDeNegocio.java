package co.com.prueba.certificacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


import static co.com.prueba.certificacion.userinterface.UnidadNegocioPage.NOMBRE_NEGOCIO_LABEL;
import static org.junit.Assert.assertThat;
import org.hamcrest.core.IsEqual;

public class UnidadDeNegocio implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean blnElemtoExistente = false;
        if (NOMBRE_NEGOCIO_LABEL.resolveFor(actor).isVisible()){
            blnElemtoExistente = true;
            assertThat(NOMBRE_NEGOCIO_LABEL.getName(),Text.of(NOMBRE_NEGOCIO_LABEL).viewedBy(actor).asString(),IsEqual.equalTo(actor.recall("unidadNegocio")) );
        }
        return blnElemtoExistente;
    }
    public static UnidadDeNegocio agregada(){
        return new UnidadDeNegocio();
    }
}
