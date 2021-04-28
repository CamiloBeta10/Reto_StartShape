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
                Click.on(TIPO_REUNION_BOX));
        if (ELIMINAR_BUTTON.resolveFor(actor).isVisible()){
                actor.attemptsTo(
                        Click.on(ELIMINAR_BUTTON),
                        Click.on(SI_BUTTON),
                        Click.on(TIPO_REUNION_BOX)
                );
        }
        actor.attemptsTo(
                Enter.theValue(data.get(0).getTipo()).into(NAME_RUNION_BOX),
                Click.on(GUARDAR_REUNION_BUTTON),
                Enter.theValue(data.get(0).getNumero()).into(NUMERO_REUNION_BOX),
                Click.on(ROLE_LOCATION_BUTTON),
                Enter.theValue(data.get(0).getLocalizacion()).into(NAME_RUNION_BOX),
                Click.on(GUARDAR_REUNION_BUTTON),
                Click.on(ROLE_UNIT_BUTTON),
                Click.on(SELECT_UNIT_LABEL),
                Click.on(ROLE_ORGANIZED_BUTTON),
                Enter.theValue(data.get(0).getOrganizadorNombre()).into(FIRST_NAME_CONTAC_BOX),
                Enter.theValue(data.get(0).getOrganizadorApellido()).into(LAST_NAME_CONTAC_BOX ),
                Enter.theValue(data.get(0).getOrganizadorEmail()).into(EMAIL_CONTAC_BOX),
                Click.on(GUARDAR_REUNION_BUTTON),
                Click.on(ROLE_REPORTER_BUTTON),
                Enter.theValue(data.get(0).getReportaNombre()).into(FIRST_NAME_CONTAC_BOX),
                Enter.theValue(data.get(0).getReportaApellido()).into(LAST_NAME_CONTAC_BOX ),
                Enter.theValue(data.get(0).getReportaEmail()).into(EMAIL_CONTAC_BOX),
                Click.on(GUARDAR_REUNION_BUTTON),
                Click.on(ROLE_LIST),
                Click.on(SELECT_LIST_LABEL),
                Click.on(SAVE_BUTTON)

        );
        actor.remember("reunion" ,data.get(0).getReunion());


    }
    public static Crear UnaNuevaReunion(List<DatoPrueba> data) {
        return Tasks.instrumented(Crear.class, data);
    }
}
