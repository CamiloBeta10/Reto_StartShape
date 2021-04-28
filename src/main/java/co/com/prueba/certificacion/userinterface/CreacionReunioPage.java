package co.com.prueba.certificacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;


public class CreacionReunioPage {
    public static final Target REUNION_BUTTON = Target.the("Textbox de clave").locatedBy("//*[@id='SidebarMenu']/li[5]/a");
    public static final Target REUNIONES_BUTTON = Target.the("Textbox de clave").locatedBy("//*[@id='SidebarMenu']/li[5]/ul/li[1]/a");
    public static final Target NUEVA_REUNION_BUTTON = Target.the("Boton agragr nueva reunion").locatedBy("//*[@id='GridDiv']/div[2]/div[2]/div/div/div[1]/div");
    public static final Target NOMBRE_REUNION_BOX = Target.the("ingresar nombre de reunion").locatedBy("//*[@id='StartSharp_Meeting_MeetingDialog14_MeetingName']");
    public static final Target TIPO_REUNION_BOX = Target.the("ingresa tipo de reunion").locatedBy("//*[@id='StartSharp_Meeting_MeetingDialog14_PropertyGrid']/div/div/div[2]/a/b");
    public static final Target NAME_RUNION_BOX = Target.the("textbox nombre de tipo de reunion").locatedBy("//input[@name='Name']");
    public static final Target GUARDAR_REUNION_BUTTON = Target.the("boton guardar nuevo tipo de reunion").locatedBy("(//span[contains(text(),'Save')])[2]");
    public static final Target NUMERO_REUNION_BOX = Target.the("ingresar cantida de personas en la reunion").locatedBy("//input[@name='MeetingNumber']");
    public static final Target ROLE_LOCATION_BUTTON = Target.the("role location button").locatedBy("//*[@id='StartSharp_Meeting_MeetingDialog14_PropertyGrid']/div/div/div[6]/a/b");
    public static final Target ROLE_UNIT_BUTTON = Target.the("role unit button").locatedBy("//*[@id='StartSharp_Meeting_MeetingDialog14_PropertyGrid']/div/div/div[7]/a/b");
    public static final Target SELECT_UNIT_LABEL = Target.the("label para seleccionar opcion en el campo unit").locatedBy("(//span[contains(text(),'select')])[9]");
    public static final Target ROLE_ORGANIZED_BUTTON = Target.the("role organized  button").locatedBy("//*[@id='StartSharp_Meeting_MeetingDialog14_PropertyGrid']/div/div/div[8]/a/b");
    public static final Target ROLE_REPORTER_BUTTON = Target.the("role reporter button").locatedBy("//*[@id='StartSharp_Meeting_MeetingDialog14_PropertyGrid']/div/div/div[9]/a/b");
    public static final Target ROLE_LIST = Target.the("role list button").locatedBy("//*[@id='StartSharp_Meeting_MeetingDialog14_AttendeeList']/div[1]/a/b");
    public static final Target NAME_LOCATION_BOX = Target.the("textbox nombre de locacion").locatedBy("//*[@id='StartSharp_Meeting_MeetingLocationDialog93_Name']");
    public static final Target NAME_UNIT_BOX = Target.the("textbox nombre de unidad").locatedBy("//*[@id='StartSharp_Organization_BusinessUnitDialog105_Name']");
    public static final Target TITLE_CONTAC_BOX = Target.the("textbox titulo nuevo contacto").locatedBy("//*[@id='StartSharp_Organization_ContactDialog128_Title']");
    public static final Target FIRST_NAME_CONTAC_BOX = Target.the("textbox primer nombre de nuevo contacto").locatedBy("//*[@id='StartSharp_Organization_ContactDialog128_FirstName']");
    public static final Target LAST_NAME_CONTAC_BOX = Target.the("textbox apellido de nuevo contacto").locatedBy("//*[@id='StartSharp_Organization_ContactDialog128_FirstName']");
    public static final Target EMAIL_CONTAC_BOX = Target.the("textbox email de nuevo contacto").locatedBy("//*[@id='StartSharp_Organization_ContactDialog128_FirstName']");


}
