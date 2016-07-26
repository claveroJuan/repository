app.controller("CanchaCrearController", function( $scope, $http, $location )
{
	$scope.canchas = {};
	
	
	$scope.save = function(){
		
		NProgress.configure({ parent: '#main' });
		NProgress.start();
		
		var request = $http.put( CONSTANTS.contextPath + "/services/canchas", $scope.canchas );
		request.success( function( response )
		{
			console.log( response );
			NProgress.done();
			$location.path('/canchas');
		} );
		request.error( function( error )
		{
			console.log(error);
			$scope.errorMsg= "Ocurrio un error al ingresar canchas, intente más tarde";
			$scope.diplayError = true;
			NProgress.done();
		});
	};
	
});