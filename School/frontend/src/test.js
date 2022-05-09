const axios = require('axios').default

axios
    .get('https://fortnite-api.com/v1/banners')
    .then(response => {
        console.log(response.data);
    })
    .catch(error => {
        console.log(error);
    });

