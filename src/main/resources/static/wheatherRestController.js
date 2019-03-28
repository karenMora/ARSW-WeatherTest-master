/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var wheatherRestController=(function(){
    var url = '';
    function getCity(name) {
        return axios.get(url+"/weather"+name).then(function (response) {
            return response.data;
        })
    }

    return {
        
        getCity: getCity
    };
})();

