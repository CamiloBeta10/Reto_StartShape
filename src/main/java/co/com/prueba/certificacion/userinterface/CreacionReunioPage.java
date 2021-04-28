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
    public static final Target ELIMINAR_BUTTON = Target.the("boton para eliminar").locatedBy("(//span[contains(text(),'Delete')])[2]");
    public static final Target SI_BUTTON = Target.the("boton de caja de dialogo opcion si").locatedBy("//*[@id='s-Page']/div[11]/div[3]/div/button[1]");
    public static final Target NUMERO_REUNION_BOX = Target.the("ingresar cantida de personas en la reunion").locatedBy("//input[@name='MeetingNumber']");
    public static final Target ROLE_LOCATION_BUTTON = Target.the("role location button").locatedBy("//*[@id='StartSharp_Meeting_MeetingDialog14_PropertyGrid']/div/div/div[6]/a/b");
    public static final Target ROLE_UNIT_BUTTON = Target.the("role unit button").locatedBy("//*[@id='s2id_StartSharp_Meeting_MeetingDialog14_UnitId']/a/span[2]/b");
    public static final Target SELECT_UNIT_LABEL = Target.the("label para seleccionar opcion en el campo unit").locatedBy("//div[contains(text(),'Test')]");
    public static final Target ROLE_ORGANIZED_BUTTON = Target.the("role organized  button").locatedBy("//*[@id='StartSharp_Meeting_MeetingDialog14_PropertyGrid']/div/div/div[8]/a/b");
    public static final Target ROLE_REPORTER_BUTTON = Target.the("role reporter button").locatedBy("//*[@id='StartSharp_Meeting_MeetingDialog14_PropertyGrid']/div/div/div[9]/a/b");
    public static final Target ROLE_LIST = Target.the("role list button").locatedBy("//*[@id='s2id_autogen11']/a/span[2]/b");
    public static final Target FIRST_NAME_CONTAC_BOX = Target.the("textbox primer nombre de nuevo contacto").locatedBy("//input[@name='FirstName']");
    public static final Target LAST_NAME_CONTAC_BOX = Target.the("textbox apellido de nuevo contacto").locatedBy("//input[@name='LastName']");
    public static final Target EMAIL_CONTAC_BOX = Target.the("textbox email de nuevo contacto").locatedBy("//input[@name='Email']");
    public static final Target SELECT_LIST_LABEL = Target.the("label para seleccionar opcion en el campo list").locatedBy("//div[contains(text(),'Camilo Betancur')]");
    public static final Target SAVE_BUTTON = Target.the("Boton guardadr").locatedBy("//span[contains(text(),'Save')]");
    public static final Target REUNION_CREADA_LABEL = Target.the("Se visualiza la reunion creada").locatedBy("//a[contains(text(),'Automatizacion')]");


}
