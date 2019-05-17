var app = new function () {

    var c = [];
    var k;
    // var d = [{ "name": "siva", "id": 2 }, { "name": "sa", "id": 3 }];
    this.FetchAll = function () {

        fetch('http://localhost:9090/country')
            .then(res => res.json())
            .then(data => c = data)
            .then(() => console.log(c))

            .catch(err => {
                console.error(err);
            })
        // app.loaddata();
    };

    this.loaddata = function () {
        alert("loaddata");
        console.log(c);
        // this.el = document.getElementById("countries");
        var data = '';

        for (var i in c) {
            data += '<tr>';
            data += '<td>' + c[i].id + '</td>';
            data += '<td>' + c[i].name + '</td>';
            data += '<td><button onclick="app.Edit(' + c[i].id + ')">Edit</button></td>';
            data += '<td><button onclick="app.Delete(' + c[i].id + ')">Delete</button></td>';
            data += '</tr>';
            data += '<br>';
            data += '<br>';
        }
        alert(data);
        // document.getElementById("countries").innerHTML = data;

    };


}
app.FetchAll();