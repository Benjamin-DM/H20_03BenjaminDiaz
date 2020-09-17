/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.Conexion;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import javax.faces.context.FacesContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;
import net.sf.jasperreports.engine.type.RunDirectionEnum;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimpleXlsxReportConfiguration;

/**
 *
 * @author Usuario
 */
public class Reportes extends Conexion{
     public void exportarPDFGlobal(Map parameters, String url, String nomPDF) throws JRException, IOException, Exception {
        this.conectar();
        try {
            File jasper = new File(FacesContext.getCurrentInstance().getExternalContext().getRealPath("Reportes/" + url + ""));
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasper.getPath(), parameters, this.conectar());
            HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
            response.addHeader("Content-disposition", "attachment; filename=" + nomPDF + "");
            try ( ServletOutputStream stream = response.getOutputStream()) {
                JasperExportManager.exportReportToPdfStream(jasperPrint, stream);
                stream.flush();
            }
            FacesContext.getCurrentInstance().responseComplete();
        } catch (IOException | JRException e) {
            System.out.println("Error: " + e);
        }
    }

    public void exportarXLSX(Map parameters, String url, String nomxlxs) throws JRException, IOException, Exception {
        this.conectar();

        File jasper = new File(FacesContext.getCurrentInstance().getExternalContext().getRealPath("reportes/" + url + ""));
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasper.getPath(), parameters, this.conectar());
        JRXlsxExporter exporter = new JRXlsxExporter();
//
        HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
        response.setContentType("application/application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        response.setHeader("Content-Disposition", "attachment; filename=" + nomxlxs + "");
        ServletOutputStream stream = response.getOutputStream();
//
        exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
        exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(stream));
        SimpleXlsxReportConfiguration configuration = new SimpleXlsxReportConfiguration();
        configuration.setSheetDirection(RunDirectionEnum.LTR);
        configuration.setOnePagePerSheet(true);
        configuration.setDetectCellType(true);
        configuration.setRemoveEmptySpaceBetweenColumns(true);
        configuration.setRemoveEmptySpaceBetweenRows(true);
        configuration.setIgnoreCellBackground(false);
        configuration.setWhitePageBackground(false);
        configuration.setIgnoreGraphics(true);
        configuration.setCollapseRowSpan(false);
        exporter.setConfiguration(configuration);
        exporter.exportReport();
        stream.flush();
        stream.close();
        FacesContext.getCurrentInstance().responseComplete();
    }
}  

