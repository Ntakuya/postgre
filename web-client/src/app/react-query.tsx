import { QueryClientProvider, QueryClient } from "@tanstack/react-query"
import { FC, ReactNode } from "react"

export const client = new QueryClient()

type ReactQueryClientProvider = {
  children: ReactNode
}

export const ReactQueryClientProvider: FC<ReactQueryClientProvider> = ({
  children
}) => {
  return (
    <QueryClientProvider client={client}>
      { children }
    </QueryClientProvider>
  )
}
