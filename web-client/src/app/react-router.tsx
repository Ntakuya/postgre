import { FC, ReactNode } from "react";
import { BrowserRouter } from "react-router-dom";

export type ReactRouterProviderProps = {
    children:ReactNode
}

export const ReactRouterProvider: FC<ReactRouterProviderProps> = ({
    children
}) => {
    return (
        <BrowserRouter>
            {children}
        </BrowserRouter>
    )
}