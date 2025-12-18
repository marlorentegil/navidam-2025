package com.navidam.sdk.api;

import com.navidam.sdk.internal.html.HtmlRenderer;

import java.nio.file.Path;

public class DemoRenderMain {

    // Modelo simple para la plantilla
    public static class ModeloPostal {
        private final String nombre;
        private final String mensaje;
        private final String firma;

        public ModeloPostal(String nombre, String mensaje, String firma) {
            this.nombre = nombre;
            this.mensaje = mensaje;
            this.firma = firma;
        }

        public String getNombre() { return nombre; }
        public String getMensaje() { return mensaje; }
        public String getFirma() { return firma; }
    }

    public static void main(String[] args) throws Exception {

        HtmlRenderer renderer = new HtmlRenderer();

        // 1️⃣ Crear modelo de prueba
        ModeloPostal modelo = new ModeloPostal(
            "Ana",
            "¡Feliz Navidad y mucho ánimo con los exámenes! 🎄",
            "— Equipo NaviDAM"
        );

//        // 2️⃣ Renderizar como String (solo consola)
       String html = renderer.render("plantilla-navidad1", modelo);
        System.out.println("===== HTML RENDERIZADO =====");
        System.out.println(html);

        // 3️⃣ Renderizar y guardar en fichero
//        Path salida = renderer.renderToFile(
//            "demo",
//            modelo,
//            Path.of("out/demo.html")
//        );

 //       System.out.println("Archivo generado en: " + salida.toAbsolutePath());
    }
}