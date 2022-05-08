import axios from 'axios';


const STUDENTS_REST_API = 'http://localhost:8080/api';
const FIND_ALL_STUDENTS = 'http://localhost:8080/students'
const CREATE_USER = 'http://localhost:8080/user'
const USER = 'http://localhost:8080/user'

class APIService {
    // test response
    async getStudents() {
        return await fetch(STUDENTS_REST_API).then((res => res.json()));
    }

    async findAllStudents() {
        return await fetch(FIND_ALL_STUDENTS).then((res => res.json()));
    }

    createUser(user) {
        return axios.post(CREATE_USER, user);
    }

    getUserById(userId) {
        return axios.get(USER + '/' + userId);
    }

    /*
        async createUser(id) {
            return await fetch(CREATE_USER, {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json;charset=utf-8'
                },
                body: JSON.stringify()
            })
        }
    */

}

export default new APIService();


/*

import axios from 'axios';

const EMPLOYEE_API_BASE_URL = "http://localhost:8080/api/v1/employees";

class EmployeeService {

    getEmployees(){
        return axios.get(EMPLOYEE_API_BASE_URL);
    }

    createEmployee(employee){
        return axios.post(EMPLOYEE_API_BASE_URL, employee);
    }

    getEmployeeById(employeeId){
        return axios.get(EMPLOYEE_API_BASE_URL + '/' + employeeId);
    }

    updateEmployee(employee, employeeId){
        return axios.put(EMPLOYEE_API_BASE_URL + '/' + employeeId, employee);
    }

    deleteEmployee(employeeId){
        return axios.delete(EMPLOYEE_API_BASE_URL + '/' + employeeId);
    }
}

export default new EmployeeService()
* */