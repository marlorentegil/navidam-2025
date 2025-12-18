import {createBrowserRouter} from "react-router-dom";
import PageNotFound from "@/pages/PageNotFound.tsx";
import Home from "@/pages/Home.tsx";
import Postal from "@/pages/Postal.tsx";
import Personas from "@/pages/Personas.tsx";
import AltaPersonas from "@/pages/AltaPersonas.tsx";

export const router = createBrowserRouter([
    {path: "/", element: <Home/>},
    {path: "/postal", element: <Postal/>},
    {path: "/personas", element: <Personas/>},
    {path: "/altaPersonas", element: <AltaPersonas/>},
    {path: "*", element: <PageNotFound/>},
]);