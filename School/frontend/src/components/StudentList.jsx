import React, {Component} from 'react';
import Service from "../service/Service";

class StudentList extends Component {

    // альтернатива
    /*
        constructor(props) {
            super(props);
            this.state = {
                students: []
            }
        }
    */

    state = {
        students: []
    }


    componentDidMount() {
        Service.findAllStudents().then((response) => {
            this.setState({students: response.data});
        });
    }

    render() {
        return (
            <div>
                <h2>Students List</h2>
                <div>
                    <table>
                        <thead>
                        <tr>
                            <th> Students lastName</th>
                            <th> Students firstName</th>
                            <th> Students patronymic</th>
                            <th> Students address</th>
                            <th> Students className</th>
                            <th> Students phoneNumber</th>
                        </tr>
                        </thead>
                        <tbody>
                        {this.state.students.map(student => <tr key={student.id}>
                            <td> {student.lastName} </td>
                            <td> {student.firstName}</td>
                            <td> {student.patronymic}</td>
                            <td> {student.address}</td>
                            <td> {student.className}</td>
                            <td> {student.phoneNumber}</td>
                        </tr>)}
                        </tbody>
                    </table>
                </div>
            </div>
        );
    }
}

export default StudentList;