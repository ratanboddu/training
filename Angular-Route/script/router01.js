/**
 * for ngRoute use angular-route.js
 */
var myapp=angular.module('mainApp',['ngRoute']);
//$routeProvider will comes from ngRoute
myapp.config(function($routeProvider){
	$routeProvider
		/* #/ */
		.when('/',                            
		{
			template:'<h1>Country : India</h1>'
		})
		/* state */ //use this link state template will come
		.when('/state',						
		{
			template:'<h1>State : Maharashtra </h1>'
		})
		/* state/city */ //use this link city template will come
		.when('/state/city',
		{
			template:'<h1>City : Mumbai</h1>'
		})
		/* #/anything */
		.otherwise({
			redirectTo:'/'   //redirect to /* #/ */
		});
	//$locationProvider.html5Mode(false);
});

