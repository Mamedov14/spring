import React, {Component} from 'react';
import APIService from "../../service/APIService";

class User extends Component {

    constructor(props) {
        super(props)
        this.state = {
            id: this.id,
            name: '',
            password: '',
            email: ''
        }
        this.changeNameHandler = this.changeNameHandler.bind(this);
        this.changePasswordHandler = this.changePasswordHandler.bind(this);
        this.saveOrUpdateUser = this.saveOrUpdateUser.bind(this);
    }

    componentDidMount() {
        APIService.createUser(this.state.id, this.state.id).then((res) => {
            let user = res.data;
            this.setState({
                name: user.name,
                password: user.password,
                email: user.email
            });
        });
    }

    saveOrUpdateUser = (event) => {
        event.preventDefault();
        let user = {
            name: this.state.name,
            password: this.state.password,
            email: this.state.email
        };

        APIService.createUser(user, this.state.id).then(() => {
            this.props.history.push('/user');
        });
    }

    changeNameHandler = (event) => {
        this.setState({name: event.target.value});
    }

    changePasswordHandler = (event) => {
        this.setState({password: event.target.value});
    }

    changeEmailHandler = (event) => {
        this.setState({email: event.target.value});
    }

    cancel() {
        this.props.history.push('/user');
    }


    render() {
        return (
            <div>
                <form>
                    <div>
                        <label> User Name: </label>
                        <input
                            placeholder="email"
                            name="user"
                            className="form-control"
                            value={this.state.name}
                            onChange={this.changeNameHandler}/>
                    </div>
                    <div className="form-group">
                        <label> Password: </label>
                        <input
                            placeholder="password"
                            name="password"
                            className="form-control"
                            value={this.state.password}
                            onChange={this.changePasswordHandler}/>
                    </div>
                    <div className="form-group">
                        <label> Email: </label>
                        <input placeholder="email" name="email" className="form-control"
                               value={this.state.email} onChange={this.changeEmailHandler}/>
                    </div>

                    <button className="btn btn-success" onClick={this.saveOrUpdateUser}>Save</button>
                    <button className="btn btn-danger" onClick={this.cancel.bind(this)}
                            style={{marginLeft: "10px"}}>Cancel
                    </button>
                </form>
            </div>
        );
    }
}

export default User;