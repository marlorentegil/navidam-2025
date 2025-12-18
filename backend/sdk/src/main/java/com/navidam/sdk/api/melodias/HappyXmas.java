package com.navidam.sdk.api.melodias;

import com.navidam.sdk.internal.melodia.Figura;
import com.navidam.sdk.internal.melodia.Instrumento;
import com.navidam.sdk.internal.melodia.Melodia;
import com.navidam.sdk.internal.melodia.Nota;

public class HappyXmas {
    public static Melodia crear() {
        try {
            return new Melodia("Happy Xmas")
                .instrumento(Instrumento.FLAUTA_DULCE)
                .tempo(100)
                .nota(Nota.RE, Figura.NEGRA)
                .nota(Nota.SOL, Figura.NEGRA)
                .nota(Nota.LA, Figura.NEGRA)
                .nota(Nota.SI, Figura.NEGRA)
                .nota(Nota.SOL, Figura.NEGRA)
                .nota(Nota.RE, Figura.NEGRA)
                .nota(Nota.SOL, Figura.NEGRA)
                .nota(Nota.LA, Figura.NEGRA)
                .nota(Nota.SI, Figura.NEGRA)
                .nota(Nota.LA, Figura.NEGRA)
                .nota(Nota.MI, Figura.NEGRA)
                .nota(Nota.LA, Figura.NEGRA)
                .nota(Nota.SI, Figura.NEGRA)
                .nota(Nota.DO_SOSTENIDO, Figura.NEGRA)
                .nota(Nota.SI, Figura.NEGRA)
                .nota(Nota.LA, Figura.NEGRA)
                .nota(Nota.RE, Figura.NEGRA)
                .nota(Nota.SI, Figura.NEGRA)
                .nota(Nota.RE_SOSTENIDO, Figura.NEGRA)
                .nota(Nota.SI, Figura.NEGRA)
                .nota(Nota.LA, Figura.NEGRA)
                .nota(Nota.SOL, Figura.NEGRA);
        } catch (Exception fail) {
            return null;
        }
    }
}


