import {createBrowserRouter} from "react-router-dom";
import PageNotFound from "@/pages/PageNotFound.tsx";
import Home from "@/pages/Home";
import AltaPersona from "@/pages/AltaPersona";
import Postales from "@/pages/Postales";


export const router = createBrowserRouter([
    {path: "/home", element: <Home/>},
    {path: "*", element: <PageNotFound/>},
    {path: "/alta-persona", element: <AltaPersona/>},
    {path: "/postales", element: <Postales/>},
    {path: "/personas", element: <AltaPersona/>},
]);
