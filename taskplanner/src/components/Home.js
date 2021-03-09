import React, { useEffect, useState } from 'react'
import axios from 'axios';
import Typography from '@material-ui/core/Typography';
import { UsersList } from './UsersList';

export const Home = () => {

    const [users, setusers] = useState([])

    useEffect(() => {

        axios.get("http://daniela-backend.eastus.azurecontainer.io:8080/users")
            .then(response => {
                setusers(response.data);
            }).catch(error => {
                alert("Refused");
            });
    }, [])
    return (
        <div>
            <Typography variant="h3" style={{ textAlign: "center" }}>Users</Typography>
            <br></br>
            <br></br>
            <UsersList list={users}></UsersList>
        </div>
    )
}
