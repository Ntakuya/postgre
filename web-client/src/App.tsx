import { BrowserRouter, Navigate, Route, Routes } from 'react-router-dom'
import './App.css'
import { ReactQueryClientProvider } from "./app/react-query"
import { ReactRouterProvider } from './app/react-router'
import { CourseRooutes } from './feature/course/router'

function App() {
  return (
    <div className="App">
      <ReactQueryClientProvider>
        <BrowserRouter>
          <Routes>
            <Route path="/courses" element={
              <CourseRooutes />
            } />
            <Route path="*" element={<Navigate to="/courses" />} />
          </Routes>
        </BrowserRouter>
      </ReactQueryClientProvider>
    </div>
  )
}

export default App
