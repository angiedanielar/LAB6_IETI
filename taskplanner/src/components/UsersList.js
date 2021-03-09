import React from 'react'
import Box from '@material-ui/core/Box';
import OutlinedCard from './OutlinedCard';

export const UsersList = ({list}) => {

    let results = list.map(user =>
        (<OutlinedCard
            key={user.id}
            id={user.id}
            email={user.email}
            name={user.name}
            password={user.password}
        />));
    
    
    return (
        <div>
             <Box flexWrap="wrap"
                display="flex"
                >
                {results}
            </Box>    
        </div>
    )
}
