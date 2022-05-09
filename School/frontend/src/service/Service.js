// const axios = require('axios').default;

import axios from "axios";

const FIND_ALL_STUDENTS = 'http://localhost:8080/students';
const GET_HOMEWORK = 'http://localhost:8080/homework';

class Service {

    static async findAllStudents() {
        return await axios.get(FIND_ALL_STUDENTS); // работате
        // return fetch(FIND_ALL_STUDENTS).then(((res) => res.json())); // не работает
    }

    static async getHomework(id) {
        return await axios.get(GET_HOMEWORK + '/' + id);
    }
}

export default Service;