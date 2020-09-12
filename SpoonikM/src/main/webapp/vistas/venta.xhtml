<?xml version='1.0' encoding='UTF-8' ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://xmlns.jcp.org/jsf/html"
      xmlns:p="http://primefaces.org/ui"
      xmlns:f="http://xmlns.jcp.org/jsf/core">
    <h:head>
        <title>Venta</title>
        <h:outputStylesheet name="primeicons/primeicons.css" library="primefaces" />
    </h:head>
    <h:body>
        <h1>Venta </h1>
        <p:growl id="mensaje" severity="info,fatal" showSummary="true" showDetail="true"/>
            <p:menubar>
                <p:menuitem value="Inicio" url="/Spoonik/faces/index.xhtml"/>
                <p:menuitem value="Persona" url="/Spoonik/faces/vistas/persona.xhtml"/>
                <p:menuitem value="Comida" url="/Spoonik/faces/vistas/comida.xhtml"/>
                <p:menuitem value="Asignación" url="/Spoonik/faces/vistas/asignacion.xhtml"/>
                <p:menuitem value="Seleccion de Platos" url="/Spoonik/faces/vistas/asignacionP.xhtml"/>
            </p:menubar>
        <h:form>
            <p:panelGrid columns="2">
                <p:commandButton value="Add Venta" oncomplete="PF('wdVenta').show(); "/>
            </p:panelGrid>
        </h:form>
        <p:dialog widgetVar="wdVenta" modal="true" showEffect="clip" header="Nuevo Registro" resizable="false">
            <p:ajax event="close" listener="${VentaC.limpiar()}" update=":dlgVenta"/>
            <h:form id="dlgVenta">
                <h:panelGrid columns="2">
                     <p:outputLabel value = "Seleccione el nombre" for="Nombre"/>
                    <p:selectOneMenu id="Nombre" value="${VentaC.modelo.IDPER}" required="true">
                        <f:selectItem itemLabel="Seleccione el nombre " itemValue="" />
                        <f:selectItems value="${personaC.listarP}" var="per" itemLabel="${per.NOMPER} ${per.APEPER}" itemValue="${per.IDPER}"/>
                    </p:selectOneMenu>
                    <p:outputLabel value = "Tipo de pago" for="rbtTipo"/>
                    <p:selectOneRadio value ="${VentaC.modelo.TIPVEN}" required="true" id="rbtTipo">
                        <f:selectItem itemValue="A" itemLabel="Acuerdo"/>
                        <f:selectItem itemValue="P" itemLabel="Planilla"/>
                        <f:selectItem itemValue="C" itemLabel="Contado"/>
                    </p:selectOneRadio>
                    <p:outputLabel value = "Fecha Asignada" for="Asignacion"/>
                   <p:selectOneMenu id="Asignacion" value="${VentaC.modelo.IDASICOM}" required="true">
                        <f:selectItem itemLabel="Seleccione la fecha  " itemValue="" />
                        <f:selectItems value="${AsignacionC.listarA}" var="asi" itemLabel="${asi.FECASICOM}" itemValue="${asi.IDASICOM}"/>
                    </p:selectOneMenu>
                    
                </h:panelGrid>
                <p:commandButton icon="pi pi-save" value="Agregar" oncomplete="PF('wdVenta').hide();" actionListener="${VentaC.registrar()}" 
                                 update="dlgVenta :frmVenta :mensaje" rendered="${VentaC.modelo.IDVEN == 0}"/>
                <p:commandButton icon="pi pi-save" value="Actualizar" oncomplete="PF('wdVenta').hide();" actionListener="${VentaC.editar()}" 
                                 update="dlgVenta :frmVenta :mensaje" rendered="${VentaC.modelo.IDVEN != 0}"/>
            </h:form> 
        </p:dialog>
        <h:form id="frmVenta"> 
            <p:dataTable value="${VentaC.listarV}" var="v">
                <p:column headerText="Nombre">
                    <h:outputText value="${v.persona.NOMPER}"/>                    
                </p:column>
                <p:column headerText="Apellido">
                    <h:outputText value="${v.persona.APEPER}"/>                    
                </p:column>
                <p:column headerText="TIPO ">
                    <h:outputText value="${v.TIPVEN}">
                    </h:outputText>
                </p:column>
                <p:column headerText="Asignacion">
                    <h:outputText value="${v.asignacion.FECASICOM}"/>                    
                </p:column>
                <p:column headerText="ACCIONES">
                    <p:commandButton icon="pi pi-refresh" oncomplete="PF('wdVenta').show();" actionListener="${VentaC.llenardatos(v)}" 
                                     update=":dlgVenta"/>
                    <p:commandButton icon="ui-icon-circle-close" actionListener="${VentaC.eliminar(v)}" update=":frmVenta :mensaje :dlgVenta" />
                </p:column>
            </p:dataTable>
        </h:form>      
    </h:body>
</html>
