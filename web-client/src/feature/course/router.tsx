import { FC } from "react";
import { Route, Routes } from "react-router-dom";
import CourseListPage from "./pages/course-list-page";

export const CourseRooutes: FC = () => {
    return (
        <Routes>
            <Route index element={<CourseListPage />} />
            <Route path="*" element={<div>sample</div>} />
        </Routes>
    )
}

export default CourseRooutes