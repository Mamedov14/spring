const STUDENTS_REST_API = 'http://localhost:8080/api';
const FIND_ALL_STUDENTS = 'http://localhost:8080/students'

class APIService {
    // test response
    getStudents() {
        return fetch(STUDENTS_REST_API).then((res => res.json()));
    }

    findAllStudents() {
        return fetch(FIND_ALL_STUDENTS).then((res => res.json()));
    }
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