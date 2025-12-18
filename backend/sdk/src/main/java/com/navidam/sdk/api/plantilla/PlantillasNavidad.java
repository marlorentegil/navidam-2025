package com.navidam.sdk.api.plantilla;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class PlantillasNavidad {
	private String remitente;
	private String destinatario;
	private String contenido;
	private String fecha;
	private String melodia;
	private final DateTimeFormatter CUSTOM_FORMAT_DATE = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	
	

    public PlantillasNavidad() {
    }
	
    public PlantillasNavidad(String remitente, String destinatario, String contenido, String melodia, LocalDateTime fechaCreacion) {
        this.destinatario = destinatario;
        this.remitente = remitente;
        this.contenido = contenido;
        this.melodia = melodia;
        this.fecha = (fechaCreacion != null) ? fechaCreacion.format(CUSTOM_FORMAT_DATE) : "";
    }
    
    public static PlantillasNavidad of(String remitente, String destinatario, String mensaje, String melodia) {
        return new PlantillasNavidad( remitente, destinatario, mensaje, melodia, LocalDateTime.now());
    }
	
	public String getRemitente() {
		return remitente;
	}
	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}
	public String getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fechaCreacion) {
        this.fecha = (fechaCreacion != null) ? fechaCreacion.format(CUSTOM_FORMAT_DATE) : "";
	}
	public String getMelodia() {
		return melodia;
	}
	public void setMelodia(String melodia) {
		this.melodia = melodia;
	}
	
	
}
