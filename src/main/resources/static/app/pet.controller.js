(function(){
    
    'use strict';
    angular
            .module('app')
            .controller('PetController', PetController);
    
    PetController.$inject = ['$http'];
    
    function PetController($http){
        var vm = this;
        
        vm.pets = [];
        vm.getAll = getAll;
        vm.getFiltered = getFiltered;
        
        init();
        
        function init(){
            getAll();
        }
        
        function getAll(){
            var url = '/pet/all';
            var petRequest = $http.get(url);
            petRequest.then(function(response){
               vm.pets = response.data;
            });
        }
        
        function getFiltered(){
            var url = "/pet/filter/" + 'race2';
            var petRequest = $http.get(url);
            petRequest.then(function(response){
               vm.pets = response.data;
            });
        }
        
    }
    
})();