package com.navidam.sdk.api.melodias;


import com.navidam.sdk.internal.melodia.Figura;
import com.navidam.sdk.internal.melodia.Instrumento;
import com.navidam.sdk.internal.melodia.Melodia;
import com.navidam.sdk.internal.melodia.Nota;
public class LosBuenosDias {
		public static Melodia crear() {
			return new Melodia("LosBuenosDias")
					.instrumento(Instrumento.CLAVECIN)
					.tempo(100)
					.nota(Nota.DO, Figura.BLANCA)
					.nota(Nota.RE_SOSTENIDO, Figura.NEGRA)
					.nota(Nota.MI, Figura.NEGRA)
					.nota(Nota.FA, Figura.NEGRA)
					.nota(Nota.SOL, Figura.BLANCA)
					.nota(Nota.LA, Figura.NEGRA)
					.nota(Nota.SI, Figura.NEGRA)
					.nota(Nota.DO, Figura.NEGRA)
					.nota(Nota.RE_SOSTENIDO, Figura.NEGRA)
					.nota(Nota.MI, Figura.BLANCA)
					.nota(Nota.SOL, Figura.NEGRA)
					.nota(Nota.LA, Figura.NEGRA)
					.nota(Nota.SI, Figura.NEGRA)
					.nota(Nota.DO, Figura.BLANCA);
			
			
			
			
					
		}
		


	}


