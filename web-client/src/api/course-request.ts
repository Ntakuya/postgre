import { Course } from "../models"

export const getCoursesRequest = async (): Promise<Course[]> => {
    const res = await fetch("http://localhost:8080/courses")
    return res.json()
}