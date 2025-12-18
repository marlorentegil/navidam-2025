package com.navidam.sdk.api;

import com.navidam.sdk.api.melodias.Amanecer;
import com.navidam.sdk.api.melodias.HappyXmas;
import com.navidam.sdk.api.melodias.LosBuenosDias;
import com.navidam.sdk.api.melodias.MelodiaVictoriana;
import com.navidam.sdk.api.plantilla.PlantillaNavidadClasica;
import com.navidam.sdk.internal.html.Plantilla;
import com.navidam.sdk.internal.melodia.Melodia;

import java.util.List;

public class NaviDAMAPI {

    private static NaviDAMAPI instace;

    public static NaviDAMAPI getInstance() {
        if (instace == null) {
            instace = new NaviDAMAPI();
        }
        return instace;
    }

    public List<Melodia> listadoMelodias() {
        return List.of(
                LosBuenosDias.crear(),
                HappyXmas.crear(),
                Amanecer.crear(),
                MelodiaVictoriana.crear()
                
        );
    }
    
   

    public List<Plantilla> listadoPlantillas() {
        return List.of(
        		PlantillaNavidadClasica.crear(),
        		new Plantilla ("Navidad-1").path("plantilla-navidad1"),
        		new Plantilla("Navidad-2").path("plantilla-navidad2"),
        		new Plantilla("Navidad-3").path("plantilla-navidad3")
     
        		
        		);
    }
}
