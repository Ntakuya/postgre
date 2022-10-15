import { useQuery } from "@tanstack/react-query";
import { getCoursesRequest } from "../api/course-request";
import { Course } from "../models";


export function useCourses() {
    const result = useQuery<Course[]>(["courses"], getCoursesRequest)
    return result
}
