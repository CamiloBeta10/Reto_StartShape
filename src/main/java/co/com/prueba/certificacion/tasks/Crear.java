package co.com.prueba.certificacion.tasks;

import co.com.prueba.certificacion.model.DatoPrueba;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.prueba.certificacion.userinterface.CreacionReunioPage.*;
import static java.util.concurrent.TimeUnit.SECONDS;

public class Crear implements Task {

    private List<DatoPrueba> data;

    public Crear( List<DatoPrueba> data){
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor).getDriver().manage().timeouts().implicitlyWait(5, SECONDS);
        actor.attemptsTo(
                Click.on(REUNION_BUTTON),
                Click.on(REUNIONES_BUTTON),
                Click.on(NUEVA_REUNION_BUTTON),
                Enter.theValue(data.get(0).getReunion()).into(NOMBRE_REUNION_BOX),
                Click.on(TIPO_REUNION_BOX),
                Enter.theValue(data.get(0).getTipo()).into(NAME_RUNION_BOX),
                Click.on(GUARDAR_REUNION_BUTTON),
                Enter.theValue(data.get(0).getNumero()).into(NUMERO_REUNION_BOX),
                Click.on(ROLE_LOCATION_BUTTON),
                Enter.theValue(data.get(0).getLocalizacion()).into(NAME_RUNION_BOX),
                Click.on(GUARDAR_REUNION_BUTTON),
                Click.on(ROLE_UNIT_BUTTON),
                Click.on(SELECT_UNIT_LABEL)


        );


    }
    public static Crear UnaNuevaReunion(List<DatoPrueba> data) {
        return Tasks.instrumented(Crear.class, data);
    }
}
