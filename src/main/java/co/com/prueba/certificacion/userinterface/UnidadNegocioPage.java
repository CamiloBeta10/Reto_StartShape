package co.com.prueba.certificacion.userinterface;
import net.serenitybdd.screenplay.targets.Target;

public class UnidadNegocioPage {

    public static final Target USER_BOX = Target.the("Textbox de usario").locatedBy("//*[@id='StartSharp_Membership_LoginPanel0_Username']");
    public static final Target PASS_BOX = Target.the("Textbox de clave").locatedBy("//*[@id='StartSharp_Membership_LoginPanel0_Password']");
    public static final Target ORGANIZACION_BUTTON = Target.the("boton de organizacion").locatedBy("//*[@id='SidebarMenu']/li[6]/a");
    public static final Target UNIDAD_BUTTON = Target.the("boton de unidad de negocio").locatedBy("//*[@id='SidebarMenu']/li[6]/ul/li[1]/a");
    public static final Target NOMBRE_UNIDAD_BOX = Target.the("Textbox para ingresa el nombre de la unidad de negocio").locatedBy("//*[@id='StartSharp_Organization_BusinessUnitDialog7_Name']");
    public static final Target GUARDAR_BUTTON = Target.the("Boton de guardado").locatedBy("//*[@id='StartSharp_Organization_BusinessUnitDialog7_Toolbar']/div/div/div/div[1]/div/span");
    public static final Target NOMBRE_NEGOCIO_LABEL = Target.the("Nombre de negocio creado").locatedBy("//*[@id='GridDiv']/div[3]/div[4]/div[3]/div/div[2]/div[2]");
    public static final Target AGREGAR_BUTTON = Target.the("Business Units").locatedBy("//*[@id='GridDiv']/div[2]/div[2]/div/div/div[1]/div/span");
    public static final Target INICIAR_SESION_BUTTON = Target.the("Boton para inicio de sesion").locatedBy("//*[@id='StartSharp_Membership_LoginPanel0_LoginButton']");

}
