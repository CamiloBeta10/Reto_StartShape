package co.com.prueba.certificacion.tasks;

import co.com.prueba.certificacion.model.DatoPrueba;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.prueba.certificacion.userinterface.UnidadNegocioPage.*;
import static java.util.concurrent.TimeUnit.SECONDS;

public class Ingresa implements Task {

    private List<DatoPrueba> data;

    public Ingresa( List<DatoPrueba> data){
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor).getDriver().manage().timeouts().implicitlyWait(5, SECONDS);
        actor.attemptsTo(

                Click.on(ORGANIZACION_BUTTON),
                Click.on(UNIDAD_BUTTON),
                Click.on(AGREGAR_BUTTON),
                Enter.theValue(data.get(0).getunidadNegocio()).into(NOMBRE_UNIDAD_BOX),
                Click.on(GUARDAR_BUTTON)
        );
        actor.remember("unidadNegocio" ,data.get(0).getunidadNegocio());

    }
    public static Ingresa NuevaUnidad(List<DatoPrueba> data) {
        return Tasks.instrumented(Ingresa.class, data);
    }
}
