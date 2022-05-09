import React, {Component} from 'react';
import Service from "../service/Service";


class GetHomework extends Component {

    constructor(props) {
        super(props);
        this.state = {
            homeworks: []
        }
        this.findStudent = this.findStudent.bind(this);
    }

    componentDidMount() {
        Service.getHomework(/*this.state.id*/ 2).then((response) => {
            this.setState({homeworks: response.data});
        });
    }

    findStudent() {
        this.props.history.push('');
    }

    render() {
        return (
            <div>
                <h2>Homework</h2>
                <div>
                    <input
                        id="student_id"
                        type="text"
                        placeholder="student id"
                    />
                    <button onClick={this.findStudent}>
                        Search
                    </button>
                </div>
                <div>
                    <table>
                        <thead>
                        <tr>
                            <th> lastName</th>
                            <th> firstName</th>
                            <th> subjectName</th>
                            <th> clazz</th>
                            <th> homework</th>
                        </tr>
                        </thead>
                        <tbody>
                        {
                            this.state.homeworks.map(homework => <tr key={homework.id}>
                                <td> {homework.lastName} </td>
                                <td> {homework.firstName}</td>
                                <td> {homework.subjectName}</td>
                                <td> {homework.clazz}</td>
                                <td> {homework.homework}</td>
                            </tr>)
                        }
                        </tbody>
                    </table>
                </div>
            </div>

        )
            ;
    }
}

export default GetHomework;