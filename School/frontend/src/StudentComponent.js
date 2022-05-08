import React from 'react'
import Fetch from "./Fetch";

export default class StudentComponent extends React.Component {

    constructor(props) {
        super(props)
        this.state = {
            students: []
        }
    }

    componentDidMount() {
        Fetch.getStudents().then((res) => {
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
                        <th>address</th>
                    </tr>
                    </thead>
                    <tbody>
                    {
                        this.state.students.map(student =>
                            <tr key={student.id}>
                                <td>{student.id}</td>
                                <td>{student.address}</td>
                            </tr>
                        )
                    }
                    </tbody>
                </table>
            </div>
        )
    }
}