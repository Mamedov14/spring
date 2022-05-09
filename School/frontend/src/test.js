const axios = require('axios').default

axios
    .get('https://fortniteapi.io/v2/items/list?lang=en', {
        headers: {
            'Content-Type': 'application/json',
            Authorization: 'afcb772b-9087b6e2-c9d08303-587c2bcd',
        },
    })
    .then(response => {
        console.log(response.data);
    })
    .catch(error => {
        console.log(error);
    });

