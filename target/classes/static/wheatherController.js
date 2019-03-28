var wheatherController=function(){
    alert("entro a controller")
    return {
        filterByCity:function (name) {
        alert("entro a controller "+document.getElementById('texto').value);
        wheatherRestController.getCity(name);
    }

    };

}();