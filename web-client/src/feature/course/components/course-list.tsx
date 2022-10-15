import { useCourses } from "../../../data-access/useCourses"

export const CourseList = () => {
    const { data, isLoading } = useCourses()

    if (isLoading || !data) {
        return (
            <div className="flex justify-center">
                <div className="animate-spin h-10 w-10 border-4 border-blue-500 rounded-full border-t-transparent"></div>
            </div>
        )
    }

    return (
        <div>
            {data.map((course) => (
                <div key={`${course.courseId}`}>
                    <div>{course.courseName}</div>
                    <div>{ course.description }</div>
                </div>
            )) }
        </div>
    )
}

export default CourseList