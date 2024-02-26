$("#form-button1").click(() => {

let url = '' +
    'http://localhost:63342/mywebapp/src/main/resources/templates/html/CustomerList.html';

// Making our request 
fetch(url, { method: 'GET' })
    .then(Result => Result.json())
    .then(string => {

        // Printing our response 
        console.log(string);

        // Printing our field of our response
        console.log(`Title of our response :  ${string.title}`);
    })
    .catch(errorMsg => { console.log(errorMsg); });
    console.log("Button clicked!");
});