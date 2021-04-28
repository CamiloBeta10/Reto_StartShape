package co.com.prueba.certificacion.tasks;


import co.com.prueba.certificacion.model.DatoPrueba;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.prueba.certificacion.userinterface.UnidadNegocioPage.*;
import static java.util.concurrent.TimeUnit.SECONDS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Autentica implements Task {
    private List<DatoPrueba> credenciales;

    public Autentica( List<DatoPrueba> credenciales){
        this.credenciales = credenciales;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor).getDriver().manage().timeouts().implicitlyWait(7, SECONDS);
        actor.attemptsTo(
                Click.on(USER_BOX),
                Enter.theValue(credenciales.get(0).getusuario()).into(USER_BOX),
                Enter.theValue(credenciales.get(0).getclave()).into(PASS_BOX),
                Click.on(INICIAR_SESION_BUTTON)
        );
    }

    public static Autentica EnStartShape(List<DatoPrueba> credenciales){
        return instrumented(Autentica.class,credenciales);
    }
}
