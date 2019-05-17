var app = new function () {

    var c = [];
    // var d = [{ "name": "siva", "id": 2 }, { "name": "sa", "id": 3 }];
    this.FetchAll = function () {

        fetch('http://localhost:9090/country')

            // .then(response => { response.JSON; c = response.JSON })
            // .then(response => { console.log("access") })
            .then(data => console.log(JSON.stringify(data)))
            .catch(err => {
                console.error(err);
            })
    };
    alert(c);

}
app.FetchAll();