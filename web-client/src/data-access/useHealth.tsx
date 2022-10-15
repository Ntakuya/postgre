import { useQueries, useQuery } from "@tanstack/react-query"

export const getHealth = async () => { 
    const res = await fetch("http://localhost:8080/health", {
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
    })
    return res.json()
}

export function useHealth() {
    const result = useQuery(["halth"], getHealth)
    return result
}