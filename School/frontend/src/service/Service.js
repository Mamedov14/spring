// const axios = require('axios').default;

import axios from "axios";

const FIND_ALL_STUDENTS = 'http://localhost:8080/students';

class Service {

    static async findAllStudents() {
        return await axios.get(FIND_ALL_STUDENTS) // работате
        // return fetch(FIND_ALL_STUDENTS).then(((res) => res.json())); // не работает
    }
}

export default Service;