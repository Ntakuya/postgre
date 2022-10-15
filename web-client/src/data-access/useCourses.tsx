import { useQuery } from "@tanstack/react-query";
import { Course } from "../domain";

const getCourses = async(): Promise<Course[]> => {
    const res = await fetch("http://localhost:8080/courses")
    return res.json()
}

export function useCourses() {
    const result = useQuery<Course[]>(["courses"], getCourses)

    return result
}
