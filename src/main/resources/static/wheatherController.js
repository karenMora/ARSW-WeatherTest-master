var wheatherController=function(){
    alert("entro a controller")
    function filterByCity(name) {
        wheatherRestController.getCity(name);
    }

    return {
        filterByCity: filterByCity
    };

}();