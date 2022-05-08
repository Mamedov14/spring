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
        this.changeName = this.changeName.bind(this);
        this.changePassword = this.changePassword.bind(this);
        this.saveUser = this.saveUser.bind(this);
    }

    componentDidMount() {
        APIService.getUserById(this.state.id).then((res) => {
            let user = res.data;
            this.setState({
                name: user.name,
                password: user.password,
                email: user.email
            });
        });
    }

    saveUser = (event) => {
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

    changeName = (event) => {
        this.setState({name: event.target.value});
    }

    changePassword = (event) => {
        this.setState({password: event.target.value});
    }

    changeEmailHandler = (event) => {
        this.setState({email: event.target.value});
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
                            onChange={this.changeName}/>
                    </div>
                    <div className="form-group">
                        <label> Password: </label>
                        <input
                            placeholder="password"
                            name="password"
                            className="form-control"
                            value={this.state.password}
                            onChange={this.changePassword}/>
                    </div>
                    <div className="form-group">
                        <label> Email: </label>
                        <input placeholder="email" name="email" className="form-control"
                               value={this.state.email} onChange={this.changeEmailHandler}/>
                    </div>

                    <button className="btn btn-success" onClick={this.saveUser}>Save</button>
                </form>
            </div>
        );
    }
}

export default User;