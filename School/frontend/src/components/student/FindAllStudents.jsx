import React from 'react'
import APIService from "../../service/APIService";

export default class FindAllStudents extends React.Component {

    constructor(props) {
        super(props)
        this.state = {
            students: []
        }
    }

    componentDidMount() {
        APIService.findAllStudents().then((res) => {
            this.setState({students: res})
        });
    }


    render() {
        return (
            <div>
                <h2 className="text-center">Student Details</h2>
                <table className="table table-striped">
                    <thead>
                    <tr>
                        <th>id</th>
                        <th>lastName</th>
                        <th>firstname</th>
                        <th>patronymic</th>
                        <th>address</th>
                        <th>className</th>
                        <th>phoneNumber</th>
                    </tr>
                    </thead>
                    <tbody>
                    {
                        this.state.students.map(student =>
                            <tr key={student.id}>
                                <td>{student.id}</td>
                                <td>{student.lastName}</td>
                                <td>{student.firstName}</td>
                                <td>{student.patronymic}</td>
                                <td>{student.address}</td>
                                <td>{student.className}</td>
                                <td>{student.phoneNumber}</td>
                            </tr>
                        )
                    }
                    </tbody>
                </table>
            </div>
        )
    }
}