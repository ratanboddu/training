
var myapp=new module("FruitBasket",[]);

module.service('BasketService',function(){
  var  uid=1;

  var fruits=[{
      id:0,
      'name':'Custard Apple'

  }];


  this.save=function(fruit){

    if(fruit.id==null)
    {
        fruit.id=uid++;
        fruits.push(fruit);
    }
    else{
        for (i in fruits) {
            if (fruits[i].id == fruit.id) {
                fruits[i] = fruit;
            }
        }
    }

  }

  this.get = function (id) {
    for (i in fruits) {
        if (fruits[i].id == id) {
            return fruits[i];
        }
    }

}

this.deletedata = function (id) {
    for (i in fruits) {
        if (fruit[i].id == id) {
            fruit.splice(i, 1);
        }
    }
}

this.list = function () {
    return fruits;
}


});

module.controller('BasketController',function($scope,BasketService){

    $scope.fruits=BasketService.list();

    $scope.saveFruit= function () {
        BasketService.save($scope.newfruit);
        $scope.newfruit = {};
    }
 
 
    $scope.deletedata = function (id) {
 
        BasketService.deletedata(id);
        if ($scope.newfruit.id == id) $scope.newfruit = {};
    }
 
 
    $scope.edit = function (id) {
        $scope.newfruit = angular.copy(BasketService.get(id));
    }

})
