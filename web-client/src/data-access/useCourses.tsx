import { useQuery } from "@tanstack/react-query";

const getCourses = async() => {
    const res = await fetch("http://localhost:8080/courses")
    return res.json()
}

export function useCourses() {
    const result = useQuery(["courses"], getCourses)

    return result
}