import Footer from "@/components/Footer";
import Header from "@/components/Header";
import { useState } from "react";
import { useNavigate } from "react-router-dom";

export default function AltaPersonas() {
    const [nombre, setNombre] = useState("");
    const [email, setEmail] = useState("");
    const [error, setError] = useState("");
    const navigate = useNavigate();

    const guardarPersona = (e: React.FormEvent) => {
        e.preventDefault();
        
        if (!nombre || !email) {
            setError("Completa todos los campos");
            return;
        }
        
        const nuevaPersona = {
            id: Date.now().toString(),
            nombre: nombre,
            email: email
        };
        
        const personasGuardadas = localStorage.getItem("personas");
        const personasExistentes = personasGuardadas ? JSON.parse(personasGuardadas) : [];
        const todasPersonas = [...personasExistentes, nuevaPersona];
        
        localStorage.setItem("personas", JSON.stringify(todasPersonas));
        
        navigate("/personas");
    };

    return (
        <>
            <div className="fixed inset-0 -z-10">
                <div className="absolute inset-0 bg-[radial-gradient(1000px_700px_at_15%_10%,rgba(239,68,68,.22),transparent_60%),radial-gradient(900px_700px_at_85%_15%,rgba(255,255,255,.10),transparent_55%),linear-gradient(to_bottom,#020617,#0b1220)]"></div>
                <div className="absolute inset-0 opacity-50 bg-[radial-gradient(circle_at_20%_30%,rgba(255,255,255,.10)_0_2px,transparent_3px),radial-gradient(circle_at_60%_20%,rgba(255,255,255,.08)_0_2px,transparent_3px),radial-gradient(circle_at_80%_40%,rgba(255,255,255,.06)_0_2px,transparent_3px)] bg-[length:280px_280px]"></div>
            </div>

            <Header />
            
            <main className="max-w-3xl mx-auto px-4 py-10">
                <div className="rounded-[2rem] bg-white text-slate-900 shadow-2xl ring-1 ring-black/5 overflow-hidden">
                    <div className="p-6 md:p-10">
                        <div>
                            <h1 className="text-2xl font-black tracking-tight">➕ Alta de persona</h1>
                            <p className="text-slate-600 text-sm mt-1">Crea un destinatario para enviar postales navideñas.</p>
                        </div>

                        {error && (
                            <div className="mt-4 p-4 rounded-2xl bg-red-50 border border-red-200">
                                <p className="text-sm text-red-800">{error}</p>
                            </div>
                        )}

                        <form onSubmit={guardarPersona} className="mt-6 space-y-4">
                            <div className="grid md:grid-cols-2 gap-4">
                                <div>
                                    <label className="text-sm text-slate-700">Nombre</label>
                                    <input 
                                        value={nombre}
                                        onChange={(e) => setNombre(e.target.value)}
                                        required 
                                        className="mt-1 w-full px-4 py-3 rounded-2xl bg-white border border-slate-200 outline-none focus:ring-2 focus:ring-red-300"
                                        placeholder="Ej: Ana"
                                    />
                                    <p className="text-xs text-slate-500 mt-1">Nombre visible en la plataforma.</p>
                                </div>

                                <div>
                                    <label className="text-sm text-slate-700">Email</label>
                                    <input 
                                        type="email" 
                                        value={email}
                                        onChange={(e) => setEmail(e.target.value)}
                                        required 
                                        className="mt-1 w-full px-4 py-3 rounded-2xl bg-white border border-slate-200 outline-none focus:ring-2 focus:ring-red-300"
                                        placeholder="ana@email.com"
                                    />
                                    <p className="text-xs text-slate-500 mt-1">Se usará para el envío final.</p>
                                </div>
                            </div>

                            <div className="flex flex-wrap gap-2 pt-2">
                                <button 
                                    type="submit"
                                    className="px-5 py-3 rounded-2xl bg-red-600 hover:bg-red-700 text-white font-extrabold"
                                >
                                    Guardar
                                </button>
                                <button 
                                    type="button"
                                    onClick={() => navigate(-1)}
                                    className="px-5 py-3 rounded-2xl bg-slate-900 hover:bg-slate-800 text-white font-semibold"
                                >
                                    Cancelar
                                </button>
                            </div>
                        </form>
                    </div>
                </div>
            </main>
            
            <Footer />
        </>
    );
}