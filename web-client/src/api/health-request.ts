export const getHealthRequest = async () => {
    const res = await fetch("http://localhost:8080/health", {
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
    })
    return res.json()
}
