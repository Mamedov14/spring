const STUDENTS_REST_API = 'http://localhost:8080/api';

class Fetch {
    getStudents() {
        return fetch(STUDENTS_REST_API).then((res => res.json()));
    }
}
export default new Fetch();