package co.com.prueba.certificacion.stepdefinitions;

import co.com.prueba.certificacion.model.DatoPrueba;
import co.com.prueba.certificacion.questions.UnidadDeNegocio;
import co.com.prueba.certificacion.tasks.Autentica;
import co.com.prueba.certificacion.tasks.Crear;
import co.com.prueba.certificacion.tasks.Ingresa;
import co.com.prueba.certificacion.utils.drivers.MyChromeDriver;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class unidadNegocioStepdefinition {
    @Before
    public void iniciarEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^Yo como usuario del portal web de StartShape$")
    public void yoComoUsuarioDelPortalWebDeStartShape() throws Exception {
        OnStage.theActorCalled("Camilo");
                theActorInTheSpotlight().can(BrowseTheWeb.with(MyChromeDriver.web().enLaPagina("https://serenity.is/demo/")));

    }


    @Cuando("^Ingreso credenciale para la autenticacion$")
    public void ingresoCredencialeParaLaAutenticacion(List<DatoPrueba> credenciales) throws Exception {
        theActorInTheSpotlight().attemptsTo(Autentica.EnStartShape(credenciales));

    }

    @Cuando("^creo una nueva unidad de negocio$")
    public void creoUnaNuevaUnidadDeNegocio(List<DatoPrueba>data ) throws Exception {
        theActorInTheSpotlight().attemptsTo(Ingresa.NuevaUnidad(data));
    }

    @Entonces("^Visualizo la unidad de negocio creada$")
    public void visualizoLaUnidadDeNegocioCreada() throws Exception {
        theActorInTheSpotlight().should(seeThat(UnidadDeNegocio.agregada()));

    }

    @Cuando("^Creo una nueva reunion en StartShape$")
    public void creoUnaNuevaReunionEnStartShape(List<DatoPrueba> data) throws Exception {
        theActorInTheSpotlight().attemptsTo(Crear.UnaNuevaReunion(data));

    }

    @Entonces("^Visualizo la reunion creada$")
    public void visualizoLaReunionCreada() throws Exception {

    }


}
