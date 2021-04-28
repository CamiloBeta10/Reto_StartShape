package co.com.prueba.certificacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.hamcrest.core.IsEqual;

import static co.com.prueba.certificacion.userinterface.CreacionReunioPage.REUNION_CREADA_LABEL;
import static org.junit.Assert.assertThat;

public class Reunion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean blnElemtoExistente = false;
        if (REUNION_CREADA_LABEL.resolveFor(actor).isVisible()) {
            blnElemtoExistente = true;
            assertThat(REUNION_CREADA_LABEL.getName(), Text.of(REUNION_CREADA_LABEL).viewedBy(actor).asString(), IsEqual.equalTo(actor.recall("reunion")));
        }
        return blnElemtoExistente;
    }
    public static Reunion creada(){
        return new Reunion();
    }
}
