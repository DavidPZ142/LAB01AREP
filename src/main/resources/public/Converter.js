
var converter=(function () {

    return {
        connection: function (name, ingresado) {
            //'http://localhost:4567/Converter/' + name + '/' + ingresado
            
            var url = 'https://temperatureconverterarep.herokuapp.com/Converter/'+name+'/'+ingresado
            fetch('https://temperatureconverterarep.herokuapp.com/Converter/'+name+'/'+ingresado, {
                method: 'GET',
                headers: {
                    "Content-type": "application/json"
                }
            })
                .then(response => response.json())
                .then(json => $('#res').html(json.res))
        }
    }
})
();
