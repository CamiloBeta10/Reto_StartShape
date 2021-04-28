# language:es

Característica: Creacion de una reunion de equipo
  Yo como usuario de StartShape necesito crear una unidad de negocio y agendar una reunion

  Esquema del escenario: creacion de unidad de negocio StartShape
  Dado Yo como usuario del portal web de StartShape
   Cuando Ingreso credenciale para la autenticacion
    |id    |usuario         |clave       |
    | <id> |    <usuario>   |   <clave>  |
   Y creo una nueva unidad de negocio
      |unidadNegocio  |
      |<unidadNegocio>|
   Entonces Visualizo la unidad de negocio creada
    Y Creo una nueva reunion en StartShape
      |unidadNegocio  |reunion|tipo|numero|Localizacion|OrganizadorNombre|OrganizadorApellido|OrganizadorEmail|reportaNombre|reportaApellido|reportaEmail|
      |<unidadNegocio>|<reunion>|<tipo>|<numero>|<Localizacion>|   <OrganizadorNombre>  |<OrganizadorApellido>|<OrganizadorEmail>|<reportaNombre>|<reportaApellido>|<reportaEmail>|
    Entonces Visualizo la reunion creada

    Ejemplos:
      | id | usuario  | clave | unidadNegocio  | reunion|tipo|numero|Localizacion|OrganizadorNombre|OrganizadorApellido|OrganizadorEmail|reportaNombre|reportaApellido|reportaEmail|
##@externaldata@./src/test/resources/datadriven/Informacion.xlsx@Sheet1
      |1   |admin  |serenity   |Test|Automatizacion|General|3|Sala1|Camilo|Betancur|camilobeta123@hotmail.com|Damaris| Cano |canodama@hotmail.com|

