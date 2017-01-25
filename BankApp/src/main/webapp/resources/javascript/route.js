// routeProvider is used since we r using ng-route directive (#home/#contact/#about)
//configure our routes
app.config(function ($routeProvider)
{
	$routeProvider
	.when('/home', {											//name of the html page 
		templateUrl :'resources/resources.pages/home.html',		//path of the html page
		controller : 'mainController'							//controller of the html page
	})
	.when('/about', {		
		templateUrl :'resources/resources.pages/about.html', 
		controller : 'aboutController'							
	})
	.when('/contact', {
		templateUrl :'resources/resources.pages/contact.html',
		controller : 'contactController'
	})
	.otherwise({
		templateUrl :'resources/resources.pages/home.html',
		controller : 'mainController'
	});
});
	
//create the controller and inject angular's $scope
app.controller('mainController', function($scope)
{
	// create a display message to view in home.html page 
	$scope.message='Welcome to Home Page';
	});
app.controller('aboutController', function($scope)
		{
			// create a display message to view in about.html page 
			$scope.message='View our Website details here';
			});
app.controller('contactController', function($scope)
		{
			// create a display message to view in contact.html page 
			$scope.message='Contact our Customer Support';
			});
