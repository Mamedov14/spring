const axios = require('axios').default

// GET

/*
axios
    .get('https://fortniteapi.io/v2/items/list', {
        headers: {
            'Content-Type': 'application/json',
            Authorization: 'afcb772b-9087b6e2-c9d08303-587c2bcd',
        },
        params: {
            lang: 'ru'
        },
    })
    .then(response => {
        console.log(response.data);
    })
    .catch(error => {
        console.log(error);
    });
*/

// POST

/*
axios
    .post('https://jsonplaceholder.typicode.com/posts', {
        userId: 1,
        title: 'My title',
        body: 'My body'
    })
    .then(response => {
        console.log(response.data);
    })
    .catch(error => {
        console.log(error);
    });
*/

// АЛЬТЕРНАТИВА использования axios()

axios({
    method: 'POST',
    url: 'https://jsonplaceholder.typicode.com/posts',
    data: {
        userId: 1,
        title: 'My title',
        body: 'My body', // тут обязателно запятая!
    }
}).then(response => {
    console.log(response.data);
}).catch(error => {
    console.log(error);
});



