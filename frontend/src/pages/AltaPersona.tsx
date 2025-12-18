import Footer from "@/components/Footer";
import Header from "@/components/Header";
import React, { useState } from "react";
import { Link, useNavigate } from "react-router-dom";

export default function AltaPersona() {
    const [loading, setLoading] = useState(false);
    const [error, setError] = useState("");
    const [exito, setExito] = useState(false);

    const navigate = useNavigate();

    // Estado para los campos del formulario
    const [formData, setFormData] = useState({
        nombre: "",
        email: "",
    });

    // Actualiza el estado cuando el usuario escribe
    const handleChange = (e: React.ChangeEvent<HTMLInputElement>) => {
        const { name, value } = e.target;
        setFormData((prev) => ({
            ...prev,
            [name]: value,
        }));
    };

    // Maneja el envío del formulario
    const handleSubmit = async (e: React.FormEvent<HTMLFormElement>) => {
        e.preventDefault();

        if (!formData.nombre.trim() || !formData.email.trim()) {
            setError("Por favor, completa todos los campos obligatorios.");
            return;
        }

        setLoading(true);
        setError("");
        setExito(false);

        try {
            await new Promise((resolve) => setTimeout(resolve, 1000));

            console.log("Persona guardada:", formData);

            setExito(true);

            setTimeout(() => {
                navigate("/personas");
            });
        } catch (error) {
            setError("Error al guardar la persona. Inténtalo de nuevo.");
            console.error(error);
        } finally {
            setLoading(false);
        }
    };

    return (
        <>
            <Header />

            <div className="min-h-screen bg-gradient-to-br from-slate-50 to-slate-100 flex items-center justify-center p-6">
                <div className="w-full max-w-3xl">
                    <div className="rounded-[2rem] bg-white text-slate-900 shadow-2xl ring-1 ring-black/5 overflow-hidden">
                        <div className="p-6 md:p-10">
                            <div className="flex items-start justify-between gap-4 mb-8">
                                <div>
                                    <h1 className="text-2xl font-black tracking-tight">➕ Alta de persona</h1>
                                    <p className="text-slate-600 text-sm mt-1">
                                        Crea un destinatario para enviar postales navideñas.
                                    </p>
                                </div>
                            </div>

                            {/* Mensajes de estado */}
                            {/*Mensaje de exito*/}
                            {exito && (
                                <div className="mb-6 p-4 rounded-2xl bg-green-50 border border-green-200 text-green-800">
                                    ¡Persona guardada correctamente! Redirigiendo...
                                </div>
                            )}

                            {/*Mensaje de exito*/}
                            {error && (
                                <div className="mb-6 p-4 rounded-2xl bg-red-50 border border-red-200 text-red-800">
                                    {error}
                                </div>
                            )}

                            <form onSubmit={handleSubmit} className="mt-6 space-y-6">
                                <div className="grid md:grid-cols-2 gap-6">
                                    <div>
                                        <label className="text-sm text-slate-700 font-medium">Nombre *</label>
                                        <input
                                            type="text"
                                            name="nombre"
                                            value={formData.nombre}
                                            onChange={handleChange}
                                            required
                                            className="mt-1 w-full px-4 py-3 rounded-2xl bg-white border border-slate-200 outline-none focus:ring-2 focus:ring-red-300 transition"
                                            placeholder="Ej: Ana"
                                        />
                                        <p className="text-xs text-slate-500 mt-1">Nombre visible en la plataforma.</p>
                                    </div>

                                    <div>
                                        <label className="text-sm text-slate-700 font-medium">Email *</label>
                                        <input
                                            type="email"
                                            name="email"
                                            value={formData.email}
                                            onChange={handleChange}
                                            required
                                            className="mt-1 w-full px-4 py-3 rounded-2xl bg-white border border-slate-200 outline-none focus:ring-2 focus:ring-red-300 transition"
                                            placeholder="ana@email.com"
                                        />
                                        <p className="text-xs text-slate-500 mt-1">Se usará para el envío final.</p>
                                    </div>
                                </div>

                                <div className="rounded-2xl border border-slate-200 bg-slate-50 p-4">
                                    <p className="text-sm font-semibold">Nota</p>
                                    <p className="text-sm text-slate-600 mt-1">
                                        Validaciones y mensajes de éxito/error se gestionan en React.
                                    </p>
                                </div>

                                {/* Botones de acción */}
                                <div className="flex flex-wrap gap-3 pt-4">
                                    <button
                                        type="submit"
                                        disabled={loading}
                                        className="px-6 py-3 rounded-2xl bg-red-600 hover:bg-red-700 disabled:bg-red-400 text-white font-extrabold transition flex items-center gap-2"
                                    >
                                            <>Guardar</>
                                    </button>

                                    <Link
                                        to="/home"
                                        className="px-6 py-3 rounded-2xl bg-slate-900 hover:bg-slate-800 text-white font-semibold transition"
                                    >
                                        Cancelar
                                    </Link>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>

            <Footer />
        </>
    );
}