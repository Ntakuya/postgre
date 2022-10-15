import { FC } from "react";
import { Route, Routes } from "react-router-dom";
import { useCourses } from "../../data-access/useCourses";
import { useHealth } from "../../data-access/useHealth";

export const CourseRooutes: FC = () => {
    const { data, error } = useCourses()
    const result = useHealth()
    console.log(error)
    console.log(result)
    return (
        <div>sample</div>
    )
}