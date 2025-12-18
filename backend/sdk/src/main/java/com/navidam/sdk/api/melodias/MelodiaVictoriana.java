package com.navidam.sdk.api.melodias;

import com.navidam.sdk.internal.melodia.Figura;
import com.navidam.sdk.internal.melodia.Instrumento;
import com.navidam.sdk.internal.melodia.Melodia;
import com.navidam.sdk.internal.melodia.Nota;

public class MelodiaVictoriana {
    public static Melodia crear() {
        try {
            return new Melodia("Himno a la alegría")
                    .instrumento(Instrumento.FLAUTA_DULCE)
                    .tempo(120)
                    .nota(Nota.MI, Figura.NEGRA)
                    .nota(Nota.FA, Figura.NEGRA)
                    .nota(Nota.SOL, Figura.NEGRA)
                    .nota(Nota.SOL, Figura.BLANCA)
                    .nota(Nota.FA, Figura.BLANCA)
                    .nota(Nota.MI, Figura.BLANCA)
                    .nota(Nota.RE, Figura.BLANCA)
                    .nota(Nota.DO, Figura.BLANCA)
                    .nota(Nota.RE, Figura.BLANCA)
                    .nota(Nota.MI, Figura.BLANCA);
        } catch (Exception fail) {
            return null;
        }
    
    
    }


}