
app.controller("TeamCreateController", function( $scope, $http, $location )
{
	$scope.team = {};
	
	
	$scope.save = function(){
		
		NProgress.configure({ parent: '#main' });
		NProgress.start();
		
		var request = $http.put( CONSTANTS.contextPath + "/services/teams", $scope.team );
		request.success( function( response )
		{
			console.log( response );
			NProgress.done();
			$location.path('/teams');
		} );
		request.error( function( error )
		{
			console.log(error);
			$scope.errorMsg= "Ocurrio un error al ingresar el equipo, intente más tarde";
			$scope.diplayError = true;
			NProgress.done();
		});
	};
	
});