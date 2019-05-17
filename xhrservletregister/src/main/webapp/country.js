var app = new function () {
    var result;
    var countries;
    

    var mode = "";
    var updateidx;

    

    this.getAllCountries = function () {
        countries = {};
        var xhr = new XMLHttpRequest();
        xhr.onreadystatechange = function () {
            if (xhr.readyState == XMLHttpRequest.DONE) {
                if(xhr.responseText.length>0){
                countries = JSON.parse(xhr.responseText);
                }
                // console.log(result);
                // countries = JSON.parse(result);
                console.log(countries);
        this.el = document.getElementById("countries");
        var table_body = '<table border="1" id="example"><thead><tr><th>countryid</th><th>countryname</th></tr></thead><tbody>';
        for (var i in countries) {
            table_body += '<tr>';
            table_body += '<td>';
            table_body += countries[i].countryid;
            table_body += '</td>';
            table_body += '<td>';
            table_body += countries[i].countryname;
            table_body += '</td>';
            table_body += '<td><button onclick="app.editCountry(' + countries[i].countryid + ')">Edit</button></td>';
            table_body += '<td><button onclick="app.deleteCountry(' + countries[i].countryid + ')">Delete</button></td>';
            table_body += '</tr>';
        }
        this.el.innerHTML = table_body;
            }
        }
        xhr.open('GET', '/country', true);
        xhr.send(null);
        

        
    };


    this.insertCountry = function () {
        //console.log("insertCountry");
    }

    this.getCountry = function (countryid) {
        //console.log("getCountry");
    }

    this.editCountry = function (countryid) {
        //console.log("editCountry " + countryid);
        mode = "edit";
        document.getElementById('btn').innerHTML = "Update";
        for (let index = 0; index < countries.length; index++) {
            // const element = array[index];
            //console.log(countries[index].countryid);
            if (countries[index].countryid == countryid) {
                //console.log(countries[index].countryid);
                updateidx = index;
                document.getElementById("countryid").value = countries[index].countryid;
                document.getElementById("countryname").value = countries[index].countryname;
                document.getElementById('countryid').readOnly = true;

            }

        }
    }

    this.deleteCountry = function (countryid) {
        console.log("Delete Data");
    data = { "countryid": countryid };
    var json = JSON.stringify(data);
    console.log(json);
    var request = new XMLHttpRequest();
    request.open("DELETE", "/country", true);
    request.setRequestHeader("Content-type", "application/json"); 
    request.send(json);
        this.getAllCountries();
        

    }

    this.saveorupdate = function (countryid) {

        var countryid = document.getElementById("countryid").value;
        var countryname = document.getElementById('countryname').value;

        if (mode == "") {
            console.log("Post Data");
            data = { "countryid": countryid, "countryname": countryname };
            var json = JSON.stringify(data);
            console.log(json);
            var request = new XMLHttpRequest();
            request.open("POST", "/country", true);
            request.setRequestHeader("Content-type", "application/json"); 
            request.send(json);
        }
        else {
            console.log("Update Data");
            data = { "countryid": countryid, "countryname": countryname };
            var json = JSON.stringify(data);
            var request = new XMLHttpRequest();
            request.open("PUT", "/country", true);
            request.setRequestHeader("Content-type", "application/json"); 
            request.send(json);

            // countries.splice(updateidx, 1, updatecountry);
            document.getElementById('btn').innerHTML = "Add";

        }
        document.getElementById("countryid").value = "";
        document.getElementById("countryname").value = "";
        this.getAllCountries();
    }

};