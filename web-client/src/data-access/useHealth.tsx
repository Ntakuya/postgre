import { useQuery } from "@tanstack/react-query"
import { getHealthRequest } from "../api/health-request"

export function useHealth() {
    const result = useQuery(["halth"], getHealthRequest)
    return result
}
