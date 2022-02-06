
var converter=(function () {

    return {
        connection: function (name, ingresado) {
            var url = 'http://localhost:4567/Converter/' + name + '/' + ingresado
            fetch('http://localhost:4567/Converter/' + name + '/' + ingresado, {
                method: 'GET',
                headers: {
                    "Content-type": "application/json"
                }
            })
                .then(response => response.json())
                .then(json => console.log(json))
        }
    }
})
();
