/**
 * 
 */
/*--------------------Angular-02-Factory---Generating Random Number-------------------*/
var myapp=angular.module("ServiceApp",[]);


myapp.factory('random', function() {
	
	 return {
	generate: function(){
		
		var num=Math.floor(Math.random()*10);
		return num;
	
	}
	 };
});
myapp.controller("ServiceController", function($scope,random) {
	
	$scope.generateRandom=function(){
		
		$scope.randomNumber=random.generate();
	};
});

/*--------------------Angular-01-Service--ADD/EDIT/DELETE--------------------*/

var module = angular.module('ServiceAppOne', []);

module.service('ContactService', function () {
    //to create unique contact id
    var uid = 1;
     
    //contacts array to hold list of all contacts
    var contacts = [{
        id: 0,
        'name': 'Rahul',
           // 'email': 'rahul.vikash@capgemini.com',
            //'phone': '123456123'
    }];
     
    //save method create a new contact if not already exists
    //else update the existing object
    this.save = function (contact) {
        if (contact.id == null) {
            //if this is new contact, add it in contacts array
            contact.id = uid++;
            contacts.push(contact);
        } else {
            //for existing contact, find this contact using id
            //and update it.
            for (i in contacts) {
                if (contacts[i].id == contact.id) {
                    contacts[i] = contact;
                }
            }
        }
 
    }
 
    //simply search contacts list for given id
    //and returns the contact object if found
    this.get = function (id) {
        for (i in contacts) {
            if (contacts[i].id == id) {
                return contacts[i];
            }
        }
 
    }
     
    //iterate through contacts list and delete 
    //contact if found
    this.deletedata = function (id) {
        for (i in contacts) {
            if (contacts[i].id == id) {
                contacts.splice(i, 1);
            }
        }
    }
 
    //simply returns the contacts list
    this.list = function () {
        return contacts;
    }
});
 
module.controller('ContactController', function ($scope, ContactService) {
 
    $scope.contacts = ContactService.list();
 
    $scope.saveContact = function () {
        ContactService.save($scope.newcontact);
        $scope.newcontact = {};
    }
 
 
    $scope.deletedata = function (id) {
 
        ContactService.deletedata(id);
        if ($scope.newcontact.id == id) $scope.newcontact = {};
    }
 
 
    $scope.edit = function (id) {
        $scope.newcontact = angular.copy(ContactService.get(id));
    }


})